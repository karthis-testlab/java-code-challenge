package com.java.quizs;

public class QuizDay75 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Bb b = new Cc();		
	}

}

class Aa {
	public Aa() {
		System.out.println("A");
	}
}

class Bb extends Aa {
	public Bb() {
		System.out.println("B");
	}
}

class Cc extends Bb {
	public Cc() {
		System.out.println("C");
	}
}