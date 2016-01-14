/**
 * @(#) JavaFileModifier.java
 *      Copyright © 2015 - Cognizant Technology Solutions. All rights reserved.
 *      Usage is subject to license terms. Any unauthorized usage will be prosecuted.
 */
package api.bigframework.utils;

import java.io.File;
import java.io.IOException;

import javax.annotation.Generated;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import api.bigframework.constants.BigFrameworkConstants;
import api.bigframework.exceptions.BigFrameworkException;

import com.github.javaparser.JavaParser;
import com.github.javaparser.ParseException;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.body.BodyDeclaration;
import com.github.javaparser.ast.body.ClassOrInterfaceDeclaration;
import com.github.javaparser.ast.body.ConstructorDeclaration;
import com.github.javaparser.ast.body.MethodDeclaration;
import com.github.javaparser.ast.body.TypeDeclaration;
import com.github.javaparser.ast.comments.Comment;
import com.github.javaparser.ast.comments.JavadocComment;
import com.github.javaparser.ast.expr.AnnotationExpr;
import com.github.javaparser.ast.expr.SingleMemberAnnotationExpr;
import com.github.javaparser.ast.expr.StringLiteralExpr;
import com.github.javaparser.ast.type.PrimitiveType;
import com.github.javaparser.ast.type.Type;
import com.github.javaparser.ast.type.VoidType;

/**
 * Utility class using JavaParser API to modify .java files.
 * 
 * @author Arka Ghosh
 * @since Aug 28, 2015
 * @version 1.0
 */
public class JavaFileModifier
{
	// Define the logger here
	private static final Logger LOGGER = LoggerFactory.getLogger(JavaFileModifier.class);

	private String companyName;

	/**
	 * Method to process the input path and to read all the entities present inside
	 * it.
	 * 
	 * @param filePath - the input file/directory path
	 * @throws BigFrameworkException
	 */
	public void modifyEntitiesFromPath(String filePath) throws BigFrameworkException
	{
		modifyEntities(new File(filePath));
	}

	/**
	 * Method to process the input file/directory and if its a directory, then read all the
	 * entities present inside it.
	 * 
	 * @param entityDir - the input file/directory
	 * @throws BigFrameworkException
	 */
	private void modifyEntities(File entityDir) throws BigFrameworkException
	{
		if (entityDir.isFile()) {
			modify(entityDir);
		} else if (entityDir.isDirectory()) {
			for (File entityFile : entityDir.listFiles()) {
				modifyEntities(entityFile);
			}
		} else {
			LOGGER.error(entityDir.getAbsolutePath() + " is neither a file nor a directoty :-0");
		}
	}

	/**
	 * Method to modify the generated entity .java file.
	 * 
	 * @param entityFile - The entity .java file to be modified
	 * @throws BigFrameworkException
	 */
	private void modify(File entityFile) throws BigFrameworkException
	{
		CompilationUnit compilationUnit = null;
		try {
			// Create a compilation unit by parsing the input file
			compilationUnit = JavaParser.parse(entityFile);
		} catch (ParseException | IOException exec) {
			LOGGER.error("Error while parsing the java file." + exec);
			throw new BigFrameworkException("Error while parsing the java file.", exec);
		}
		if (compilationUnit != null) {
			for (TypeDeclaration typeDeclaration : compilationUnit.getTypes()) {
				if (typeDeclaration instanceof ClassOrInterfaceDeclaration) {
					// Set the file copyright comments
					setFileComments(compilationUnit, typeDeclaration.getName());
					BodyDeclaration defaultConstructor = null;
					for (BodyDeclaration bodyDeclaration : typeDeclaration.getMembers()) {
						// Find out the default constructor
						if (bodyDeclaration instanceof ConstructorDeclaration) {
							if (((ConstructorDeclaration) bodyDeclaration).getParameters().size() == 0) {
								defaultConstructor = bodyDeclaration;
							}
						}
						// For other methods, remove unwanted annotations and set necessary method
						// comments
						else if (bodyDeclaration instanceof MethodDeclaration) {
							removeAnnotations((MethodDeclaration) bodyDeclaration);
							setMethodComments((MethodDeclaration) bodyDeclaration);
						}
					}
					// Remove the default constructor
					typeDeclaration.getMembers().remove(defaultConstructor);
				}
			}
			try {
				FileUtils.writeStringToFile(entityFile, compilationUnit.toString());
			} catch (IOException exec) {
				LOGGER.error("Error while writing back the java file." + exec);
				throw new BigFrameworkException("Error while writing back the java file.", exec);
			}
		}
	}

	/**
	 * Method to remove unwanted annotations from a method
	 * 
	 * @param declaration - the <code>MethodDeclaration</code> from where the annotations
	 *          need to be removed
	 */
	private void removeAnnotations(MethodDeclaration declaration)
	{
		AnnotationExpr[] annotationArray = {};
		annotationArray = declaration.getAnnotations().toArray(annotationArray);
		for (AnnotationExpr annotationExpr : annotationArray) {
			if (annotationExpr instanceof SingleMemberAnnotationExpr) {
				if (annotationExpr.getName().getName().equals(SuppressWarnings.class.getSimpleName())
						&& ((SingleMemberAnnotationExpr) annotationExpr).getMemberValue() instanceof StringLiteralExpr
						&& ((StringLiteralExpr) ((SingleMemberAnnotationExpr) annotationExpr).getMemberValue()).getValue()
								.equalsIgnoreCase("all")) {
					declaration.getAnnotations().remove(annotationExpr);
					LOGGER.debug("Removed annotation: " + annotationExpr.getName().getName() + "(all)");
				}
				if (annotationExpr.getName().getName().equals(Generated.class.getSimpleName())
						&& ((SingleMemberAnnotationExpr) annotationExpr).getMemberValue() instanceof StringLiteralExpr
						&& ((StringLiteralExpr) ((SingleMemberAnnotationExpr) annotationExpr).getMemberValue()).getValue()
								.equalsIgnoreCase("lombok")) {
					declaration.getAnnotations().remove(annotationExpr);
					LOGGER.debug("Removed annotation: " + annotationExpr.getName().getName() + "(lombok)");
				}
			}
		}
	}

	/**
	 * Method to set comments to the compilation unit.
	 * 
	 * @param compilationUnit
	 * @param className
	 */
	private void setFileComments(CompilationUnit compilationUnit, String className)
	{
		Comment comment = new JavadocComment(String.format(BigFrameworkConstants.COPYRIGHT_STATEMENT, className, companyName));
		compilationUnit.setComment(comment);
	}

	/**
	 * Method to set comments to the methods
	 * 
	 * @param declaration - the <code>MethodDeclaration</code> where comments need to be set
	 */
	private void setMethodComments(MethodDeclaration declaration)
	{
		String methodName = declaration.getName();
		int argumentCount = declaration.getParameters().size();
		Type methodReturnType = declaration.getType();
		Comment methodComment = new JavadocComment();

		if (methodName.startsWith("get") && argumentCount == 0) {
			LOGGER.debug("Accesor method: " + methodName);
			String fieldName = StringUtils.uncapitalize(StringUtils.removeStart(methodName, "get"));
			methodComment.setContent(String.format(BigFrameworkConstants.GETTER_COMMENT, fieldName, fieldName));
		} else if (methodName.startsWith("is") && argumentCount == 0) {
			LOGGER.debug("Boolean accesor method: " + methodName);
			String fieldName = StringUtils.uncapitalize(StringUtils.removeStart(methodName, "is"));
			methodComment.setContent(String.format(BigFrameworkConstants.GETTER_COMMENT, fieldName, fieldName));
		} else if (methodName.startsWith("set") && argumentCount == 1 && methodReturnType instanceof VoidType) {
			LOGGER.debug("Mutator method: " + methodName);
			String fieldName = StringUtils.uncapitalize(StringUtils.removeStart(methodName, "set"));
			methodComment.setContent(String.format(BigFrameworkConstants.SETTER_COMMENT, fieldName, fieldName, fieldName));
		} else if (methodName.equalsIgnoreCase("equals") && argumentCount == 1 && methodReturnType instanceof PrimitiveType) {
			LOGGER.debug("The equals method.");
			methodComment.setContent(BigFrameworkConstants.EQUALS_COMMENT);
		} else if (methodName.equalsIgnoreCase("hashCode") && argumentCount == 0
				&& methodReturnType instanceof PrimitiveType) {
			LOGGER.debug("The hashCode method.");
			methodComment.setContent(BigFrameworkConstants.HASHCODE_COMMENT);
		} else if (methodName.equalsIgnoreCase("toString") && argumentCount == 0) {
			LOGGER.debug("The toString method.");
			methodComment.setContent(BigFrameworkConstants.TOSTRING_COMMENT);
		} else {
			LOGGER.debug("Not a common method");
			methodComment = null;
		}
		declaration.setComment(methodComment);
	}

	/**
	 * Method to access companyName
	 * 
	 * @return the companyName
	 */
	public String getCompanyName()
	{
		return companyName;
	}

	/**
	 * Method to mutate companyName.
	 * 
	 * @param companyName the companyName to set
	 */
	public void setCompanyName(String companyName)
	{
		this.companyName = companyName;
	}
}
