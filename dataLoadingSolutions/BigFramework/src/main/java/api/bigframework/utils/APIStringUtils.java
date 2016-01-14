/**
 * @(#) EIMStringUtils.java
 *      Copyright © 2015 - Cognizant Technology Solutions. All rights reserved.
 *      Usage is subject to license terms. Any unauthorized usage will be prosecuted.
 */
package api.bigframework.utils;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Utility class for String operations used across the API.
 * 
 * @author Arka Ghosh
 * @since Aug 5, 2015
 */
public class APIStringUtils
{
	// Define the logger here
	private static final Logger LOGGER = LoggerFactory.getLogger(APIStringUtils.class);

	/**
	 * Private constructor to prevent instantiation.
	 */
	private APIStringUtils()
	{
	}

	public static String toJavaClassNameFormat(String str)
	{
		LOGGER.debug("Input string: " + str);
		String classNameFormat = toJavaCamelCase(str);
		classNameFormat = classNameFormat.substring(0, 1).toUpperCase() + classNameFormat.substring(1);
		LOGGER.debug("Formatted string: " + classNameFormat);
		return classNameFormat;
	}

	/**
	 * Method to format a string with '_' to the Java camel case format.
	 * 
	 * @param str - Input String
	 * @return formatted string
	 */
	public static String toJavaCamelCase(String str)
	{
		LOGGER.debug("Input string: " + str);
		String[] parts = str.split("_");
		String camelCaseString = StringUtils.uncapitalize(parts[0]);
		for (int i = 1; i < parts.length; i++) {
			camelCaseString += StringUtils.capitalize(parts[i]);
		}
		LOGGER.debug("Formatted string: " + camelCaseString);
		return camelCaseString;
	}

	/**
	 * Method to format a string to its proper case, i.e. the first letter should be in
	 * upper case and rest in lower case.
	 * 
	 * @param str - input string
	 * @return formatted string
	 */
	public static String toProperCase(String str)
	{
		return str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase();
	}

	/**
	 * Method to remove all the occurrence of the input substrings from the input string.
	 * 
	 * @param str - the string to manipulate
	 * @param subStrings - the substrings to remove from the input string
	 * @return formatted string
	 */
	public static String remove(String str, String... subStrings)
	{
		for (String substring : subStrings) {
			if (str.contains(substring)) {
				str = StringUtils.remove(str, substring);
			}
		}
		return str;
	}
}
