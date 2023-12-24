package com.string.challenge;

public class RemoveTheVowelsInTheGivenString {
	
	public static void main(String[] args) {
		String str = "Welcome to IndiaAaaA";
		String newString = str.replaceAll("[aeiouAEIOU]", "");
		System.out.println(newString);
	}

}