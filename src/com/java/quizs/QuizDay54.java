package com.java.quizs;

public class QuizDay54 {

	public static void main(String[] args) {
		System.out.println(anyMethod());
	}

	@SuppressWarnings("finally")
	static int anyMethod() {
		try {
			return 10;
		} catch (Exception e) {
			return 20;
		} finally {
			return 30;
		}
	}

}