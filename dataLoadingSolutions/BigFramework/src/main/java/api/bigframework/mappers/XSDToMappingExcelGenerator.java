/**
 * @(#) XSDToExcelGenerator.java
 *      Copyright © 2015 - Cognizant Technology Solutions. All rights reserved.
 *      Usage is subject to license terms. Any unauthorized usage will be prosecuted.
 */
package api.bigframework.mappers;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.DataValidation;
import org.apache.poi.ss.usermodel.DataValidationConstraint;
import org.apache.poi.ss.usermodel.DataValidationHelper;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.ss.util.CellRangeAddressList;
import org.apache.poi.ss.util.RegionUtil;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFDataValidationHelper;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.xmlbeans.SchemaGlobalElement;
import org.apache.xmlbeans.SchemaProperty;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SchemaTypeSystem;
import org.apache.xmlbeans.XmlBeans;
import org.apache.xmlbeans.XmlException;
import org.apache.xmlbeans.XmlObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import api.bigframework.constants.BigFrameworkConstants;
import api.bigframework.exceptions.BigFrameworkException;

/**
 * @author Arka Ghosh
 * @since Sep 8, 2015
 * @version 1.0
 */
public class XSDToMappingExcelGenerator
{
	// Define the logger here
	private static final Logger LOGGER = LoggerFactory.getLogger(XSDToMappingExcelGenerator.class);

	// fields to be initialized through spring
	private String xsdInputDir;
	private String xsdName;
	private String xlsOutPath;
	private String xlsFileName;
	private String[] columnFamilyNames;
	private Map<String, String> cassandraDataTypeMap;
	private String jaxbPackageName;

	// Define the excel related global fields.
	private XSSFWorkbook workbook = new XSSFWorkbook();
	private int rowIndex;
	// style indices
	private int tableHeaderStyleIndex;
	private int cfNameCellStyleIndex;
	private int editableCellStyleIndex;

	/**
	 * Method to generate the flat excel spreadsheet from the schema definition.
	 * 
	 * @throws BigFrameworkException
	 */
	public void generateExcel() throws BigFrameworkException
	{
		try {
			File schemaFile = new File(getSchemaPath());
			SchemaTypeSystem sts =
					XmlBeans.compileXsd(new XmlObject[] { XmlObject.Factory.parse(schemaFile) }, XmlBeans.getBuiltinTypeSystem(),
							null);

			// Create the cell styles
			createCellStyles();

			for (String columnFamilyName : getColumnFamilyNames()) {
				rowIndex = 4;
				boolean isElement = false;
				Class<?> clazz = null;
				try {
					clazz = Class.forName(getJaxbPackageName() + BigFrameworkConstants.DOT + columnFamilyName);
				} catch (Exception exec) {
					LOGGER.debug("You have provided an element name as the colum family root class name: " + columnFamilyName,
							exec);
					isElement = true;
				}

				XSSFSheet sheet = workbook.createSheet(columnFamilyName);
				/*
				 * find the root elements
				 */
				for (SchemaGlobalElement element : sts.globalElements()) {
					if (columnFamilyName.equalsIgnoreCase(element.getName().getLocalPart())) {
						processElement(sheet, columnFamilyName, element.getType(), StringUtils.EMPTY);
					} else {
						SchemaType rootElementType = findRootElement(columnFamilyName, element.getType());
						if (rootElementType != null) {
							if (isElement) {
								clazz = findRootElementClass(rootElementType, StringUtils.EMPTY);
							}
							processElement(sheet, columnFamilyName, rootElementType, StringUtils.EMPTY);
						} else {
							LOGGER.error("You have provided a wrong input as the colum family root class name: " + columnFamilyName);
							throw new BigFrameworkException("You have provided a wrong input as the colum family root class name: "
									+ columnFamilyName);
						}
					}
				}

				if (clazz != null) {
					createHeaderRow(sheet, columnFamilyName, clazz.getName());
				} else {
					createHeaderRow(sheet, columnFamilyName, "");
				}
				createKeyTypeColumn(sheet);
				styleSheet(sheet);
			}
			File output = new File(getXlsPath());
			output.mkdirs();
			workbook.lockStructure();
			workbook.write(new FileOutputStream(getFullXlsFileName()));
		} catch (XmlException | IOException exec) {
			LOGGER.error("Error while generating excel spreadsheet.");
			throw new BigFrameworkException("Error while generating excel spreadsheet.", exec);
		}
	}

	/**
	 * Method to style workbook
	 * 
	 * @param sheet - the <code>XSSFSheet</code> to work on
	 */
	private void styleSheet(XSSFSheet sheet)
	{
		sheet.autoSizeColumn(0);
		sheet.autoSizeColumn(1);
		sheet.autoSizeColumn(2);
		sheet.createFreezePane(0, 4);

		styleRegion(sheet, new CellRangeAddress(3, 3, 0, 3));
		styleRegion(sheet, new CellRangeAddress(4, rowIndex - 1, 0, 3));
		styleRegion(sheet, new CellRangeAddress(0, 1, 0, 1));
	}

	/**
	 * Method to style regions
	 * 
	 * @param sheet - the <code>XSSFSheet</code> to work on
	 * @param region - the <code>CellRangeAddress</code> to work on
	 */
	private void styleRegion(XSSFSheet sheet, CellRangeAddress region)
	{
		RegionUtil.setBorderBottom(CellStyle.BORDER_MEDIUM, region, sheet, workbook);
		RegionUtil.setBorderTop(CellStyle.BORDER_MEDIUM, region, sheet, workbook);
		RegionUtil.setBorderLeft(CellStyle.BORDER_MEDIUM, region, sheet, workbook);
		RegionUtil.setBorderRight(CellStyle.BORDER_MEDIUM, region, sheet, workbook);
	}

	/**
	 * Method to find out the root element <code>SchemaType</code>
	 * 
	 * @param cfName - column family name
	 * @param elementType - the <code>SchemaType</code>
	 * @return the root element <code>SchemaType</code>
	 */
	private SchemaType findRootElement(String cfName, SchemaType elementType)
	{
		if (elementType.getName() != null && cfName.equalsIgnoreCase(elementType.getName().getLocalPart())) {
			return elementType;
		} else {
			for (SchemaProperty elementProperty : elementType.getElementProperties()) {
				if (cfName.equalsIgnoreCase(elementProperty.getName().getLocalPart())) {
					return elementProperty.getType();
				} else {
					SchemaType type = findRootElement(cfName, elementProperty.getType());
					if (type != null) {
						return type;
					}
				}
			}
			return null;
		}
	}

	/**
	 * Find the root element class for a given column family name
	 * 
	 * @param elementType - the <code>SchemaType</code>
	 * @param columnFamilyNamecolumnFamilyName - the column family name
	 * @return the root element class
	 */
	private Class<?> findRootElementClass(SchemaType elementType, String columnFamilyName)
	{
		String localName = StringUtils.EMPTY;
		if (elementType != null && elementType.getContainerField() != null
				&& elementType.getContainerField().getName() != null) {
			localName = StringUtils.capitalize(elementType.getContainerField().getName().getLocalPart());
		} else if (elementType != null && elementType.getName() != null) {
			localName = StringUtils.capitalize(elementType.getName().getLocalPart());
		}
		if (StringUtils.EMPTY.equalsIgnoreCase(columnFamilyName)) {
			columnFamilyName = localName;
		} else {
			columnFamilyName = localName + "$" + columnFamilyName;
		}
		try {
			return Class.forName(getJaxbPackageName() + BigFrameworkConstants.DOT + columnFamilyName);
		} catch (Exception exec) {
			return findRootElementClass(elementType.getOuterType(), columnFamilyName);
		}
	}

	/**
	 * Recursive method to process each and every complex types present in the input schema
	 * definition
	 * 
	 * @param sheet - the <code>XSSFSheet</code> to work on
	 * @param cfName - the column family name
	 * @param elementType - the <code>SchemaType</code>
	 * @param canonicalPath - the canonical path of the field
	 */
	private void processElement(XSSFSheet sheet, String cfName, SchemaType elementType, String canonicalPath)
	{
		if (elementType.getName() != null && !cfName.equalsIgnoreCase(elementType.getName().getLocalPart())
				&& getColumnFamilyNames().contains(elementType.getName().getLocalPart())) {
			// Do not proceed as this element will be processed in another excel sheet.
			return;
		} else {
			for (SchemaProperty elementProperty : elementType.getElementProperties()) {
				// Build the canonical path for the current element
				String elementTypeCanonicalPath = StringUtils.EMPTY;
				if (StringUtils.EMPTY.equals(canonicalPath)) {
					elementTypeCanonicalPath = elementProperty.getName().getLocalPart();
				} else {
					elementTypeCanonicalPath =
							canonicalPath + BigFrameworkConstants.DOT + elementProperty.getName().getLocalPart();
				}

				/*
				 * Check whether the current element is a list or not. If it's a list, then check
				 * further whether it has any children. If it has, then it should be a list of
				 * UDTs(text where UDT is not supported). Otherwise it should be a list of xml
				 * primitive data types. If its not a list then go on with the recursion or create
				 * a row in case of a leaf node.
				 */
				if (elementProperty.getMaxOccurs() == null || elementProperty.getMaxOccurs().intValue() > 1) {
					// It's a list
					if (elementProperty.getType().getName() != null
							&& !cfName.equalsIgnoreCase(elementProperty.getType().getName().getLocalPart())
							&& getColumnFamilyNames().contains(elementProperty.getType().getName().getLocalPart())) {
						// Do not proceed as this element will be processed in another excel sheet.
						continue;
					} else {
						if (elementProperty.getType().getElementProperties() != null
								&& elementProperty.getType().getElementProperties().length > 0) {
							createRow(sheet, elementTypeCanonicalPath, elementTypeCanonicalPath.replaceAll("\\.", "_"), "list<text>");
						} else {
							createRow(sheet, elementTypeCanonicalPath, elementTypeCanonicalPath.replaceAll("\\.", "_"), "list<"
									+ processDataType(elementProperty.getType()) + ">");
						}
					}
				} else {
					// Not a list, so check the child elements and recurse if required
					if (elementProperty.getType().getElementProperties() != null
							&& elementProperty.getType().getElementProperties().length > 0) {
						// not a leaf node. Go beyond.
						processElement(sheet, cfName, elementProperty.getType(), elementTypeCanonicalPath);
					}
					// the leaf node
					else {
						createRow(sheet, elementTypeCanonicalPath, elementTypeCanonicalPath.replaceAll("\\.", "_"),
								processDataType(elementProperty.getType()));
					}
				}
			}
		}
	}

	/**
	 * Method to find the data type of a field
	 * 
	 * @param dataType - the <code>SchemaType</code>
	 * @return - the string data type
	 */
	private String processDataType(SchemaType dataType)
	{
		String dataTypeString = StringUtils.EMPTY;
		if (dataType.getName() != null
				&& BigFrameworkConstants.XML_NAMESPACE_URI.equalsIgnoreCase(dataType.getName().getNamespaceURI())) {
			dataTypeString = dataType.getName().getLocalPart();
		} else {
			dataTypeString = processDataType(dataType.getBaseType());
		}
		return getCassandraDataTypeMap().containsKey(dataTypeString) ? getCassandraDataTypeMap().get(dataTypeString)
				: "text";
	}

	/**
	 * Method to create different cell styles for the workbook.
	 */
	private void createCellStyles()
	{

		// Create the header cell style
		XSSFCellStyle tableHeaderCellStyle = workbook.createCellStyle();
		XSSFFont tableHeaderFont = workbook.createFont();
		tableHeaderFont.setBold(true);
		tableHeaderFont.setColor(IndexedColors.DARK_TEAL.index);
		tableHeaderCellStyle.setFont(tableHeaderFont);
		tableHeaderCellStyle.setAlignment(CellStyle.ALIGN_CENTER);
		tableHeaderCellStyle.setBorderBottom(CellStyle.BORDER_THICK);
		tableHeaderCellStyle.setBorderTop(CellStyle.BORDER_THICK);
		tableHeaderCellStyle.setFillForegroundColor(IndexedColors.PALE_BLUE.index);
		tableHeaderCellStyle.setFillPattern(CellStyle.SOLID_FOREGROUND);
		tableHeaderStyleIndex = tableHeaderCellStyle.getIndex();

		// create the group cell style
		XSSFCellStyle cfNameCellStyle = workbook.createCellStyle();
		XSSFFont cfNameCellFont = workbook.createFont();
		cfNameCellFont.setBold(true);
		cfNameCellFont.setColor(IndexedColors.INDIGO.index);
		cfNameCellStyle.setFont(cfNameCellFont);
		cfNameCellStyleIndex = cfNameCellStyle.getIndex();

		// create the editable field style
		XSSFCellStyle editableCellStyle = workbook.createCellStyle();
		editableCellStyle.setFillForegroundColor(IndexedColors.LIGHT_GREEN.index);
		editableCellStyle.setFillPattern(CellStyle.SOLID_FOREGROUND);
		editableCellStyleIndex = editableCellStyle.getIndex();
	}

	/**
	 * Method to create the header row
	 * 
	 * @param sheet - the <code>XSSFSheet</code> to work on
	 * @param cfName - the column family name
	 * @param rootClass - the JAXB root class name for that column family
	 */
	private void createHeaderRow(XSSFSheet sheet, String cfName, String rootClass)
	{
		XSSFRow xssfRow1 = sheet.createRow(0);
		XSSFCell xssfCellA1 = xssfRow1.createCell(0, Cell.CELL_TYPE_STRING);
		xssfCellA1.setCellValue("Column Family Name →");
		xssfCellA1.setCellStyle(workbook.getCellStyleAt(cfNameCellStyleIndex));
		XSSFRow xssfRow2 = sheet.createRow(1);
		XSSFCell xssfCellA2 = xssfRow2.createCell(0, Cell.CELL_TYPE_STRING);
		xssfCellA2.setCellValue("Root JAXB Class →");
		xssfCellA2.setCellStyle(workbook.getCellStyleAt(cfNameCellStyleIndex));
		XSSFCell xssfCellB1 = xssfRow1.createCell(1, Cell.CELL_TYPE_STRING);
		xssfCellB1.setCellValue(cfName);
		xssfCellB1.setCellStyle(workbook.getCellStyleAt(editableCellStyleIndex));
		XSSFCell xssfCellB2 = xssfRow2.createCell(1, Cell.CELL_TYPE_STRING);
		xssfCellB2.setCellValue(rootClass);
		XSSFRow xssfRow4 = sheet.createRow(3);
		XSSFCell xssfCellA4 = xssfRow4.createCell(0, Cell.CELL_TYPE_STRING);
		xssfCellA4.setCellValue("Canonical Path");
		xssfCellA4.setCellStyle(workbook.getCellStyleAt(tableHeaderStyleIndex));
		XSSFCell xssfCellB4 = xssfRow4.createCell(1, Cell.CELL_TYPE_STRING);
		xssfCellB4.setCellValue("Column Name");
		xssfCellB4.setCellStyle(workbook.getCellStyleAt(tableHeaderStyleIndex));
		XSSFCell xssfCellC4 = xssfRow4.createCell(2, Cell.CELL_TYPE_STRING);
		xssfCellC4.setCellValue("Data Type");
		xssfCellC4.setCellStyle(workbook.getCellStyleAt(tableHeaderStyleIndex));
		XSSFCell xssfCellD4 = xssfRow4.createCell(3, Cell.CELL_TYPE_STRING);
		xssfCellD4.setCellValue("Key Type");
		xssfCellD4.setCellStyle(workbook.getCellStyleAt(tableHeaderStyleIndex));
	}

	/**
	 * Method to create a row of the mapping sheet
	 * 
	 * @param sheet - the <code>XSSFSheet</code> to work on
	 * @param canonicalPath - value of cell A
	 * @param columnName - value of cell B
	 * @param dataType - value of cell C
	 */
	private void createRow(XSSFSheet sheet, String canonicalPath, String columnName, String dataType)
	{
		XSSFRow xssfRow = sheet.createRow(rowIndex);
		XSSFCell xssfCellA = xssfRow.createCell(0, Cell.CELL_TYPE_STRING);
		xssfCellA.setCellValue(canonicalPath);
		XSSFCell xssfCellB = xssfRow.createCell(1, Cell.CELL_TYPE_STRING);
		xssfCellB.setCellValue(columnName);
		xssfCellB.setCellStyle(workbook.getCellStyleAt(editableCellStyleIndex));
		XSSFCell xssfCellC = xssfRow.createCell(2, Cell.CELL_TYPE_STRING);
		xssfCellC.setCellValue(dataType);
		XSSFCell xssfCellD = xssfRow.createCell(3, Cell.CELL_TYPE_STRING);
		xssfCellD.setCellStyle(workbook.getCellStyleAt(editableCellStyleIndex));
		rowIndex++;
	}

	/**
	 * Method to add validation to the key type column
	 * 
	 * @param sheet - the <code>XSSFSheet</code> to work on
	 */
	private void createKeyTypeColumn(XSSFSheet sheet)
	{
		DataValidationHelper validationHelper = new XSSFDataValidationHelper(sheet);
		CellRangeAddressList addressList = new CellRangeAddressList(4, rowIndex - 1, 3, 3);
		DataValidationConstraint constraint =
				validationHelper.createExplicitListConstraint(new String[] { BigFrameworkConstants.KEY_PARTITION,
						BigFrameworkConstants.KEY_CLUSTERING });
		DataValidation dataValidation = validationHelper.createValidation(constraint, addressList);
		dataValidation.setSuppressDropDownArrow(true);
		sheet.addValidationData(dataValidation);
	}

	/**
	 * Method to get the full path of the schema definition file with the file name
	 * 
	 * @return the schema definition path
	 */
	private String getSchemaPath()
	{
		return BigFrameworkConstants.SOURCE_MAIN_RESOURCES + getXsdInputDir() + getXsdName();
	}

	/**
	 * Method to get the full path of the schema definition file without the file name
	 * 
	 * @return
	 */
	private String getXlsPath()
	{
		return BigFrameworkConstants.SOURCE_MAIN_RESOURCES + getXlsOutPath();
	}

	/**
	 * Method to get the full path of the schema definition file with the file name
	 * 
	 * @return
	 */
	private String getFullXlsFileName()
	{
		return getXlsPath() + getXlsFileName() + BigFrameworkConstants.XLSX_EXTN;
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
	 * Method to mutate xsdInputDir.
	 * 
	 * @param xsdInputDir the xsdInputDir to set
	 */
	public void setXsdInputDir(String xsdInputDir)
	{
		this.xsdInputDir = xsdInputDir;
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
	 * Method to mutate xsdName.
	 * 
	 * @param xsdName the xsdName to set
	 */
	public void setXsdName(String xsdName)
	{
		this.xsdName = xsdName;
	}

	/**
	 * Method to access xlsOutPath
	 * 
	 * @return the xlsOutPath
	 */
	private String getXlsOutPath()
	{
		return xlsOutPath;
	}

	/**
	 * Method to mutate xlsOutPath.
	 * 
	 * @param xlsOutPath the xlsOutPath to set
	 */
	public void setXlsOutPath(String xlsOutPath)
	{
		this.xlsOutPath = xlsOutPath;
	}

	/**
	 * Method to access xlsFileName
	 * 
	 * @return the xlsFileName
	 */
	private String getXlsFileName()
	{
		return xlsFileName;
	}

	/**
	 * Method to mutate xlsFileName.
	 * 
	 * @param xlsFileName the xlsFileName to set
	 */
	public void setXlsFileName(String xlsFileName)
	{
		this.xlsFileName = xlsFileName;
	}

	/**
	 * Method to access columnFamilyNames
	 * 
	 * @return the columnFamilyNames
	 */
	private List<String> getColumnFamilyNames()
	{
		return Arrays.asList(columnFamilyNames);
	}

	/**
	 * Method to mutate columnFamilyNames.
	 * 
	 * @param columnFamilyNames the columnFamilyNames to set
	 */
	public void setColumnFamilyNames(String[] columnFamilyNames)
	{
		this.columnFamilyNames = columnFamilyNames;
	}

	/**
	 * Method to access cassandraDataTypeMap
	 * 
	 * @return the cassandraDataTypeMap
	 */
	private Map<String, String> getCassandraDataTypeMap()
	{
		return cassandraDataTypeMap;
	}

	/**
	 * Method to mutate cassandraDataTypeMap.
	 * 
	 * @param cassandraDataTypeMap the cassandraDataTypeMap to set
	 */
	public void setCassandraDataTypeMap(Map<String, String> cassandraDataTypeMap)
	{
		this.cassandraDataTypeMap = cassandraDataTypeMap;
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
	 * Method to mutate jaxbPackageName.
	 * 
	 * @param jaxbPackageName the jaxbPackageName to set
	 */
	public void setJaxbPackageName(String jaxbPackageName)
	{
		this.jaxbPackageName = jaxbPackageName;
	}

	// Just for fun
	void colors()
	{
		XSSFSheet color = workbook.createSheet("color");
		int row = 0;
		for (IndexedColors indexedColor : IndexedColors.values()) {
			XSSFCell cell = color.createRow(row).createCell(0, Cell.CELL_TYPE_STRING);
			cell.setCellValue(indexedColor.name());
			XSSFCellStyle style = workbook.createCellStyle();
			style.setFillPattern(CellStyle.SOLID_FOREGROUND);
			style.setFillForegroundColor(indexedColor.index);
			cell.setCellStyle(style);
			row++;
		}
		color.autoSizeColumn(0);
	}
}
