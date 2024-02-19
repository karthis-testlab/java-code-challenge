package com.java.quizs;

public class QuizDay47 {
	
	public static void main(String[] args) {
		int i = 0;
		int j = i;
		
		j = i++ + j;
		
		System.out.println(i+"-"+j);
	}

}