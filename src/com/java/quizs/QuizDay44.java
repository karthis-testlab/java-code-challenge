package com.java.quizs;

public class QuizDay44 {

	public static void main(String[] args) {

		try {
			QuizDay44 obj = new QuizDay44();
			obj.doSomething();
		} catch (MyClassException e) {
			System.out.println("Caught MyClassException: " + e.getMessage());
		}

	}

	public void doSomething() throws MyClassException {
		throw new MyClassException("An error occurred in MyClass.doSomething()");
	}

}

@SuppressWarnings("serial")
class MyClassException extends Exception {
	public MyClassException(String message) {
		super(message);
	}
}