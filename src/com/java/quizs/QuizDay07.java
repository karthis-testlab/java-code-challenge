package com.java.quizs;

public class QuizDay07 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Second second = new Second();
	}

}

class Second {
	
	public Second() {
		System.out.println("Constructor Invoked!");
	}
	
	{
		System.out.println("Anonymous Block!");
	}
	
}