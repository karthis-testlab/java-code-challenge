package com.string.challenges;

public class CommonPrefixInStrings {

	public static void main(String[] args) {
		
		String[] strings = {"flower", "flow"};
		String prefix = "";
		
		int minLength = Math.min(strings[0].length(), strings[1].length());
		for (int i = 0; i < minLength; i++) {
			if(strings[0].charAt(i) != strings[1].charAt(i)) {
				System.out.println(strings[0].charAt(i));
				break;
			}
		}

	}

}
