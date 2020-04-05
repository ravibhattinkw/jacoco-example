package com.javalearning.stringpalindrome;

/**
 * Hello world!
 *
 */
public class App 
{
	public boolean testReverse(String input) {
		
		if (input == null) {
			throw new IllegalArgumentException("Input cannot be null");
		}
		if (input.equals(reverse(input))) {
			return true;
		} else {
			return false;
		}
	}
	
	private String reverse(String input) {
		String rev = "";
		for (int i = input.length() - 1; i >= 0; i--) {
			rev = rev + input.charAt(i);
		}
		return rev;
			
	}
    //public static void main( String[] args )
    //{
        //System.out.println( "Reverse String!" );
    //}
}
