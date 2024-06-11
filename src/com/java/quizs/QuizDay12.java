package com.java.quizs;

public class QuizDay12 {

	public static void main(String[] args) {
		
		int x;
		x = 5;
		{
			int y = 6;
			System.out.println(x+ " " +y);
		}
		// Compiler Error: Create local variable y
		// System.out.println(x+ " " +y);

	}

}