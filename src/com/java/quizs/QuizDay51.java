package com.java.quizs;

public class QuizDay51 {

	public static void main(String[] args) {

		System.out.println(anyMethod());

	}

	static int anyMethod() {
		int i = 1;
		try {
			i = i + 1;
			return i;
		} catch (Exception e) {
			i = i + 2;
		} finally {
			i = i + 3;
		}
		return i;
	}

}