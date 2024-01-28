package com.java.quizs;

public class QuizDay80 {

	public static void main(String[] args) {
		QuizDay80 outer = new QuizDay80();
		Animal animal = outer.new Cat();
		animal.sound();
	}
	
	public class Animal {
		public void sound() {
			System.out.println("General Sound!");
		}
	}
	
	public class Cat extends Animal {
		@Override
		public void sound() {
			System.out.println("Meowwwwww...");
		}
	}

}