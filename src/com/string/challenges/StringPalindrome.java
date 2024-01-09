package com.string.challenges;

public class StringPalindrome {

	public static void main(String[] args) {
		System.out.println(isPalindrome("Hello", reverseString("Hello")));
		System.out.println(isPalindrome("MOM", reverseString("MOM")));
	}
	
	static boolean isPalindrome(String originalString, String reverseString) {
		if(originalString.equals(reverseString)) {
			return true;
		}
		return false;		
	}
	
	static String reverseString(String str) {
		String newStr = "";
		char[] charArray = str.toCharArray();		
		for (int i = charArray.length - 1; i >= 0; i--) {
			newStr+=Character.toString(charArray[i]);
		}
		return newStr;
	}

}