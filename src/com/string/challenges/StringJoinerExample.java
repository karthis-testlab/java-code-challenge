package com.string.challenges;

import java.util.StringJoiner;

public class StringJoinerExample {

	public static void main(String[] args) {
		
		StringJoiner joiner = new StringJoiner(",", "[", "]");
		
		joiner.add("FirstName");
		joiner.add("LastName");
		joiner.add("age");
		joiner.add("email_id");
		
		System.out.println(joiner);
	}

}
