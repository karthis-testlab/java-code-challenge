package com.java.quizs;

public class QuizDay31 {

	public static void main(String[] args) {
		
		try {
			int[] numbers = new int[3];
			numbers[4] = 5;
			System.out.println("A");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("B");
		}
	

	}

}
