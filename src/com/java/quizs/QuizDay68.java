package com.java.quizs;

public class QuizDay68 {

	public static void main(String[] args) {
		
		int[] numbers = {1, 2, 3, 4, 5};
		
		for (int i = 0; i < numbers.length; i++)
			numbers[i] *= 2;
		
		for(int number: numbers)
			System.out.print(number+" ");

	}

}
