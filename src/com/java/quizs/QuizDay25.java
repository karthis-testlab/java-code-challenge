package com.java.quizs;

public class QuizDay25 {

	public static void main(String[] args) {
		
		try {
			throw new RuntimeException("Error");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}