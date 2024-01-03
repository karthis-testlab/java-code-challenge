package com.integer.challenge;

import org.junit.Test;

public class ReverseNumber {
	
	@Test
	public void testReverseNumber() {
		int number = 123;
		System.out.println(reverseNumber(number));
	}

	int reverseNumber(int number) {
		
		int reversedNumber = 0;
		
		while (number > 0) {	
			int remainder = number % 10;
			reversedNumber = reversedNumber * 10 + remainder;
			number/=10;
		}
		
		return reversedNumber;
		
	}

}