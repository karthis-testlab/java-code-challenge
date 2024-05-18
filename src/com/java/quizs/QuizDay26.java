package com.java.quizs;

public class QuizDay26 {

	@SuppressWarnings("null")
	public static void main(String[] args) {
		
		try {
			String text = null;
			System.out.println(text.length());
		} catch (NullPointerException e) {
			System.out.println("NPE");
		}

	}

}