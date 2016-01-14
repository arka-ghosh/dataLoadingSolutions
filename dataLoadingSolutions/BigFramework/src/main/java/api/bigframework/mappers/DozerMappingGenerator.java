/**
 * @(#) DozerMappingGenerator.java
 *      Copyright © 2015 - Cognizant Technology Solutions. All rights reserved.
 *      Usage is subject to license terms. Any unauthorized usage will be prosecuted.
 */
package api.bigframework.mappers;

import java.io.File;
import java.util.Map;
import java.util.Map.Entry;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import api.bigframework.constants.BigFrameworkConstants;
import api.bigframework.exceptions.BigFrameworkException;

/**
 * Class to generate dozer mapping between entity classes and corresponding JAXB classess
 * 
 * @author Arka Ghosh
 * @since Aug 31, 2015
 * @version 1.0
 */
public class DozerMappingGenerator
{
	// Define the logger here
	private static final Logger LOGGER = LoggerFactory.getLogger(DozerMappingGenerator.class);

	private String dozerOutputDir;

	/**
	 * Method to generate the dozer mapping files
	 * 
	 * @param classAName - the fully classified name of classA
	 * @param classBName - the fully classified name of classB
	 * @param fieldMapping - the mapping of the fields
	 * @throws BigFrameworkException
	 */
	public void generateDozerMap(String classAName, String classBName, Map<String, String> fieldMapping)
			throws BigFrameworkException
	{
		String fileName = classAName.substring(classAName.lastIndexOf(".") + 1, classAName.length());
		LOGGER.debug("Generating Dozer map");
		try {
			DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder docBuilder = docFactory.newDocumentBuilder();

			// root elements
			Document doc = docBuilder.newDocument();
			Element mappings = doc.createElement("mappings");
			doc.appendChild(mappings);
			mappings.setAttribute("xmlns", "http://dozer.sourceforge.net");
			mappings.setAttribute("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
			mappings.setAttribute("xsi:schemaLocation",
					"http://dozer.sourceforge.net http://dozer.sourceforge.net/schema/beanmapping.xsd");

			// mapping elements
			Element mapping = doc.createElement("mapping");
			mappings.appendChild(mapping);
			mapping.setAttribute("wildcard", "true");
			mapping.setAttribute("map-null", "false");
			mapping.setAttribute("trim-strings", "true");

			// Class A elements
			Element classA = doc.createElement("class-a");
			classA.appendChild(doc.createTextNode(classAName));
			mapping.appendChild(classA);

			// Class B elements
			Element classB = doc.createElement("class-b");
			classB.appendChild(doc.createTextNode(classBName));
			mapping.appendChild(classB);

			// Create the field elements
			for (Entry<String, String> enrtry : fieldMapping.entrySet()) {
				Element field = doc.createElement("field");
				Element a = doc.createElement("a");
				Element b = doc.createElement("b");
				a.appendChild(doc.createTextNode(enrtry.getKey()));
				b.appendChild(doc.createTextNode(enrtry.getValue()));
				field.appendChild(a);
				field.appendChild(b);
				mapping.appendChild(field);
			}

			DOMSource source = new DOMSource(doc);
			File dozerFileDir = new File(BigFrameworkConstants.SOURCE_MAIN_RESOURCES + File.separator + dozerOutputDir);
			dozerFileDir.mkdirs();
			File dozerFile =
					new File(dozerFileDir.getAbsolutePath() + File.separator + fileName + "-Mapping"
							+ BigFrameworkConstants.XML_EXTN);
			StreamResult result = new StreamResult(dozerFile);

			// write the content into xml file
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			transformer.setOutputProperty(OutputKeys.INDENT, "yes");
			transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "3");
			transformer.transform(source, result);
			LOGGER.info("Generated " + fileName + "-Mapping.xml");
		} catch (ParserConfigurationException | TransformerException exec) {
			LOGGER.error("Error while generating the dozer mapping file.", exec);
			throw new BigFrameworkException("Error while generating the dozer mapping file.", exec);
		}
	}

	/**
	 * Method to access dozerOutputDir
	 * 
	 * @return the dozerOutputDir
	 */
	public String getDozerOutputDir()
	{
		return dozerOutputDir;
	}

	/**
	 * Method to mutate dozerOutputDir.
	 * 
	 * @param dozerOutputDir the dozerOutputDir to set
	 */
	public void setDozerOutputDir(String dozerOutputDir)
	{
		this.dozerOutputDir = dozerOutputDir;
	}
}
