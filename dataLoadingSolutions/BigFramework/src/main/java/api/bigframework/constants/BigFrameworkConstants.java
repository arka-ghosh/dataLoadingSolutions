/**
 * @(#) DataMappingConstants.java
 *      Copyright © 2015 - Cognizant Technology Solutions. All rights reserved.
 *      Usage is subject to license terms. Any unauthorized usage will be prosecuted.
 */
package api.bigframework.constants;

/**
 * Class to define all the static constants used across the API.
 * 
 * @author Arka Ghosh
 * @since Aug 4, 2015
 */
public final class BigFrameworkConstants
{
	// Common constants
	public static final String COMMA = ",";
	public static final String DOT = ".";
	public static final String SEMI_COLON = ";";
	public static final String BRACKET_OPEN = "(";
	public static final String BRACKET_CLOSE = ")";
	public static final String ANGLE_BRACKET_OPEN = "<";
	public static final String ANGLE_BRACKET_CLOSE = ">";

	// Column family structures
	public static final String PRIMARY_KEY = "PRIMARY KEY";
	public static final String CREATE_TABLE_LONG = "CREATE TABLE IF NOT EXISTS";
	public static final String CREATE_TABLE_SHORT = "CREATE TABLE";
	public static final String KEY_PARTITION = "Partition";
	public static final String KEY_CLUSTERING = "Clustering";
	// source directories
	public static final String SOURCE_MAIN_JAVA = "src/main/java";
	public static final String SOURCE_MAIN_RESOURCES = "src/main/resources/";

	public static final String SPRING_CONTEXT_PATH = "META-INF/spring/spring-context.xml";
	public static final String XML_NAMESPACE_URI = "http://www.w3.org/2001/XMLSchema";

	// File extension names
	public static final String XLSX_EXTN = ".xlsx";
	public static final String CQL_EXTN = ".cql";
	public static final String XML_EXTN = ".xml";

	// Comments
	public static final String COPYRIGHT_STATEMENT = "@(#) %s.java\nCopyright © 2015 - %s. All rights reserved.\n"
			+ "Usage is subject to license terms. Any unauthorized usage will be prosecuted.";
	public static final String ENTITY_CLASS_COMMENT = "Entity class to store data to %s column family.";
	public static final String GETTER_COMMENT = "Method to access %s\n@return the %s";
	public static final String SETTER_COMMENT = "Method to mutate %s\n@param %s the %s to set";
	public static final String HASHCODE_COMMENT = "The hashCode method\n@see java.lang.Object#hashCode()";
	public static final String EQUALS_COMMENT = "The equals method\n@see java.lang.Object#equals(java.lang.Object)";
	public static final String TOSTRING_COMMENT = "The toString method\n@see java.lang.Object#toString()";

	/*
	 * String formats to be used for the JavaPoet API:
	 * $L emits a literal value with no escaping. Arguments for literals may be strings,
	 * primitives, type declarations, annotations and even other code blocks.
	 * $N emits a name, using name collision avoidance where necessary. Arguments for names
	 * may be strings (actually any character sequence), parameters, fields, methods, and
	 * types.
	 * $S escapes the value as a string, wraps it with double quotes, and emits that. For
	 * example, 6" sandwich is emitted "6\" sandwich".
	 * $T emits a type reference. Types will be imported if possible. Arguments for types
	 * may be classes, ,* type mirrors, and elements.
	 * $$ emits a dollar sign.
	 * $&gt; increases the indentation level.
	 * $&lt; decreases the indentation level.
	 * $[ begins a statement. For multiline statements, every line after the first line is
	 * double-indented.
	 * $] ends a statement.
	 */
	public static final String FORMAT_LITERAL = "$L";
	public static final String FORMAT_NAME = "$N";
	public static final String FORMAT_STRING = "$S";
	public static final String FORMAT_TYPE = "$T";
	public static final String FORMAT_DOLLAR = "$$";
	public static final String FORMAT_IDENT_INC = "$&gt";
	public static final String FORMAT_IDENT_DEC = "$&lt";
	public static final String FORMAT_STATEMENT_BEGIN = "$[";
	public static final String FORMAT_STATEMENT_END = "$]";
}
