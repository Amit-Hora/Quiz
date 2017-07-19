package com.codefriend.quiz;

import static org.junit.Assert.assertEquals;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.junit.Test;

public class Palindrome {
	private static final transient Logger logger = Logger.getLogger(Palindrome.class.getName());

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the string to check if the string is Palindrome");
		String inputString = scanner.nextLine();
		
		
		if(isPalindrome(inputString)){
			logger.log(Level.INFO, "String is Palindrome");
		}else{
			logger.log(Level.INFO, "String is Not Palindrome");
		}
	

	}

	/**
	 * 
	 * @param inputString -> string to check for palindrome
	 * @return true if palindrome else false
	 */
	public static boolean isPalindrome(String inputString) {
		int inputStringLength = inputString.length();
		int begin = 0, end = 0, middle = 0;

		begin = 0;
		end = inputStringLength - 1;
		middle = (begin + end) / 2;

		for (int i = 0; i < middle; i++) {
			if (inputString.charAt(begin + i) == inputString.charAt(end - i))
				continue;
			else {

				return false;
			}
		}
		return true;
	}
	
	 @Test
	    public void myObjectEqualsTest(){
	         
	       String inputString="1221";
	        assertEquals(isPalindrome(inputString),true);
	        
	    }
}
