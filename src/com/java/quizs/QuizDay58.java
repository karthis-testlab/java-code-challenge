package com.java.quizs;

public class QuizDay58 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		try {

			System.out.println(1);

			int i = Integer.parseInt("ABC");

			System.out.println(2);

		} catch (NumberFormatException nfe) {
			System.out.println(3);
		} catch (Exception e) {
			System.out.println(4);
		} finally {
			System.out.println(5);
		}

	}

}
