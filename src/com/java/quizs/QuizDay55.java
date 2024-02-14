package com.java.quizs;

public class QuizDay55 {

	public static void main(String[] args) {
		
		try {
			System.out.println("Inside try block.");
			System.exit(0);
		} catch (Exception e) {
			System.out.println("Exception Caught: "+e.toString());
		} finally {
			System.out.println("Finally block is executed.");
		}
	

	}

}