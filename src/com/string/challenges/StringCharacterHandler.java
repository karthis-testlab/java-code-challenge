package com.string.challenges;

public class StringCharacterHandler {

	public static void main(String[] args) {
		System.out.println(isAllCharLowerCase("karthikeyan"));
		System.out.println(isAllCharLowerCase("Karthikeyan"));
		System.out.println(isAllCharUpperCase("KARTHIKEYAN"));
		System.out.println(isAllCharUpperCase("KARTHIKEYAn"));
	}
	
	public static boolean isAllCharLowerCase(String string) {
		return string.chars().allMatch(Character::isLowerCase);	
	}
	
	public static boolean isAllCharUpperCase(String string) {
		return string.chars().allMatch(Character::isUpperCase);	
	}

}
