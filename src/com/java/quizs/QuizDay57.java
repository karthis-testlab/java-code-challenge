package com.java.quizs;

public class QuizDay57 {

	public static void main(String[] args) {

		int[] num = new int[5];
		
		for (int i = 1; i < 7; i++) {
			num[i] += i;
		}
		
		for (int n : num) {
			System.out.println(n);
		}

	}

}