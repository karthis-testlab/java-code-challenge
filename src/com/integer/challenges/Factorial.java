package com.integer.challenges;

public class Factorial {
	
	/*
	 * 
	 * The Fibonacci series is a series where the next term is the sum of the
	 * previous two terms.
	 * 
	 * The first two terms of the Fibonacci sequence are 0 followed by 1
	 * 
	 *  Fibonacci Series: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34
	 * 
	 */
	
	public static void main(String[] args) {
		System.out.println(factorial(5));
		System.out.println(factorialRecursive(5));
	}
	
	static long factorial(int number) {
		long factorial = 1;
		for (int i = 1; i <= number; i++) {
			factorial *= i;
		}
		return factorial;
	}
	
	static long factorialRecursive(int number) {
		if(number <= 1) {
			return 1;
		}
		return number * factorial(number - 1);
	}

}