/**
 * @(#) XSDToCanonicalExcelGenerator.java
 *      Copyright © 2015 - Cognizant Technology Solutions. All rights reserved.
 *      Usage is subject to license terms. Any unauthorized usage will be prosecuted.
 */
package api.bigframework.mappers;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
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
public class XSDToCanonicalExcelGenerator
{
	// Define the logger here
	private static final Logger LOGGER = LoggerFactory.getLogger(XSDToCanonicalExcelGenerator.class);

	// fields to be initialized through spring
	private String xsdInputDir;
	private String xsdName;
	private String xlsOutPath;
	private String xlsFileName;

	// Define the excel related global fields.
	private XSSFWorkbook workbook = new XSSFWorkbook();
	private XSSFSheet sheet;
	private int rowIndex = 1;
	private int maxColumnIndex = 0;
	// style indices
	private int headerStyleIndex;
	private int groupCellStyleIndex;

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

			sheet = workbook.createSheet(getXlsFileName());
			// Create the cell styles
			createCellStyles();

			/*
			 * find the root elements (only one in most cases) and create cells in the first
			 * column for each of the root elements.
			 */
			for (SchemaGlobalElement element : sts.globalElements()) {
				XSSFRow xssfRow = sheet.createRow(rowIndex);
				rowIndex++;
				XSSFCell xssfCell = xssfRow.createCell(0, Cell.CELL_TYPE_STRING);
				xssfCell.setCellValue(element.getName().getLocalPart());
				processType(element.getType(), 1);

				/*
				 * We don't need the following cell if we group cells with column index
				 * between 1 & 9. Else uncomment it.
				 */
				// XSSFRow groupedRow = sheet.createRow(rowIndex);
				// rowIndex++;
				// XSSFCell groupedCell = groupedRow.createCell(1, Cell.CELL_TYPE_STRING);
				// groupedCell.setCellValue("Click on the - button to collapse " +
				// element.getName().getLocalPart());
			}

			createHeaderRow();

			sheet.createFreezePane(0, 1);
			File output = new File(getXlsPath());
			output.mkdirs();
			workbook.write(new FileOutputStream(getFullXlsFileName()));
		} catch (XmlException | IOException exec) {
			LOGGER.error("Error while generating excel spreadsheet.");
			throw new BigFrameworkException("Error while generating excel spreadsheet.", exec);
		}
	}

	/**
	 * Method to create different cell styles for the workbook.
	 */
	private void createCellStyles()
	{
		// Create the header cell style
		XSSFCellStyle headerCellStyle = workbook.createCellStyle();
		headerCellStyle.setAlignment(CellStyle.ALIGN_CENTER);
		XSSFFont headerFont = workbook.createFont();
		headerFont.setBold(true);
		headerFont.setColor(IndexedColors.DARK_TEAL.index);
		headerCellStyle.setFont(headerFont);
		headerCellStyle.setFillForegroundColor(IndexedColors.LIGHT_CORNFLOWER_BLUE.index);
		headerCellStyle.setFillPattern(CellStyle.SOLID_FOREGROUND);
		headerStyleIndex = headerCellStyle.getIndex();

		// create the group cell style
		XSSFCellStyle groupCellStyle = workbook.createCellStyle();
		XSSFFont groupCellFont = workbook.createFont();
		groupCellFont.setColor(IndexedColors.INDIGO.index);
		groupCellStyle.setFont(groupCellFont);
		groupCellStyleIndex = groupCellStyle.getIndex();
	}

	/**
	 * Recursive method to process each and every complex types present in the input schema
	 * definition
	 * 
	 * @param elementType - the <code>SchemaType</code>
	 * @param columnIndex - the level/column index in the excel spreadsheet to write the
	 *          elements to.
	 */
	private void processType(SchemaType elementType, int columnIndex)
	{
		if (columnIndex > maxColumnIndex) {
			maxColumnIndex = columnIndex;
		}
		int startRowIndex = rowIndex;
		for (SchemaProperty elementProperty : elementType.getElementProperties()) {
			XSSFRow xssfRow = sheet.createRow(rowIndex);
			rowIndex++;
			XSSFCell xssfCell = xssfRow.createCell(columnIndex, Cell.CELL_TYPE_STRING);
			xssfCell.setCellValue(elementProperty.getName().getLocalPart());
			if (elementProperty.getType().getElementProperties() != null
					&& elementProperty.getType().getElementProperties().length > 0) {
				processType(elementProperty.getType(), columnIndex + 1);
				XSSFRow groupedRow = sheet.createRow(rowIndex);
				rowIndex++;
				XSSFCell groupedCell = groupedRow.createCell(columnIndex + 1, Cell.CELL_TYPE_STRING);
				groupedCell.setCellValue("Click on the [-] button to collapse " + elementProperty.getName().getLocalPart());
				groupedCell.setCellStyle(workbook.getCellStyleAt(groupCellStyleIndex));
			}
		}
		int endRowIndex = rowIndex;
		if (columnIndex > 1 && columnIndex < 9) {
			sheet.groupRow(startRowIndex, endRowIndex - 1);
		} else {
			LOGGER.warn("Max depth for excel grouping can be 8.");
		}
	}

	/**
	 * Method to create the header row
	 */
	private void createHeaderRow()
	{
		XSSFRow xssfRow = sheet.createRow(0);
		for (int i = 0; i <= maxColumnIndex; i++) {
			XSSFCell xssfCell = xssfRow.createCell(i, Cell.CELL_TYPE_STRING);
			xssfCell.setCellValue("Level " + i);
			xssfCell.setCellStyle(workbook.getCellStyleAt(headerStyleIndex));
		}
	}

	/**
	 * Method to get the full path of the schema definition file with the file name
	 * 
	 * @return
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
}
