package com.integer.challenges;

public class PostPreIncrementAndAddOperation {

	public static void main(String[] args) {
		
		int a = 10;
		int b = a++ + ++a;

		System.out.println(b);
		
	}

}