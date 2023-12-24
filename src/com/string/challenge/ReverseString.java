package com.string.challenge;

import org.junit.Test;

public class ReverseString {
	
	@Test
	public void testReverseString() {
		String str = "hello";
		reverseString(str);
		reverseStringUsing2Pointer(str);
	}

	private void reverseString(String str) {
		char[] charArray = str.toCharArray();	// memory copy
		for (int i = charArray.length - 1; i >= 0; i--) { // O[n]
			System.out.print(charArray[i]);
		}
	}
	
	private void reverseStringUsing2Pointer(String str) {
		char[] charArray = str.toCharArray();	
		int left = 0, right = charArray.length - 1;
		while(left < right) { // O[n/2] => O[n]
			// swap
			char temp = charArray[left];
			charArray[left++] = charArray[right];
			charArray[right--] = temp;
		}
		System.out.println(new String(charArray));
	}

}