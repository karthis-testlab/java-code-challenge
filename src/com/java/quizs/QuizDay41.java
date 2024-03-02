package com.java.quizs;

public class QuizDay41 {

	public static void main(String[] args) {
		
		var number = 128;
		var first = Integer.valueOf(number);
		var second = Integer.valueOf(number);
		System.out.println(first == second);
		// To make the condition true
		System.out.println(first.equals(second));

	}

}