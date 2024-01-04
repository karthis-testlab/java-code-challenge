package com.integer.challenge;

import org.junit.Test;

public class NumberPalindrome {
	
	@Test
	public void testNumberPalindrome() {
		System.out.println(isPalindrome(111));
		System.out.println(isPalindrome(100));
	}

	int reverseNumber(int number) {

		int reversedNumber = 0;

		if (number / 10 == 0)
			return number;

		while (number > 0) {
			reversedNumber = reversedNumber * 10 + number % 10;
			number /= 10;
		}

		return reversedNumber;

	}
	
	boolean isPalindrome(int number) {
		
		if(number == reverseNumber(number)) {
			return true;
		}
			
		return false;
	}

}
