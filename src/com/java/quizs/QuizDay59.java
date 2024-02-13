package com.java.quizs;

public class QuizDay59 {

	public static void main(String[] args) {
		
		Child child = new Child();
		child.print();

	}	

}

class Parent {
	void print() {
		System.out.println("Base Class");
	}
}

class Child extends Parent {
	@Override
	void print() {			
		super.print();
		System.out.println("Derived Class");
	}
}