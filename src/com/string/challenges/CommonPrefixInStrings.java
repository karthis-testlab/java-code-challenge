package com.string.challenges;

public class CommonPrefixInStrings {

	public static void main(String[] args) {
		
		String[] strings = {"flower", "flight"};
		String prefix = "";
		
		int minLength = Math.min(strings[0].length(), strings[1].length());
		for (int i = 0; i < minLength; i++) {
			if(strings[0].charAt(i) != strings[1].charAt(i)) {
				prefix += strings[0].substring(0, i);
				break;
			}
		}
		
		System.out.println(prefix);

	}

}
