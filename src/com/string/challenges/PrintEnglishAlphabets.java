package com.string.challenges;

import static java.lang.System.*;

public class PrintEnglishAlphabets {

	public static void main(String[] args) {

		// print all character between 'A' to 'z'
		for (char i = 'A'; i <= 'z'; i++) {
			out.print(String.valueOf(i));
		}
		
		out.println("");

		// print all character between 'a' to 'z'
		for (char i = 'a'; i <= 'z'; i++) {
			out.print(String.valueOf(i));
		}

	}

}