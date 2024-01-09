package com.string.challenges;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

public class SmallestWindowString {

	/*
	 * Given a string, find the length of the smallest window that contains every
	 * distinct character. Characters may appear more than once in the window.
	 * 
	 * For example, given "jiujitsu", you should return 5, corresponding to the
	 * final five letters.
	 */

	@Test
	public void testSmallestWindowString() {
		System.out.println(lengthSmallestWindow("Karthikeyan"));
		System.out.println(lengthSmallestWindowUsingTwoPointer("abcda"));
	}

	int lengthSmallestWindow(String string) {
		char[] charArray = string.toCharArray();
		Set<Character> set = new HashSet<Character>();
		for (Character character : charArray) {
			set.add(character);
		}
		return set.size();
	}
	
	int lengthSmallestWindowUsingTwoPointer(String string) {		
		char[] charArray = string.toCharArray();
		int left = 0, right = charArray.length - 1;
		Set<Character> set = new HashSet<Character>();
		while(left <= right) {
			set.add(charArray[left++]);
			set.add(charArray[right--]);
		}
		return set.size();
	}

}