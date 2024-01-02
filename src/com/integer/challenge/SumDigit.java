package com.integer.challenge;

import org.junit.Test;

public class SumDigit {

	@Test
	public void testSumDigit() {
		
		int number = 123456;
		System.out.println(findSumDigitUsingWhileLoop(number));
		System.out.println(findSumDigitUsingForLoop(number));
		System.out.println(number/10);
		System.out.println(number%10);

	}

	/*
	 * 1) 
	 * 
	 * 
	 */
	int findSumDigitUsingWhileLoop(int number) {
		
		int sum = 0;
		
		if(number%10 == 0)
			return number;
		
		while (number > 0) {
			sum += number%10;
			number /= 10;
		}
		
		return sum;
	}
	
	int findSumDigitUsingForLoop(int number) {
		
		int sum;
		
		if(number%10 == 0)
			return number;
		
		for (sum = 0; number != 0; number/=10) {
			sum+=number%10;
		}
		
		return sum;
	}

}