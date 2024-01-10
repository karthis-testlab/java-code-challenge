package com.integer.challenges;

public class FibonacciSeries {

	public static void main(String[] args) {
		fibonacciSeriesForLoop(10);
		fibonacciSeriesWhileLoop(10);
	}

	static void fibonacciSeriesForLoop(int number) {
		int first = 0, second = 1;
		for (int i = 0; i < number; i++) {
			System.out.print(first+ " ");
			int sum = first + second;
			first = second;
			second = sum;
		}
	}
	
	static void fibonacciSeriesWhileLoop(int number) {
		int first = 0, second = 1, i = 0;
		while(i < number) {
			System.out.print(first+ " ");
			int sum = first + second;
			first = second;
			second = sum;
			i++;
		}
	}

}