/**
 * @(#) DataLoadingException.java
 *      Copyright © 2015 - Cognizant Technology Solutions. All rights reserved.
 *      Usage is subject to license terms. Any unauthorized usage will be prosecuted.
 */
package api.bigframework.exceptions;

/**
 * The custom exception class for data loading
 * 
 * @author Arka Ghosh
 * @since Aug 20, 2015
 * @version 1.0
 */
public class BigFrameworkException extends Exception
{
	// Generated version UID
	private static final long serialVersionUID = -5210228029351814813L;

	/**
	 * @see java.lang.Exception#Exception(java.lang.String)
	 */
	public BigFrameworkException(String message)
	{
		super(message);
	}

	/**
	 * @see java.lang.Exception#Exception(java.lang.Throwable)
	 */
	public BigFrameworkException(Throwable cause)
	{
		super(cause);
	}

	/**
	 * @see java.lang.Exception#Exception(java.lang.String,java.lang.Throwable)
	 */
	public BigFrameworkException(String message, Throwable cause)
	{
		super(message, cause);
	}
}
