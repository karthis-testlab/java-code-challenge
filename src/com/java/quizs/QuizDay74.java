package com.java.quizs;

public class QuizDay74 {

	public static void main(String[] args) {
		int x = 9;
		if(x == 9) {
			//int x = 8; -> if we give like this we get compilation error
			//              Duplicate local variable
			x = 8;
			System.out.println(x);
		}
	}

}