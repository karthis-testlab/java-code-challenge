package com.integer.challenge;

import org.junit.Test;

public class ReverseNumber {
	
	@Test
	public void testReverseNumber() {
		int number = 123;
		System.out.println(reverseNumber(number));
		System.out.println(checkIfLastDigitZeroAndReverse(120)); 
	}

	int reverseNumber(int number) {
		
		int reversedNumber = 0;
		
		if (number % 10 == 0) 
			return number;
			
		
		while (number > 0) {	
			int remainder = number % 10;
			reversedNumber = reversedNumber * 10 + remainder;
			number/=10;
		}
		
		return reversedNumber;
		
	}
	
	int checkIfLastDigitZeroAndReverse(int number) {
		String string = String.valueOf(number);	
		StringBuilder stringBuilder = null;
		if(string.substring(string.length()-1).equals("0")) {
		 stringBuilder = new StringBuilder(string);
			stringBuilder.reverse();
		}
		return Integer.parseInt(stringBuilder.toString());
	}

}