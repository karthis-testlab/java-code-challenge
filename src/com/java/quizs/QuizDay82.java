package com.java.quizs;

public class QuizDay82 {
	
	String name;
	
	public QuizDay82(String n) {
		name = n;
	}

	public static void main(String[] args) {
		QuizDay82 m1 = new QuizDay82("guitar");
		QuizDay82 m2 = new QuizDay82("tv");
		System.out.println(m2.equals(m1));
	}
	
	@Override
	public boolean equals(Object obj) {
		QuizDay82 m = (QuizDay82) obj;
		if (m.name != null) {
			return true;
		}
		return false;
	}

}
