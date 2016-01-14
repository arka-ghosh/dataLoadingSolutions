/**
 * @(#) AnnotationHelper.java
 *      Copyright © 2015 - Cognizant Technology Solutions. All rights reserved.
 *      Usage is subject to license terms. Any unauthorized usage will be prosecuted.
 */
package api.bigframework.utils;

import org.apache.solr.client.solrj.beans.Field;

import api.bigframework.constants.BigFrameworkConstants;

import com.datastax.driver.mapping.annotations.Column;
import com.datastax.driver.mapping.annotations.PartitionKey;
import com.datastax.driver.mapping.annotations.Table;
import com.squareup.javapoet.AnnotationSpec;

/**
 * Class to work with the annotations.
 * 
 * @author Arka Ghosh
 * @since Aug 10, 2015
 * @version 1.0
 */
public final class AnnotationHelper
{
	/**
	 * Private constructor to prevent instantiation from outside.
	 */
	private AnnotationHelper()
	{
	}

	public static AnnotationSpec getColumnAnnotation(String columnName)
	{
		return getAnnotationWithMember(Column.class, "name", BigFrameworkConstants.FORMAT_STRING, columnName);
	}

	public static AnnotationSpec getFieldAnnotation(String fieldName)
	{
		return getAnnotationWithMember(Field.class, "value", BigFrameworkConstants.FORMAT_STRING, fieldName);
	}

	public static AnnotationSpec getTableAnnotation(String tableName)
	{
		return getAnnotationWithMember(Table.class, "name", BigFrameworkConstants.FORMAT_STRING, tableName);
	}

	public static AnnotationSpec getPartitionKeyAnnotation(int ordinal)
	{
		return getAnnotationWithMember(PartitionKey.class, "value", BigFrameworkConstants.FORMAT_LITERAL, ordinal);
	}

	/**
	 * Method to create an annotation having no member.
	 * 
	 * @param annotationClass - the annotation <code>Class</code>
	 * @return - the created annotation.
	 */
	static AnnotationSpec getAnnotation(Class<?> annotationClass)
	{
		AnnotationSpec.Builder annotationBuilder = AnnotationSpec.builder(annotationClass);
		return annotationBuilder.build();
	}

	/**
	 * Method to create an annotation having single member.
	 * 
	 * @param annotationClass - the annotation <code>Class</code>
	 * @param member - name of the annotation member
	 * @param format - format of the member value
	 * @param value - the member value
	 * @return - the created annotation.
	 */
	private static AnnotationSpec getAnnotationWithMember(Class<?> annotationClass, String member, String format,
			Object value)
	{
		AnnotationSpec.Builder annotationBuilder = AnnotationSpec.builder(annotationClass);
		annotationBuilder.addMember(member, format, value);
		return annotationBuilder.build();
	}
}
