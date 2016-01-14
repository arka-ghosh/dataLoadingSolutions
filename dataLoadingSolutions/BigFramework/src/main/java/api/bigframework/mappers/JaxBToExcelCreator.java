/**
 * @(#)JaxBReader.java Copyright 2014 Wal-Mart Stores, Inc. All rights reserved.
 *                     Wal-Mart PROPRIETARY/CONFIDENTIAL. Use is subject to
 *                     license terms.
 */

package api.bigframework.mappers;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataValidation;
import org.apache.poi.ss.usermodel.DataValidationConstraint;
import org.apache.poi.ss.usermodel.DataValidationHelper;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.AreaReference;
import org.apache.poi.ss.util.CellRangeAddressList;
import org.apache.poi.ss.util.CellReference;
import org.apache.poi.xssf.usermodel.XSSFDataValidationHelper;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFTable;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTable;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTableColumn;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTableColumns;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTTableStyleInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import api.bigframework.constants.BigFrameworkConstants;
import api.bigframework.exceptions.BigFrameworkException;

/**
 * Class to process the XML definition and generate the editable excel spreadsheet from
 * that.
 * 
 * @author Avik Chakrabarty
 * @since Aug 28, 2015
 * @version 1.0
 */
public class JaxBToExcelCreator
{
	// Define the logger here.
	private static final Logger LOGGER = LoggerFactory.getLogger(JaxBToExcelCreator.class);

	// Define the variables to be initialized through spring
	private String xlsOutPath;
	private String xlsFileName;
	private String[] coumnFamilyNames;
	private Map<String, String> cassandraDataTypeMap;

	static Map<List<String>, List<String>> superCfMap = new HashMap<>();
	static Map<List<String>, List<String>> subCfMap = new HashMap<>();
	private static Map<String, Map<List<String>, List<String>>> columnFamilyMap =
			new HashMap<String, Map<List<String>, List<String>>>();
	static File upDatedFile = null;
	static XSSFWorkbook workbook = new XSSFWorkbook();
	static String[] columnNames = { "Column Name", "Data Type", "Key" };

	/**
	 * @param args
	 * @throws BigFrameworkException
	 */
	public void generateExcel(String className) throws BigFrameworkException
	{
		try {
			Class<?> clazz = Class.forName(className);
			List<String> cfFileds = null;
			List<String> cfFieldsType = null;
			boolean superClazProcessed = false;
			Map<String, Map<List<String>, List<String>>> cfMaps =
					getChildFields(clazz, cfFileds, cfFieldsType, superClazProcessed);
			Long tableIndex = 1L;
			for (String cfName : cfMaps.keySet()) {
				Map<List<String>, List<String>> allCfMap = cfMaps.get(cfName);

				XSSFSheet sheet = workbook.createSheet(cfName);
				for (Map.Entry<List<String>, List<String>> cfEntry : allCfMap.entrySet()) {
					List<String> cfFld = (List<String>) cfEntry.getKey();
					List<String> cfFldType = cfEntry.getValue();
					cfFldType = buildCFDataType(cfFldType);
					createTable(sheet, cfFld.size(), tableIndex);
					try {
						generateXLS(cfFld, cfFldType, sheet);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
				tableIndex++;
			}

			File output = new File(getXlsPath());
			output.mkdirs();
			workbook.write(new FileOutputStream(getFullXlsFileName()));

		} catch (ClassNotFoundException | IOException exec) {
			LOGGER.error("No Specidfied Class Name Found: " + exec);
			throw new BigFrameworkException("No Specidfied Class Name Found: ", exec);
		}
	}

	private void createTable(XSSFSheet sheet, int noOfRows, Long tIndex)
	{
		XSSFTable table = sheet.createTable();

		/* get CTTable object */
		CTTable cttable = table.getCTTable();
		cttable.setName(sheet.getSheetName().toUpperCase());
		CTTableStyleInfo table_style = cttable.addNewTableStyleInfo();
		table_style.setName("TableStyleMedium9");
		/* Define Style Options */
		table_style.setShowColumnStripes(true); // showColumnStripes=0
		table_style.setShowRowStripes(true); // showRowStripes=1
		/* Define the data range including headers */
		AreaReference my_data_range = new AreaReference(new CellReference(0, 0), new CellReference(noOfRows + 1, 2));
		cttable.setDisplayName(sheet.getSheetName());
		cttable.setName(sheet.getSheetName().toLowerCase());
		cttable.setId(tIndex);
		CTTableColumns columns = cttable.addNewTableColumns();
		cttable.setRef(my_data_range.formatAsString());
		columns.setCount(columnNames.length); // define number of columns
		Long index = 1L;
		CTTableColumn column = null;
		// Define Header Information for the Table
		Row row = sheet.createRow(0);
		Cell cell = null;
		for (int columnName = 0; columnName < columnNames.length; columnName++) {
			cell = row.createCell(columnName);
			column = columns.addNewTableColumn();
			column.setId(index);
			column.setName(columnNames[columnName]);
			cell.setCellValue(columnNames[columnName]);
			index++;
		}
	}

	// Returns generic type of any field
	private Class<?> getFieldGenericType(Field field)
	{
		if (ParameterizedType.class.isAssignableFrom(field.getGenericType().getClass())) {
			ParameterizedType genericType = (ParameterizedType) field.getGenericType();
			return ((Class<?>) (genericType.getActualTypeArguments()[0]));
		}
		return new Boolean(false).getClass();
	}

	private Map<String, Map<List<String>, List<String>>> getChildFields(Class<?> clazz, List<String> cfFldz,
			List<String> cfFldzType, boolean superClazProcessed)
	{
		Field fieldz[] = clazz.getDeclaredFields();
		for (Field field : fieldz) {
			LOGGER.debug("Fields Defined for class  =====" + clazz.getName() + " ===================");
			LOGGER.debug("Fileds For Class ===================== " + field.getName() + "  ===Type === " + field.getType());
			// 1. Check if field is of Collection Type
			if (Collection.class.isAssignableFrom(field.getType())) {
				// 2. Get Generic type of your field
				Class<?> fieldGenericType = getFieldGenericType(field);
				LOGGER.debug(" ============ Generic Type ==== " + fieldGenericType);
				if (fieldGenericType.getSuperclass() != null && !isJDKClass(fieldGenericType.getSuperclass())
						&& !superClazProcessed) {
					LOGGER.debug(" ============ Super Class Type ==== " + fieldGenericType.getSuperclass().getSimpleName());
					cfFldz = new ArrayList<>();
					cfFldzType = new ArrayList<>();
					Class<?> superClazz = fieldGenericType.getSuperclass();
					Map<List<String>, List<String>> superCfMap =
							getSuperClzChildFldz(superClazz, cfFldz, cfFldzType, superClazz.getSimpleName());
					columnFamilyMap.put(superClazz.getSimpleName(), superCfMap);
					superClazProcessed = true;
				}
				LOGGER.debug(" === Not Having Super Class ==== ");
				LOGGER.debug(" Lulzzzzzz " + fieldGenericType);
				if (!isJDKClass(fieldGenericType)) {
					if (isCFNameContains(fieldGenericType.getSimpleName(), coumnFamilyNames)) {
						cfFldz = new ArrayList<>();
						cfFldzType = new ArrayList<>();

						Map<List<String>, List<String>> subCfMap =
								getSubClzChildFldz(fieldGenericType, cfFldz, cfFldzType, fieldGenericType.getSimpleName());
						columnFamilyMap.put(fieldGenericType.getSimpleName(), subCfMap);
					} else {
						getChildFields(fieldGenericType, cfFldz, cfFldzType, superClazProcessed);
					}
				}
			}
		}
		return columnFamilyMap;
	}

	private void generateXLS(List<String> cfNames, List<String> cfFldzType, XSSFSheet CfSheet)
	{
		LOGGER.info("Generating XLS File: " + cfNames);
		cfNames = removeParentName(cfNames, "_");
		DataValidationHelper validationHelper = new XSSFDataValidationHelper(CfSheet);

		int rowIndex = processXls(cfNames, cfFldzType, CfSheet);
		CellRangeAddressList addressList = new CellRangeAddressList(1, rowIndex, 2, 2);
		DataValidationConstraint constraint =
				validationHelper.createExplicitListConstraint(new String[] { "Primary", "Clustering" });
		DataValidation dataValidation = validationHelper.createValidation(constraint, addressList);
		dataValidation.setSuppressDropDownArrow(true);
		CfSheet.addValidationData(dataValidation);
	}

	private List<String> removeParentName(List<String> names, String spclChar)
	{
		List<String> cfName = new ArrayList<>();
		for (String name : names) {
			if (name.contains(spclChar)) {
				name = name.substring(name.indexOf(spclChar) + 1);
			}
			cfName.add(name);
		}
		return cfName;
	}

	private int processXls(List<String> cfelementList, List<String> typeList, XSSFSheet cfSheet)
	{
		int rowIndex = 1;
		int cfCellIndex = 0;
		int typCellIndex = 1;
		Cell cfCell = null;
		Cell typCell = null;
		Row row = null;
		for (int element = 0; element < cfelementList.size(); element++) {
			row = cfSheet.createRow(rowIndex);
			cfCell = row.createCell(cfCellIndex);
			typCell = row.createCell(typCellIndex);
			cfCell.setCellValue(cfelementList.get(element));
			typCell.setCellValue(typeList.get(element));
			rowIndex++;
		}
		return rowIndex;
	}

	// Checking whether field type is from JDK class or custom class
	private boolean isJDKClass(Class<?> clzz)
	{
		return clzz.getName().startsWith("java");
	}

	private boolean isCFNameContains(String fieldName, String... cfNames)
	{
		for (String cfName : cfNames) {
			if (fieldName.equalsIgnoreCase(cfName)) {
				return true;
			}
			continue;
		}
		return false;
	}

	private Map<List<String>, List<String>> getSuperClzChildFldz(Class<?> superClazz, List<String> superCfFldz,
			List<String> superCfFldzType, String clsName)
	{
		Field fieldz[] = superClazz.getDeclaredFields();
		String clazzName = "";
		clazzName = clsName.toLowerCase() + "_" + clazzName;
		for (Field field : fieldz) {
			LOGGER.debug("Super Clazz Fields Defined for class  =====" + superClazz.getSimpleName() + " ===================");
			LOGGER.debug("Super Clazz Fileds For Class ===================== " + field.getName() + "  ===Type === "
					+ field.getType());
			if (isCFNameContains(field.getName(), coumnFamilyNames)) {
				continue;
			}
			// 1. Check if field is of Collection Type
			if (Collection.class.isAssignableFrom(field.getType())) {
				LOGGER.debug(" ============ Super Clazz Generic Fldzzz ==== " + field.getName());
				superCfFldz.add(clazzName + field.getName());
				superCfFldzType.add(field.getType().getSimpleName());
			} else {
				if (!isJDKClass(field.getType())) {
					getSuperClzChildFldz(field.getType(), superCfFldz, superCfFldzType, clsName + "_" + field.getName());
				} else {
					superCfFldz.add(clazzName + field.getName());
					superCfFldzType.add(field.getType().getSimpleName());
				}
			}
		}
		superCfMap.clear();
		superCfMap.put(superCfFldz, superCfFldzType);
		return superCfMap;
	}

	private Map<List<String>, List<String>> getSubClzChildFldz(Class<?> subClazz, List<String> subCfFldz,
			List<String> subCfFldzType, String clsName)
	{
		Field fieldz[] = subClazz.getDeclaredFields();
		String clazzName = "";
		clazzName = clsName.toLowerCase() + "_" + clazzName;
		for (Field field : fieldz) {
			LOGGER.debug("Sub Clazz Fields Defined for class  =====" + subClazz.getSimpleName() + " ===================");
			LOGGER.debug("Subr Clazz Fileds For Class ===================== " + field.getName() + "  ===Type === "
					+ field.getType());
			if (isCFNameContains(field.getName(), coumnFamilyNames)) {
				continue;
			}
			// 1. Check if field is of Collection Type
			if (Collection.class.isAssignableFrom(field.getType())) {
				LOGGER.debug(" ============ Sub Clazz Generic Fldzzz ==== " + field.getName());
				subCfFldz.add(clazzName + field.getName());
				subCfFldzType.add(field.getType().getSimpleName());
			} else {
				if (!isJDKClass(field.getType())) {
					getSubClzChildFldz(field.getType(), subCfFldz, subCfFldzType, clsName + "_" + field.getName());
				} else {
					subCfFldz.add(clazzName + field.getName());
					subCfFldzType.add(field.getType().getSimpleName());
				}
			}
		}
		subCfMap.clear();
		subCfMap.put(subCfFldz, subCfFldzType);
		return subCfMap;
	}

	private List<String> buildCFDataType(List<String> cfDataTypeList)
	{
		for (int cfField = 0; cfField < cfDataTypeList.size(); cfField++) {
			cfDataTypeList.set(cfField, cassandraDataTypeMap.get(cfDataTypeList.get(cfField)));
		}

		return cfDataTypeList;
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
	 * Method to access xlsOutPath
	 * 
	 * @return the xlsOutPath
	 */
	public String getXlsOutPath()
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
	public String getXlsFileName()
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
	 * Method to access coumnFamilyNames
	 * 
	 * @return the coumnFamilyNames
	 */
	public String[] getCoumnFamilyNames()
	{
		return coumnFamilyNames;
	}

	/**
	 * Method to mutate coumnFamilyNames.
	 * 
	 * @param coumnFamilyNames the coumnFamilyNames to set
	 */
	public void setCoumnFamilyNames(String[] coumnFamilyNames)
	{
		this.coumnFamilyNames = coumnFamilyNames;
	}

	/**
	 * Method to access cassandraDataTypeMap
	 * 
	 * @return the cassandraDataTypeMap
	 */
	public Map<String, String> getCassandraDataTypeMap()
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
}
