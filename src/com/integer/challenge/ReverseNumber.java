package com.integer.challenge;

import org.junit.Test;

public class ReverseNumber {
	
	@Test
	public void testReverseNumber() {
		int number = 6;
		System.out.println(reverseNumber(number));
	}

	int reverseNumber(int number) {
		
		int reversedNumber = 0;
		
		if(number%10 == 0)
			return number;
		
		while (number > 0) {			
			reversedNumber = reversedNumber * 10 + number % 10;
			number/=10;
		}
		
		return reversedNumber;
		
	}

}