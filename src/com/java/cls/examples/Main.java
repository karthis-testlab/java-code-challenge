package com.java.cls.examples;

public class Main extends A {
	
	static {
		System.out.println("Static block in Main");
	}

	public static void main(String[] args) {
		new Main();
	}

}