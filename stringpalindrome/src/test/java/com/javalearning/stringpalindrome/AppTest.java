package com.javalearning.stringpalindrome;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
	
	String input1= "noon";
	
	App app=new App();
	boolean expected=true;
	
	@Test
	public void isPositiveResultTest() {
		assertEquals(expected, app.testReverse(input1));
	}
	
	@Test
	public void isNegativeResultTest() {
		assertEquals(false, app.testReverse("abc"));
	}

	@Test(expected=IllegalArgumentException.class)
	public void isNotPalindromeExceptionTest() {
		assertEquals(false, app.testReverse(null));
	}
}
   