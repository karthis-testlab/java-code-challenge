package com.string.challenge;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

public class SmallestWindowString {
	
	@Test
	public void testSmallestWindowString() {
		System.out.println(lengthSmallestWindow("Karthikeyan"));
	}
	
	int lengthSmallestWindow(String string) {
		char[] charArray = string.toCharArray();
		Set<Character> set = new HashSet<Character>();
		for (Character character : charArray) {
			set.add(character);
		}
		return set.size();
	}

}