package com.integer.challenge;

import org.junit.Test;

public class SumDigit {

	@Test
	public void testSumDigit() {
		
		int number = 123456;
		System.out.println(findSumDigitUsingWhileLoop(number));
		System.out.println(findSumDigitUsingForLoop(number));
		System.out.println(findSumDigitUsingRecursion(number));
		System.out.println(number/10);
		System.out.println(number%10);

	}

	/*
	 * 
	 * 1) Read (or) initialize an integer "number".
	 * 2) Declare a variable (sum) to store the sum of numbers and initialize to 0.
	 * 3) Find remainder by using the modulo (%) operator. It gives the last digit of the number (number).
	 * 4) Add the last digit to the variable sum.
	 * 5) Divide the number (number) by 10. It removes the last digit of number.
	 * 6) Repeat the above steps (3 to 5) until the number (number) becomes 0. 
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
	
	int findSumDigitUsingRecursion(int number) {
		
		if(number%10 == 0)
			return number;
		
		return number == 0 ? number : number%10 + findSumDigitUsingRecursion(number/10);
		
	}

}