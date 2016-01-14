/**
 * @(#) EIMStringUtilsTest.java
 *      Copyright © 2015 - Cognizant Technology Solutions. All rights reserved.
 *      Usage is subject to license terms. Any unauthorized usage will be prosecuted.
 */
package api.bigframework.utils;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * JUnit test cases for <code>EIMStringUtils</code> class.
 * 
 * @author Arka Ghosh
 * @since Aug 5, 2015
 */
public class APIStringUtilsTest
{
	/**
	 * This method is called before the execution of each of the test cases and is used to
	 * instantiate the global variables.
	 * 
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception
	{
	}

	/**
	 * This method is called after the execution of each of the test cases and is used to
	 * nullify the global variables.
	 * 
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception
	{
	}

	/**
	 * Test method for
	 * {@link api.bigframework.utils.APIStringUtils#toJavaCamelCase(java.lang.String)}.
	 */
	@Test
	public void testToJavaCamelCase()
	{
		String actualOutput = APIStringUtils.toJavaCamelCase("This_IS_a_tESt_String");
		assertEquals("thisISATEStString", actualOutput);
		actualOutput = APIStringUtils.toJavaCamelCase("zeroZeroOne");
		assertEquals("zeroZeroOne", actualOutput);
		actualOutput = APIStringUtils.toJavaCamelCase("zerozerotwenty_zeroSixteenOne");
		assertEquals("zerozerotwentyZeroSixteenOne", actualOutput);
	}

	/**
	 * Test method for
	 * {@link api.bigframework.utils.APIStringUtils#toProperCase(java.lang.String)}
	 */
	@Test
	public void testToProperCase()
	{
		String actualOutput = APIStringUtils.toProperCase("exPEctedoUTPut");
		assertEquals("Expectedoutput", actualOutput);
	}

}
