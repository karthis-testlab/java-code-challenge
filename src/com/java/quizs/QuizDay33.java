package com.java.quizs;

public class QuizDay33 {	

	/*
	 * The output of the below code of lines are 'Java'
	 * 
	 * Java's string is immutable. When we call str.concat('Programming'),
	 * it creates a new string 'Java Programming' but it doesn't affect the
	 * original string 'Java'. So, when we print str, code will print 'Java'
	 * 
	 */
	public static void main(String[] args) {
		
		String str = "Java";
		str.concat("Programming");
		System.out.println(str);

	}

}