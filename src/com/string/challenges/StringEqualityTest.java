package com.string.challenges;

public class StringEqualityTest {

	public static void main(String[] args) {
		String s1 = "code";
		String s2 = "co"+"de";
		String s3 = s1 + "";
		String s4 = s3.intern();
		System.out.println((s1 == s2) + " " + (s1 == s3) + " " + (s1 == s4));
	}

}