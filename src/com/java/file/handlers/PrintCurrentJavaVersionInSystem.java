package com.java.file.handlers;

public class PrintCurrentJavaVersionInSystem {

	public static void main(String[] args) {
		
		String java_version = System.getProperty("java.version");	
		System.out.println("Java Version in the system -> "+java_version+"v.");

	}

}