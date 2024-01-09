package com.string.challenges;

public class CountAIntheGivenString {

	public static void main(String[] args) {
		String str = "Welcome to IndiaAaaA";
		String newString = str.replaceAll("[aA]", "");
		int count = str.length() - newString.length();
		System.out.println(count);
	}

}