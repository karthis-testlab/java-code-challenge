package com.string.challenge;

public class RemoveTheNumberInTheGivenString {
	
	public static void main(String[] args) {
		String str = "abc12233490gbhbgks098908";
		String newString = str.replaceAll("[0-9]", "");
		System.out.println(newString);
	}

}