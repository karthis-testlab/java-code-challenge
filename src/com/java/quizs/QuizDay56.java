package com.java.quizs;

public class QuizDay56 {

	public static void main(String[] args) {
		
		int result = divide(10, 0);
		System.out.println("Result: "+result);

	}
	
	public static int divide(int a, int b) {
		try {
			return a / b;
		} catch (ArithmeticException e) {
			System.err.println("Exception caught: "+e.toString());
			return -1;
		} finally {
			System.out.println("Finally block is executed.");
		}
	}

}
