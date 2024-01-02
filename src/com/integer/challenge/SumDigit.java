package com.integer.challenge;

import org.junit.Test;

public class SumDigit {

	@Test
	public void testSumDigit() {
		
		int number = 9;
		System.out.println(findSumDigit(number));

	}

	int findSumDigit(int number) {
		
		int sum = 0, digit = 0;
		
		if(number%10 == 0)
			return number;
		
		while (number > 0) {
			digit = number%10;
			sum += digit;
			number /= 10;
		}
		
		return sum;
	}

}