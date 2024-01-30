package com.java.quizs;

public class QuizDay76 {
	
	public static void main(String[] args) {
		B b = new B();
		b.display();
	}

}

class A {
	String s = "Class A";
}

class B extends A {
	String s = "Class B";
	
	void display() {
		System.out.println(s);
		System.out.println(super.s);
	}
}