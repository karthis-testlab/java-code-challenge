package com.string.challenges;

import java.util.regex.Pattern;

import org.junit.Test;

public class ReverseVowelsOnlyInTheString {
	
	@Test
	public void testReverseVowelsOnlyInTheString() {
		String str = "hello";
		reverseVowelsOnlyInTheString(str);	
		String vowels = "aeiou";
		reverseVowelsOnlyInTheString(vowels);
		String noVowels = "bcd";
		reverseVowelsOnlyInTheString(noVowels);
	}

	/*
	 * 
	 * If both are vowels -> Swap
	 * If only left is vowels -> move right--;
	 * If only right is vowels -> move left++;
	 * 
	 */
	private void reverseVowelsOnlyInTheString(String str) {		
		int left = 0, right = str.length() - 1;
		char[] charArray = str.toCharArray();
		
		while(left < right) {
			if(isVowels(charArray[left]) && isVowels(charArray[right])) {
				char temp = charArray[left];
				charArray[left++] = charArray[right];
				charArray[right--] = temp;
			} else if(isVowels(charArray[left])) {
				right--;
			} else {
				left++;
			}
		}
		
		System.out.println(new String(charArray));
	}
	
	boolean isVowels(char ch) {
		if(Pattern.compile("[aeiouAEIOU]").matcher(String.valueOf(ch)).matches())
			return true;
		return false;
	}

}