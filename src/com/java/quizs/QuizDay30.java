package com.java.quizs;

public class QuizDay30 {
	
	static String event = "Start";
	
	public QuizDay30() {
		event = "Over";
	}

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		System.out.println("It'z " + event);
		QuizDay30 object = new QuizDay30();
		System.out.println("It'z " + object.event);
	}

}
