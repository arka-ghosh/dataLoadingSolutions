/**
 * @(#) ColumnFamilyDefinition.java
 *      Copyright © 2015 - Cognizant Technology Solutions. All rights reserved.
 *      Usage is subject to license terms. Any unauthorized usage will be prosecuted.
 */
package api.bigframework.cassandra;

import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.InetAddress;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.UUID;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import api.bigframework.constants.BigFrameworkConstants;
import api.bigframework.exceptions.BigFrameworkException;
import api.bigframework.utils.APIStringUtils;

import com.squareup.javapoet.ClassName;
import com.squareup.javapoet.ParameterizedTypeName;
import com.squareup.javapoet.TypeName;
import com.squareup.javapoet.WildcardTypeName;

/**
 * A Cassandra column family definition in Java.
 * 
 * @author Arka Ghosh
 * @since Aug 18, 2015
 * @version 1.0
 */
public class ColumnFamilyDefinition
{
	// Define the logger here
	private static final Logger LOGGER = LoggerFactory.getLogger(ColumnFamilyDefinition.class);

	private final String keyspace;
	private final String name;
	private final List<ColumnDefinition> columns;

	/**
	 * Mapping between the DataStax Cassandra field data types and their corresponding Java
	 * equivalent data types.
	 */
	private static final Map<String, TypeName> cassandraDataTypeMap = new HashMap<String, TypeName>();
	static {
		cassandraDataTypeMap.put("ascii", TypeName.get(String.class));
		cassandraDataTypeMap.put("bigint", TypeName.LONG);
		cassandraDataTypeMap.put("blob", TypeName.get(ByteBuffer.class));
		cassandraDataTypeMap.put("boolean", TypeName.BOOLEAN);
		cassandraDataTypeMap.put("counter", TypeName.LONG);
		cassandraDataTypeMap.put("decimal", TypeName.get(BigDecimal.class));
		cassandraDataTypeMap.put("double", TypeName.DOUBLE);
		cassandraDataTypeMap.put("float", TypeName.FLOAT);
		cassandraDataTypeMap.put("inet", TypeName.get(InetAddress.class));
		cassandraDataTypeMap.put("int", TypeName.INT);
		cassandraDataTypeMap.put("list", TypeName.get(List.class));
		cassandraDataTypeMap.put("map", TypeName.get(Map.class));
		cassandraDataTypeMap.put("set", TypeName.get(Set.class));
		cassandraDataTypeMap.put("text", TypeName.get(String.class));
		cassandraDataTypeMap.put("timestamp", TypeName.get(Date.class));
		cassandraDataTypeMap.put("timeuuid", TypeName.get(UUID.class));
		cassandraDataTypeMap.put("uuid", TypeName.get(UUID.class));
		cassandraDataTypeMap.put("varchar", TypeName.get(String.class));
		cassandraDataTypeMap.put("varint", TypeName.get(BigInteger.class));
	}

	/**
	 * Mapping between the user defined types in Cassandra and their equivalent Java
	 * classes.
	 */
	private static final Map<String, TypeName> cassandraUDTMap = new HashMap<String, TypeName>();
	static {
		// sample mapping. Need to derive it during runtime
		cassandraUDTMap.put("string", ClassName.get(String.class));
	}

	/**
	 * Private constructor to prevent instantiation from outside this class.
	 * 
	 * @param keyspace - the name of the key space
	 * @param name - the name of the column family
	 * @param columns - the details of the columns
	 */
	private ColumnFamilyDefinition(String keyspace, String name, List<ColumnDefinition> columns)
	{
		this.keyspace = keyspace;
		this.name = name;
		this.columns = columns;
	}

	/**
	 * Method to parse the column family definition into java format
	 * 
	 * @param cfDefinition - the .cql definition file
	 * @return - <code>ColumnFamilyDefinition</code> for the input .cql file
	 * @throws BigFrameworkException
	 */
	public static ColumnFamilyDefinition parse(File cfDefinition) throws BigFrameworkException
	{
		try {
			String fileString = FileUtils.readFileToString(cfDefinition).trim();
			if (!StringUtils.isEmpty(fileString)) {
				int headerEndIndex = fileString.indexOf(BigFrameworkConstants.BRACKET_OPEN);
				int keyStartIndex = fileString.indexOf(BigFrameworkConstants.PRIMARY_KEY);

				String cfHeader = fileString.substring(0, headerEndIndex).trim();
				cfHeader = generateHeader(cfHeader);

				// Find the key space and column family name by splitting the header.
				String[] ksAndName = cfHeader.split(BigFrameworkConstants.DOT);
				String cfName = StringUtils.EMPTY;
				String ksName = StringUtils.EMPTY;
				if (ksAndName != null && ksAndName.length == 1) {
					cfName = APIStringUtils.toProperCase(StringUtils.trimToEmpty(ksAndName[0]));
				} else if (ksAndName != null && ksAndName.length == 2) {
					ksName = APIStringUtils.toProperCase(StringUtils.trimToEmpty(ksAndName[0]));
					cfName = APIStringUtils.toProperCase(StringUtils.trimToEmpty(ksAndName[1]));
				} else {
					cfName = cfHeader;
				}

				/*
				 * Now process the last line of the file. This line will contain the information
				 * about the primary keys and the clustering columns of that column family.
				 */
				String cfKeyDesc = fileString.substring(keyStartIndex, fileString.length()).trim();
				Map<String, Integer> partitionKey = parsePartitionKeys(cfKeyDesc);

				/* At last, process the fields and create the column definitions */
				String fieldString = fileString.substring(headerEndIndex + 1, keyStartIndex).trim();
				List<ColumnDefinition> columnDetails = generateFields(partitionKey, fieldString);

				return new ColumnFamilyDefinition(ksName, cfName, columnDetails);
			} else {
				LOGGER.info("Column family definition is blank");
				return null;
			}
		} catch (IOException exec) {
			throw new BigFrameworkException(exec);
		}
	}

	/**
	 * Method to generate the fields
	 * 
	 * @param partitionKey - the partition key details
	 * @param fieldString - the field details
	 * @return <code>List</code> of <code>ColumnDefinition</code>
	 */
	private static List<ColumnDefinition> generateFields(Map<String, Integer> partitionKey, String fieldString)
	{
		List<ColumnDefinition> columnDetails = new ArrayList<ColumnDefinition>();
		for (String line : fieldString.split(StringUtils.LF)) {
			if (!StringUtils.isEmpty(line)) {
				String[] fieldAndType = StringUtils.stripEnd(line.trim(), BigFrameworkConstants.COMMA).split(StringUtils.SPACE);
				String entityFieldName = APIStringUtils.toJavaCamelCase(fieldAndType[0]);
				TypeName entityDataType = processFieldDataType(fieldAndType[1]);
				ColumnDefinition columnDefinition = new ColumnDefinition(entityFieldName, fieldAndType[0], entityDataType);
				for (Entry<String, Integer> entry : partitionKey.entrySet()) {
					if (entry.getKey().equalsIgnoreCase(entityFieldName)) {
						columnDefinition.setPartitionKey(true);
						columnDefinition.setPartitionKeyOrdinal(entry.getValue());
						break;
					}
				}
				columnDetails.add(columnDefinition);
			}
		}
		return columnDetails;
	}

	/**
	 * Method to process the field data type
	 * 
	 * @param fieldDataType - raw field data type
	 * @return - the generated field <code>TypeName</code>
	 */
	private static TypeName processFieldDataType(String fieldDataType)
	{
		TypeName entityDataType = null;

		// Contains generic
		if (fieldDataType.contains(BigFrameworkConstants.ANGLE_BRACKET_OPEN)) {
			int angleBracketOpenIndex = fieldDataType.indexOf(BigFrameworkConstants.ANGLE_BRACKET_OPEN);
			int angleBracketCloseIndex = fieldDataType.indexOf(BigFrameworkConstants.ANGLE_BRACKET_CLOSE);
			String[] genericTypes =
					fieldDataType.substring(angleBracketOpenIndex + 1, angleBracketCloseIndex).trim()
							.split(BigFrameworkConstants.COMMA);
			fieldDataType = fieldDataType.substring(0, angleBracketOpenIndex).trim();
			List<TypeName> genericDataTypes = new ArrayList<TypeName>();
			TypeName rawDataType = null;

			// The raw type is NOT an UDT
			if (cassandraDataTypeMap.keySet().contains(fieldDataType)) {
				rawDataType = cassandraDataTypeMap.get(fieldDataType);
				for (String genericType : genericTypes) {
					// Simple generic
					if (cassandraDataTypeMap.keySet().contains(genericType.trim())) {
						genericDataTypes.add(cassandraDataTypeMap.get(genericType.trim()).box());
					}
					// UDT generic
					else {
						genericDataTypes.add(cassandraUDTMap.get(genericType.trim()));
					}
				}
			}
			// The raw type is an UDT!!!
			else {
				rawDataType = cassandraUDTMap.get(fieldDataType);
				for (String genericType : genericTypes) {
					// Simple generic
					if (cassandraDataTypeMap.keySet().contains(genericType.trim())) {
						genericDataTypes.add(cassandraDataTypeMap.get(genericType.trim()).box());
					}
					// UDT generic
					else {
						genericDataTypes.add(cassandraUDTMap.get(genericType.trim()));
					}
				}
			}
			TypeName[] genericArray = {};
			// entityDataType =
			// ParameterizedTypeName.get((ClassName) rawDataType,
			// genericDataTypes.stream().toArray(TypeName[]::new));
			entityDataType = ParameterizedTypeName.get((ClassName) rawDataType, genericDataTypes.toArray(genericArray));
		}
		// Does not contain generic
		else {
			if (cassandraDataTypeMap.keySet().contains(fieldDataType)) {
				// Not an UDT
				entityDataType = cassandraDataTypeMap.get(fieldDataType);
				if (fieldDataType.equalsIgnoreCase("list") || fieldDataType.equalsIgnoreCase("set")) {
					entityDataType =
							ParameterizedTypeName.get((ClassName) entityDataType, WildcardTypeName.subtypeOf(TypeName.OBJECT));
				} else if (fieldDataType.equalsIgnoreCase("map")) {
					entityDataType =
							ParameterizedTypeName.get((ClassName) entityDataType, WildcardTypeName.subtypeOf(TypeName.OBJECT),
									WildcardTypeName.subtypeOf(TypeName.OBJECT));
				}
			} else {
				// Yes, its UDT!!
				entityDataType = cassandraUDTMap.get(fieldDataType);
			}
		}
		return entityDataType;
	}

	/**
	 * Method to extract partition key details
	 * 
	 * @param cfKeyDesc - raw partition key string
	 * @return - partition key details
	 */
	private static Map<String, Integer> parsePartitionKeys(String cfKeyDesc)
	{
		cfKeyDesc =
				APIStringUtils.remove(cfKeyDesc, BigFrameworkConstants.PRIMARY_KEY, BigFrameworkConstants.BRACKET_OPEN,
						BigFrameworkConstants.BRACKET_CLOSE, BigFrameworkConstants.SEMI_COLON);
		int orderOfKey = 0;
		String[] partitionKeys = cfKeyDesc.trim().split(BigFrameworkConstants.COMMA);
		Map<String, Integer> partitionKey = new HashMap<String, Integer>();
		for (String key : partitionKeys) {
			partitionKey.put(APIStringUtils.toJavaCamelCase(key), Integer.valueOf(orderOfKey));
			orderOfKey++;
		}
		return partitionKey;
	}

	/**
	 * Method to generate the header
	 * 
	 * @param cfHeader - header raw string
	 * @return - extracted header
	 */
	private static String generateHeader(String cfHeader)
	{
		if (cfHeader.contains(BigFrameworkConstants.CREATE_TABLE_LONG)) {
			cfHeader = StringUtils.remove(cfHeader, BigFrameworkConstants.CREATE_TABLE_LONG);
		} else if (cfHeader.contains(BigFrameworkConstants.CREATE_TABLE_SHORT)) {
			cfHeader = StringUtils.remove(cfHeader, BigFrameworkConstants.CREATE_TABLE_SHORT);
		} else {
			LOGGER.error("Error!! Error!!!");
		}
		return cfHeader.trim();
	}

	/**
	 * Method to access columns
	 * 
	 * @return the columns
	 */
	public List<ColumnDefinition> getColumns()
	{
		return columns;
	}

	/**
	 * Method to access keyspace
	 * 
	 * @return the keyspace
	 */
	public String getKeyspace()
	{
		return keyspace;
	}

	/**
	 * Method to access name
	 * 
	 * @return the name
	 */
	public String getName()
	{
		return name;
	}

}
