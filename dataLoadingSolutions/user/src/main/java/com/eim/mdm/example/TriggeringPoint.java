/**
 * @(#) TriggeringPoint.java
 *      Copyright © 2015 - Cognizant Technology Solutions. All rights reserved.
 *      Usage is subject to license terms. Any unauthorized usage will be prosecuted.
 */
package com.eim.mdm.example;

import api.bigframework.controller.FrameworkGenerator;
import api.bigframework.exceptions.BigFrameworkException;

/**
 * @author Arka Ghosh
 * @since Sep 1, 2015
 * @version 1.0
 */
public class TriggeringPoint
{

	/**
	 * @param args
	 * @throws BigFrameworkException
	 */
	public static void main(String[] args) throws BigFrameworkException
	{
		/*
		 * This is the entry point of the framework generator. Get an instance of that class
		 * first. Then run the three different steps, as explained below, one after another,
		 * separately.
		 */
		FrameworkGenerator frameworkGenerator = FrameworkGenerator.getInstance();
		/*
		 * The following statement will generate the detailed canonical excel spreadsheet
		 * along the JAXB classes. You will be able to see those JAXB classes after refreshing
		 * your workspace.
		 */
		// frameworkGenerator.generateCanonicalExcel();
		/*
		 * After you get the JAXB classes and the detailed excel sheet, its time to generate
		 * the spreadsheet containing the mapping between the column family fields and its
		 * corresponding canonical path. The following statement will do that.
		 */
		// frameworkGenerator.generateMappingExcelFromXSD();
		/*
		 * At the end, the column family definitions, entities and the dozer mapping will be
		 * generated with the following statement.
		 */
		frameworkGenerator.generateDozerMap();
	}

}
