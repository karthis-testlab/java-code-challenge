package com.integer.challenges;

import java.util.Arrays;

public class FibonacciSeries {
	
	/*
	 * 
	 * The Fibonacci series is a series where the next term is the sum of the
	 * previous two terms.
	 * 
	 * The first two terms of the Fibonacci sequence are 0 followed by 1
	 * 
	 * Fibonacci Series: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34
	 * 
	 */

	public static void main(String[] args) {
		fibonacciSeriesForLoop(10);
		System.out.println("");
		fibonacciSeriesWhileLoop(10);
		System.out.println(""); 
		for (int i = 0; i < 10; i++) {
			System.out.print(fibonacciSeriesRecursive(i)+" ");
		}
		System.out.println(""); 
		fibonacciSeriesArray(5);
	}

	static void fibonacciSeriesForLoop(int number) {
		int first = 0, second = 1;
		System.out.print(first+" "+second+" ");
		for (int i = 2; i < number; i++) {			
			int sum = first + second;
			System.out.print(sum+ " ");
			first = second;
			second = sum;
		}
	}
	
	static void fibonacciSeriesWhileLoop(int number) {
		int first = 0, second = 1, i = 2;
		System.out.print(first+" "+second+" ");
		while(i < number) {			
			int sum = first + second;
			System.out.print(sum+ " ");
			first = second;
			second = sum;
			i++;
		}
	}
	
	
	/*
	 * 
	 * Fibonacci Series Using Recursive Approach
	 * 
	 * Since Fibonacci Number is the summation of the two previous numbers.
	 * We can use recursion as per the following conditions:
	 * 
	 * 1. Get the number whose Fibonacci series needs to be calculated.
	 * 2. Recursively iterate from value N to 1:
	 *    a) Base case: If the value called recursively is less than 1,
	 *                  the return argument number.
	 *    b) Recursive call: If the base case is not met, then recursive call
	 *                       for the previous two values as:              
	 *                  
	 * rescursive_function(n-1) + rescursive_function(n-2)  
	 * 
	 */
	static int fibonacciSeriesRecursive(int number) {
		
		// Base Case
		if (number <= 1)
			return number;
		
		// Recursive Call
		return fibonacciSeriesRecursive(number - 1) + fibonacciSeriesRecursive(number - 2);
	}
	
	static void fibonacciSeriesArray(int number) {
		int[] arrayOfNumbers = new int[number];
		arrayOfNumbers[0] = 0;
		arrayOfNumbers[1] = 1;
		for (int i = 2; i < number; i++) {
			arrayOfNumbers[i] = arrayOfNumbers[i - 1] + arrayOfNumbers[i - 2];
		}
		System.out.println(Arrays.toString(arrayOfNumbers));
	}

}