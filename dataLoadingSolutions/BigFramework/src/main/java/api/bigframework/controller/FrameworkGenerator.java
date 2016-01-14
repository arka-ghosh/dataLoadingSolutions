/**
 * @(#) DataLoadingUtility.java
 *      Copyright © 2015 - Cognizant Technology Solutions. All rights reserved.
 *      Usage is subject to license terms. Any unauthorized usage will be prosecuted.
 */
package api.bigframework.controller;

import java.util.Map;
import java.util.Map.Entry;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import api.bigframework.constants.BigFrameworkConstants;
import api.bigframework.exceptions.BigFrameworkException;
import api.bigframework.mappers.CFToEntityCreator;
import api.bigframework.mappers.DozerMappingGenerator;
import api.bigframework.mappers.ExcelToCFCreator;
import api.bigframework.mappers.JaxBToExcelCreator;
import api.bigframework.mappers.XSDToCanonicalExcelGenerator;
import api.bigframework.mappers.XSDToJAXBGenerator;
import api.bigframework.mappers.XSDToMappingExcelGenerator;

/**
 * Entry point of this framework utility
 * 
 * @author Arka Ghosh
 * @since Aug 28, 2015
 * @version 1.0
 */
public class FrameworkGenerator
{
	// Define the logger here
	private static final Logger LOGGER = LoggerFactory.getLogger(FrameworkGenerator.class);

	// variables to be initialized through spring
	private XSDToJAXBGenerator xsdToJAXBGenerator;
	private JaxBToExcelCreator jaxBToExcelCreator;
	private ExcelToCFCreator excelToCFCreator;
	private CFToEntityCreator cfToEntityCreator;
	private DozerMappingGenerator dozerMappingGenerator;
	private XSDToCanonicalExcelGenerator xsdToCanonicalExcelGenerator;
	private XSDToMappingExcelGenerator xsdToMappingExcelGenerator;

	private static ClassPathXmlApplicationContext context;

	/**
	 * Method to get an instance of this bean
	 * 
	 * @return <code>FrameworkGenerator</code> object
	 */
	public static FrameworkGenerator getInstance()
	{
		context = new ClassPathXmlApplicationContext(BigFrameworkConstants.SPRING_CONTEXT_PATH);
		return context.getBean(FrameworkGenerator.class);
	}

	/**
	 * Method to get flat version of the schema definition in an excel spread sheet and
	 * generate the JAXB classes from it.
	 * 
	 * @throws BigFrameworkException
	 */
	public void generateCanonicalExcel() throws BigFrameworkException
	{
		xsdToCanonicalExcelGenerator.generateExcel();
		LOGGER.info("Generated excel spreadsheet with the detailed canonical model from the input XSD");

		xsdToJAXBGenerator.generateJaxb();
		LOGGER.info("Generated JAXB classes from the input XSD");
	}

	/**
	 * Method to generate the mapping excel spread sheet from the schema definition.
	 * 
	 * @throws BigFrameworkException
	 */
	public void generateMappingExcelFromXSD() throws BigFrameworkException
	{
		xsdToMappingExcelGenerator.generateExcel();
		LOGGER.info("Created the excel spreadsheet from the generated JAXB classes");
	}

	/**
	 * Method to generate the mapping excel spread sheet from the JAXB classes.
	 * 
	 * @throws BigFrameworkException
	 */
	public void generateMappingExcelFromJAXB() throws BigFrameworkException
	{
		jaxBToExcelCreator.generateExcel(xsdToJAXBGenerator.findRootElement());
		LOGGER.info("Created the excel spreadsheet from the generated JAXB classes");
	}

	/**
	 * Method to generate the column family definition from excel spread sheet, then entity
	 * classes from the column family definitions and ultimately the dozer mapping between
	 * the JAXB and entity classes.
	 * 
	 * @throws BigFrameworkException
	 */
	public void generateDozerMap() throws BigFrameworkException
	{
		Map<Map<String, String>, Map<String, String>> entityCanonicalMapping = excelToCFCreator.createCFFromExcel();
		LOGGER.info("Created column families(s) from the generated spreadsheet");

		entityCanonicalMapping = cfToEntityCreator.createEntitiesFromCF(entityCanonicalMapping);
		LOGGER.info("Created entitie(s) from the corresponding column families(s)");

		for (Entry<Map<String, String>, Map<String, String>> entry : entityCanonicalMapping.entrySet()) {
			for (Entry<String, String> subEntry : entry.getKey().entrySet()) {
				dozerMappingGenerator.generateDozerMap(subEntry.getKey(), subEntry.getValue(), entry.getValue());
			}
		}
		LOGGER.info("Generated Dozer mapping(s) between the entitie(s) and the respective JAXB root class(es)");
	}

	/**
	 * Method to generate entity classes from the column family definitions.
	 * 
	 * @throws BigFrameworkException
	 */
	public void generateEntitiesFromCF() throws BigFrameworkException
	{
		cfToEntityCreator.createEntitiesFromCF(null);
		LOGGER.info("Created entitie(s) from the corresponding column families(s)");
	}

	/**
	 * Destroy method for this bean
	 */
	public void close()
	{
		context.close();
	}

	/**
	 * Method to mutate xsdToJAXBGenerator.
	 * 
	 * @param xsdToJAXBGenerator the xsdToJAXBGenerator to set
	 */
	public void setXsdToJAXBGenerator(XSDToJAXBGenerator xsdToJAXBGenerator)
	{
		this.xsdToJAXBGenerator = xsdToJAXBGenerator;
	}

	/**
	 * Method to mutate jaxBToExcelCreator.
	 * 
	 * @param jaxBToExcelCreator the jaxBToExcelCreator to set
	 */
	public void setJaxBToExcelCreator(JaxBToExcelCreator jaxBToExcelCreator)
	{
		this.jaxBToExcelCreator = jaxBToExcelCreator;
	}

	/**
	 * Method to mutate excelToCFCreator.
	 * 
	 * @param excelToCFCreator the excelToCFCreator to set
	 */
	public void setExcelToCFCreator(ExcelToCFCreator excelToCFCreator)
	{
		this.excelToCFCreator = excelToCFCreator;
	}

	/**
	 * Method to mutate cfToEntityCreator.
	 * 
	 * @param cfToEntityCreator the cfToEntityCreator to set
	 */
	public void setCfToEntityCreator(CFToEntityCreator cfToEntityCreator)
	{
		this.cfToEntityCreator = cfToEntityCreator;
	}

	/**
	 * Method to mutate dozerMappingGenerator.
	 * 
	 * @param dozerMappingGenerator the dozerMappingGenerator to set
	 */
	public void setDozerMappingGenerator(DozerMappingGenerator dozerMappingGenerator)
	{
		this.dozerMappingGenerator = dozerMappingGenerator;
	}

	/**
	 * Method to mutate xsdToCanonicalExcelGenerator.
	 * 
	 * @param xsdToCanonicalExcelGenerator the xsdToCanonicalExcelGenerator to set
	 */
	public void setXsdToCanonicalExcelGenerator(XSDToCanonicalExcelGenerator xsdToCanonicalExcelGenerator)
	{
		this.xsdToCanonicalExcelGenerator = xsdToCanonicalExcelGenerator;
	}

	/**
	 * Method to mutate xsdToMappingExcelGenerator.
	 * 
	 * @param xsdToMappingExcelGenerator the xsdToMappingExcelGenerator to set
	 */
	public void setXsdToMappingExcelGenerator(XSDToMappingExcelGenerator xsdToMappingExcelGenerator)
	{
		this.xsdToMappingExcelGenerator = xsdToMappingExcelGenerator;
	}
}
