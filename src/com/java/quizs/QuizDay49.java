package com.java.quizs;

public class QuizDay49 {
	
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		Writer writer = new Programmer();
		writer.write();
	}

}

abstract class Writer {
	public static void write() {
		System.out.println("Writing...");
	}
}

class Author extends Writer {
	public static void write() {
		System.out.println("Writing book");
	}
}

class Programmer extends Writer {
	public static void write() {
		System.out.println("Writing code");
	}
}