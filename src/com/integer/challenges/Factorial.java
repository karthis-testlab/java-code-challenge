package com.integer.challenges;

public class Factorial {	
	
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