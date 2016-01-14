/**
 * @(#) XSDToJAXBGenerator.java
 *      Copyright © 2015 - Cognizant Technology Solutions. All rights reserved.
 *      Usage is subject to license terms. Any unauthorized usage will be prosecuted.
 */
package api.bigframework.mappers;

import java.io.File;
import java.io.IOException;

import org.apache.commons.lang3.StringUtils;
import org.apache.xmlbeans.SchemaGlobalElement;
import org.apache.xmlbeans.SchemaTypeSystem;
import org.apache.xmlbeans.XmlBeans;
import org.apache.xmlbeans.XmlObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.xml.sax.InputSource;

import api.bigframework.constants.BigFrameworkConstants;
import api.bigframework.exceptions.BigFrameworkException;

import com.sun.codemodel.JCodeModel;
import com.sun.tools.xjc.BadCommandLineException;
import com.sun.tools.xjc.api.S2JJAXBModel;
import com.sun.tools.xjc.api.XJC;
import com.sun.tools.xjc.api.impl.s2j.SchemaCompilerImpl;

/**
 * Class to the generate the JAXB classes from and input XSD file.
 * 
 * @author Arka Ghosh
 * @since Sep 1, 2015
 * @version 1.0
 */
public class XSDToJAXBGenerator
{
	// Define the logger here
	private static final Logger LOGGER = LoggerFactory.getLogger(XSDToJAXBGenerator.class);

	private String xsdInputDir;
	private String xsdName;
	private String jaxbPackageName;

	/**
	 * Method to generate the JAXB classes for an input XSD file.
	 * 
	 * @throws BigFrameworkException
	 */
	public void generateJaxb() throws BigFrameworkException
	{
		try {
			// Setup schema compiler
			SchemaCompilerImpl sc = (SchemaCompilerImpl) XJC.createSchemaCompiler();
			sc.forcePackageName(getJaxbPackageName());

			// Setup SAX InputSource
			File schemaFile = new File(getSchemaPath());
			InputSource is = new InputSource(schemaFile.toURI().toString());

			sc.getOptions().addGrammar(is);// any grammar will do
			sc.getOptions().parseArguments(new String[] { "-XtoString", "-Xequals", "-XhashCode" });

			// Parse & build
			sc.parseSchema(is);
			S2JJAXBModel model = sc.bind();
			JCodeModel jCodeModel = model.generateCode(null, null);
			jCodeModel.build(new File(BigFrameworkConstants.SOURCE_MAIN_JAVA));

		} catch (IOException | BadCommandLineException exec) {
			LOGGER.error("Error while generating JAXB classes: " + exec);
			throw new BigFrameworkException("Error while generating JAXB classes", exec);
		}
	}

	/**
	 * Method to find the fully classified name of root element. In case of more than one
	 * root element only the first one will be considered.
	 * 
	 * @return fully classified name of root element
	 * @throws BigFrameworkException
	 */
	public String findRootElement() throws BigFrameworkException
	{
		try {
			// Parse the xsd and find the root element
			File schemaFile = new File(getSchemaPath());
			SchemaTypeSystem sts =
					XmlBeans.compileXsd(new XmlObject[] { XmlObject.Factory.parse(schemaFile) }, XmlBeans.getBuiltinTypeSystem(),
							null);
			String rootElement = getJaxbPackageName() + BigFrameworkConstants.DOT;
			for (SchemaGlobalElement element : sts.globalElements()) {
				if (!StringUtils.isEmpty(element.getName().getLocalPart())) {
					rootElement = rootElement + element.getName().getLocalPart();
					break;
				}
			}
			LOGGER.info("Fully classified name of the root element: " + rootElement);
			return rootElement;
		} catch (Exception exec) {
			LOGGER.error("Error while finding the root element: " + exec);
			throw new BigFrameworkException("Error while finding the root element", exec);
		}
	}

	/**
	 * Method to get the full path the schema definition file
	 * 
	 * @return
	 */
	private String getSchemaPath()
	{
		return BigFrameworkConstants.SOURCE_MAIN_RESOURCES + getXsdInputDir() + getXsdName();
	}

	/**
	 * Method to access xsdInputDir
	 * 
	 * @return the xsdInputDir
	 */
	private String getXsdInputDir()
	{
		return xsdInputDir;
	}

	/**
	 * Method to access xsdName
	 * 
	 * @return the xsdName
	 */
	private String getXsdName()
	{
		return xsdName;
	}

	/**
	 * Method to access jaxbPackageName
	 * 
	 * @return the jaxbPackageName
	 */
	private String getJaxbPackageName()
	{
		return jaxbPackageName;
	}

	/**
	 * Method to mutate xsdInputDir.
	 * 
	 * @param xsdInputDir the xsdInputDir to set
	 */
	public void setXsdInputDir(String xsdInputDir)
	{
		this.xsdInputDir = xsdInputDir;
	}

	/**
	 * Method to mutate xsdName.
	 * 
	 * @param xsdName the xsdName to set
	 */
	public void setXsdName(String xsdName)
	{
		this.xsdName = xsdName;
	}

	/**
	 * Method to mutate jaxbPackageName.
	 * 
	 * @param jaxbPackageName the jaxbPackageName to set
	 */
	public void setJaxbPackageName(String jaxbPackageName)
	{
		this.jaxbPackageName = jaxbPackageName;
	}
}
