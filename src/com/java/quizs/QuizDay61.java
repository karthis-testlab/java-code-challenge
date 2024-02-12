package com.java.quizs;

public class QuizDay61 {

	public static void main(String[] args) {
		/*
		 * The Java complier determines which version of invokeMethod
		 * to invoke based on the argument type.
		 * 
		 * Since null can match both Object and String, the complier
		 * chooses the more specific type, which is String in this case.
		 * 
		 */
		invokeMethod(null);

	}
	
	public static void invokeMethod(Object obj) {
		System.out.println("Object method");
	}
	
	public static void invokeMethod(String str) {
		System.out.println("String method");
	}

}