/**
 * @(#) CFToEntityCreator.java
 *      Copyright © 2015 - Cognizant Technology Solutions. All rights reserved.
 *      Usage is subject to license terms. Any unauthorized usage will be prosecuted.
 */
package api.bigframework.mappers;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import javax.lang.model.element.Modifier;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import api.bigframework.cassandra.ColumnDefinition;
import api.bigframework.cassandra.ColumnFamilyDefinition;
import api.bigframework.constants.BigFrameworkConstants;
import api.bigframework.exceptions.BigFrameworkException;
import api.bigframework.utils.APIStringUtils;
import api.bigframework.utils.AnnotationHelper;
import api.bigframework.utils.JavaFileModifier;
import api.bigframework.utils.LombokHelper;

import com.squareup.javapoet.FieldSpec;
import com.squareup.javapoet.JavaFile;
import com.squareup.javapoet.TypeSpec;

/**
 * Class to process the column family definition present in a directory and generate
 * corresponding entity classes from them.
 * 
 * @author Arka Ghosh
 * @since Aug 21, 2015
 * @version 1.0
 */
public class CFToEntityCreator
{
	// Define the logger here
	private static final Logger LOGGER = LoggerFactory.getLogger(CFToEntityCreator.class);

	// fields to be initialized through spring
	private JavaFileModifier javaFileModifier;
	private String entityPackageName;
	private String cfDirectory;

	private Map<Map<String, String>, Map<String, String>> dozerMapping =
			new HashMap<Map<String, String>, Map<String, String>>();

	/**
	 * The entry point of this entity creation utility.
	 * 
	 * @param cfDirectory - the directory of the column families
	 * @return the dozer mapping
	 * @throws BigFrameworkException
	 */
	public Map<Map<String, String>, Map<String, String>> createEntitiesFromCF(
			Map<Map<String, String>, Map<String, String>> entityCanonicalMapping) throws BigFrameworkException
	{
		File cfDir = new File(BigFrameworkConstants.SOURCE_MAIN_RESOURCES + getCfDirectory());
		createEntitiesFromPath(cfDir, entityCanonicalMapping);
		String directory = BigFrameworkConstants.SOURCE_MAIN_JAVA + "/" + getEntityPackageName().replaceAll("\\.", "/");
		LOGGER.info("Entity directory: " + directory);
		try {
			LombokHelper.deLombok(directory);
			getJavaFileModifier().modifyEntitiesFromPath(directory);
		} catch (BigFrameworkException exec) {
			LOGGER.error("Error while modifying the entities: " + exec);
			throw new BigFrameworkException("Error while modifying the entities: ", exec);
		}
		return dozerMapping;
	}

	/**
	 * Method to process the input path and to read all the column families present inside
	 * it.
	 * 
	 * @param cfDir - the input file/directory
	 */
	private void createEntitiesFromPath(File cfDir, Map<Map<String, String>, Map<String, String>> entityCanonicalMapping)
	{
		if (cfDir.isFile()) {
			createEntityFile(cfDir, entityCanonicalMapping);
		} else if (cfDir.isDirectory()) {
			for (File cfFile : cfDir.listFiles()) {
				createEntitiesFromPath(cfFile, entityCanonicalMapping);
			}
		} else {
			LOGGER.error(cfDir.getAbsolutePath() + " is neither a file nor a directoty :-0");
		}
	}

	/**
	 * Method to create and entity from an input CQL file
	 * 
	 * @param cfFile - input column family definition CQL file
	 */
	private void createEntityFile(File cfFile, Map<Map<String, String>, Map<String, String>> entityCanonicalMapping)
	{
		try {
			// Create the java column family definition and the entity class name
			ColumnFamilyDefinition definition = ColumnFamilyDefinition.parse(cfFile);
			String entityClassName = APIStringUtils.toJavaClassNameFormat(definition.getName()) + "Entity";

			Map<String, String> canonicalCfMap = null;
			Map<String, String> classNameMap = new HashMap<String, String>();
			Map<String, String> dozerFieldMap = new HashMap<String, String>();
			if (entityCanonicalMapping != null) {
				for (Entry<Map<String, String>, Map<String, String>> entry : entityCanonicalMapping.entrySet()) {
					for (Entry<String, String> subEntry : entry.getKey().entrySet()) {
						if (definition.getName().equalsIgnoreCase(subEntry.getKey())) {
							classNameMap.put(getEntityPackageName() + BigFrameworkConstants.DOT + entityClassName,
									subEntry.getValue());
							canonicalCfMap = entry.getValue();
						}
					}
				}
			}

			// Create the class builder and add the required annotations and fields to it
			TypeSpec.Builder classBuilder = TypeSpec.classBuilder(entityClassName);
			classBuilder.addAnnotation(AnnotationHelper.getTableAnnotation(definition.getName()));
			classBuilder.addAnnotation(LombokHelper.getLombokDataAnnotation());
			classBuilder.addJavadoc(BigFrameworkConstants.FORMAT_LITERAL,
					String.format(BigFrameworkConstants.ENTITY_CLASS_COMMENT, definition.getName()));
			for (ColumnDefinition columnDef : definition.getColumns()) {
				if (canonicalCfMap != null) {
					for (Entry<String, String> entry : canonicalCfMap.entrySet()) {
						if (columnDef.getDatabaseFieldName().equalsIgnoreCase(entry.getKey())) {
							dozerFieldMap.put(columnDef.getEntityFieldName(), entry.getValue());
						}
					}
				}
				createEntityField(classBuilder, columnDef);
			}
			dozerMapping.put(classNameMap, dozerFieldMap);
			/*
			 * Finally, create the java file builder i.e. the compilation unit and write the
			 * file
			 */
			JavaFile.Builder javaFileBuilder = JavaFile.builder(getEntityPackageName(), classBuilder.build());
			javaFileBuilder.skipJavaLangImports(true);
			javaFileBuilder.build().writeTo(new File(BigFrameworkConstants.SOURCE_MAIN_JAVA));
		} catch (IOException | BigFrameworkException exec) {
			LOGGER.error("Error while creating the entity class: " + exec);
		}
	}

	/**
	 * Method to create an entity field from the column family definition.
	 * 
	 * @param classBuilder - the class builder
	 * @param columnDef - the column definition
	 */
	private void createEntityField(TypeSpec.Builder classBuilder, ColumnDefinition columnDef)
	{
		FieldSpec.Builder fieldBuilder =
				FieldSpec.builder(columnDef.getEntityDataType(), columnDef.getEntityFieldName(), Modifier.PRIVATE);
		fieldBuilder.addAnnotation(AnnotationHelper.getColumnAnnotation(columnDef.getDatabaseFieldName()));
		fieldBuilder.addAnnotation(AnnotationHelper.getFieldAnnotation(columnDef.getDatabaseFieldName()));
		if (columnDef.isPartitionKey()) {
			fieldBuilder.addAnnotation(AnnotationHelper.getPartitionKeyAnnotation(columnDef.getPartitionKeyOrdinal()));
		}
		classBuilder.addField(fieldBuilder.build());
	}

	/**
	 * Method to access javaFileModifier
	 * 
	 * @return the javaFileModifier
	 */
	private JavaFileModifier getJavaFileModifier()
	{
		return javaFileModifier;
	}

	/**
	 * Method to mutate javaFileModifier.
	 * 
	 * @param javaFileModifier the javaFileModifier to set
	 */
	public void setJavaFileModifier(JavaFileModifier javaFileModifier)
	{
		this.javaFileModifier = javaFileModifier;
	}

	/**
	 * Method to access entityPackageName
	 * 
	 * @return the entityPackageName
	 */
	private String getEntityPackageName()
	{
		return entityPackageName;
	}

	/**
	 * Method to mutate entityPackageName.
	 * 
	 * @param entityPackageName the entityPackageName to set
	 */
	public void setEntityPackageName(String entityPackageName)
	{
		this.entityPackageName = entityPackageName;
	}

	/**
	 * Method to access cfDirectory
	 * 
	 * @return the cfDirectory
	 */
	private String getCfDirectory()
	{
		return cfDirectory;
	}

	/**
	 * Method to mutate cfDirectory.
	 * 
	 * @param cfDirectory the cfDirectory to set
	 */
	public void setCfDirectory(String cfDirectory)
	{
		this.cfDirectory = cfDirectory;
	}

}
