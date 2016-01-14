/**
 * @(#) ExcelToCFCreator.java
 *      Copyright © 2015 - Cognizant Technology Solutions. All rights reserved.
 *      Usage is subject to license terms. Any unauthorized usage will be prosecuted.
 */
package api.bigframework.mappers;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import api.bigframework.constants.BigFrameworkConstants;
import api.bigframework.exceptions.BigFrameworkException;

/**
 * Class to process the excel spreadsheet and to generate the column family and type
 * definitions from that.
 * 
 * @author Suman Ari
 * @since Aug 28, 2015
 * @version 1.0
 */
public class ExcelToCFCreator
{
	// Define the logger here
	private static final Logger LOGGER = LoggerFactory.getLogger(ExcelToCFCreator.class);

	// fields to be initialized through spring
	private String casandraCFOutputDir;
	private String casandraTypeOutputDir;
	private String xlsOutPath;
	private String xlsFileName;

	/**
	 * Method to create the column families from the excel spreadsheet
	 * 
	 * @return dozer mapping
	 * @throws BigFrameworkException
	 */
	public Map<Map<String, String>, Map<String, String>> createCFFromExcel() throws BigFrameworkException
	{
		Map<Map<String, String>, Map<String, String>> entityCanonicalMapping =
				new HashMap<Map<String, String>, Map<String, String>>();
		try {
			// get the workbook and iterate over the spreadsheets
			XSSFWorkbook cfWorkBook = new XSSFWorkbook(new FileInputStream(new File(getFullXlsFileName())));
			for (int i = 0; i < cfWorkBook.getNumberOfSheets(); i++) {
				XSSFSheet spreadSheet = cfWorkBook.getSheetAt(i);
				String cfName = spreadSheet.getRow(0).getCell(1).getStringCellValue();
				String rootElementClass = spreadSheet.getRow(1).getCell(1).getStringCellValue();
				Map<String, String> cfClassMapping = new HashMap<String, String>();
				cfClassMapping.put(cfName, rootElementClass);
				Map<String, String> dozerFieldMap = new HashMap<String, String>();

				// define the output file
				File dir = new File(BigFrameworkConstants.SOURCE_MAIN_RESOURCES + getCasandraCFOutputDir());
				dir.mkdirs();
				File cqlFile =
						new File(dir.getAbsolutePath() + File.separator + spreadSheet.getSheetName()
								+ BigFrameworkConstants.CQL_EXTN);
				FileWriter fw = new FileWriter(cqlFile.getAbsoluteFile());
				BufferedWriter bw = new BufferedWriter(fw);
				bw.write(BigFrameworkConstants.CREATE_TABLE_LONG + StringUtils.SPACE + cfName
						+ BigFrameworkConstants.BRACKET_OPEN + StringUtils.LF);

				processExcelSheet(spreadSheet, dozerFieldMap, bw);

				bw.close();
				cqlFile.createNewFile();

				entityCanonicalMapping.put(cfClassMapping, dozerFieldMap);
			}
			cfWorkBook.close();
		} catch (IOException exec) {
			LOGGER.error("Error while creating the column family", exec);
			throw new BigFrameworkException("Error while creating the column family", exec);
		}
		return entityCanonicalMapping;
	}

	/**
	 * @param spreadSheet
	 * @param dozerFieldMap
	 * @param bw
	 * @throws IOException
	 */
	private void processExcelSheet(XSSFSheet spreadSheet, Map<String, String> dozerFieldMap, BufferedWriter bw)
			throws IOException
	{
		String partition = StringUtils.EMPTY;
		String cluster = StringUtils.EMPTY;
		Iterator<Row> rowIterator = spreadSheet.iterator();
		while (rowIterator.hasNext()) {
			Row row = rowIterator.next();
			if (row.getRowNum() >= 4) {
				String cqlLine = StringUtils.EMPTY;
				dozerFieldMap.put(row.getCell(1).getStringCellValue(), row.getCell(0).getStringCellValue());
				Iterator<Cell> cellIterator = row.cellIterator();
				while (cellIterator.hasNext()) {
					Cell cell = cellIterator.next();
					if (cell.getColumnIndex() == 1 && !StringUtils.isEmpty(cell.getStringCellValue())) {
						cqlLine = cell.getStringCellValue();
					} else if (cell.getColumnIndex() == 2 && !StringUtils.isEmpty(cell.getStringCellValue())) {
						cqlLine += StringUtils.SPACE + cell.getStringCellValue();
					} else if (cell.getColumnIndex() == 3
							&& cell.getStringCellValue().equalsIgnoreCase(BigFrameworkConstants.KEY_PARTITION)) {
						partition = partition + cell.getRow().getCell(1).getStringCellValue() + BigFrameworkConstants.COMMA;
					} else if (cell.getColumnIndex() == 3
							&& cell.getStringCellValue().equalsIgnoreCase(BigFrameworkConstants.KEY_CLUSTERING)) {
						cluster = cluster + cell.getRow().getCell(1).getStringCellValue() + BigFrameworkConstants.COMMA;
					}
				}
				if (cqlLine != StringUtils.EMPTY) {
					cqlLine = cqlLine + BigFrameworkConstants.COMMA + StringUtils.LF;
				}
				bw.write(cqlLine);
			}
		}
		if (partition != StringUtils.EMPTY) {
			partition = partition.substring(0, partition.length() - 1);
		}
		if (cluster.equals(StringUtils.EMPTY)) {
			bw.write(BigFrameworkConstants.PRIMARY_KEY + "((" + partition + "));");
		} else {
			cluster = cluster.substring(0, cluster.length() - 1);
			bw.write(BigFrameworkConstants.PRIMARY_KEY + "((" + partition + ")," + cluster + "));");
		}
	}

	/**
	 * Method to get the full path of the schema definition file with the file name
	 * 
	 * @return
	 */
	private String getFullXlsFileName()
	{
		return BigFrameworkConstants.SOURCE_MAIN_RESOURCES + getXlsOutPath() + getXlsFileName()
				+ BigFrameworkConstants.XLSX_EXTN;
	}

	/**
	 * Method to access casandraCFOutputDir
	 * 
	 * @return the casandraCFOutputDir
	 */
	private String getCasandraCFOutputDir()
	{
		return casandraCFOutputDir;
	}

	/**
	 * Method to access casandraTypeOutputDir
	 * 
	 * @return the casandraTypeOutputDir
	 */
	@SuppressWarnings("unused")
	private String getCasandraTypeOutputDir()
	{
		return casandraTypeOutputDir;
	}

	/**
	 * Method to mutate casandraCFOutputDir.
	 * 
	 * @param casandraCFOutputDir the casandraCFOutputDir to set
	 */
	public void setCasandraCFOutputDir(String casandraCFOutputDir)
	{
		this.casandraCFOutputDir = casandraCFOutputDir;
	}

	/**
	 * Method to mutate casandraTypeOutputDir.
	 * 
	 * @param casandraTypeOutputDir the casandraTypeOutputDir to set
	 */
	public void setCasandraTypeOutputDir(String casandraTypeOutputDir)
	{
		this.casandraTypeOutputDir = casandraTypeOutputDir;
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
