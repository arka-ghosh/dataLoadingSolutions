/**
 * @(#) LombokHelper.java
 *      Copyright © 2015 - Cognizant Technology Solutions. All rights reserved.
 *      Usage is subject to license terms. Any unauthorized usage will be prosecuted.
 */
package api.bigframework.utils;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import lombok.Data;
import lombok.launch.Delombok;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import api.bigframework.exceptions.BigFrameworkException;

import com.squareup.javapoet.AnnotationSpec;

/**
 * Helper class for <code>Lombok</code> API
 * 
 * @author Arka Ghosh
 * @since Aug 20, 2015
 * @version 1.0
 */
public final class LombokHelper
{
	// Define the logger here
	private static final Logger LOGGER = LoggerFactory.getLogger(LombokHelper.class);

	/**
	 * Private constructor to prevent instantiation from outside
	 */
	private LombokHelper()
	{
	}

	/**
	 * Method to <code>delombok</code> a Java file having <code>Lombok</code> annotations.
	 * 
	 * @param dir - the file directory
	 * @throws BigFrameworkException
	 */
	public static void deLombok(String dir) throws BigFrameworkException
	{
		try {
			Delombok delombok = new Delombok();
			delombok.addDirectory(new File(dir));
			delombok.setOutput(new File(dir));
			LOGGER.info("delomboked? " + delombok.delombok());
		} catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException
				| InvocationTargetException | IOException exec) {
			LOGGER.error("Error while delomboking: " + exec);
			throw new BigFrameworkException("Error while delomboking: ", exec);
		}
	}

	/**
	 * Method to get a list of <code>Lombok</code> annotations.
	 * 
	 * @return List of <code>Lombok</code> <code>AnnotationSpec</code> objects
	 */
	public static Iterable<AnnotationSpec> getLombokAnnotations()
	{
		List<AnnotationSpec> annotations = new ArrayList<AnnotationSpec>();
		annotations.add(getLombokDataAnnotation());
		return annotations;
	}

	/**
	 * Method to get the <code>Lombok Data</code> annotation.
	 * 
	 * @return <code>Data</code> annotation
	 */
	public static AnnotationSpec getLombokDataAnnotation()
	{
		return AnnotationHelper.getAnnotation(Data.class);
	}

}
