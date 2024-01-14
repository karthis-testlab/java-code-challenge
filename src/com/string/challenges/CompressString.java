package com.string.challenges;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class CompressString {

	public static void main(String[] args) {
		//compressString("aaabbcca");
		compressStringApproach2("aaabbccaad");
	}
	
	static void compressString(String string) {
		char[] charArray = string.toCharArray();
		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		for (char c : charArray) {
			if(map.containsKey(c)) {
				map.put(c, map.get(c) + 1);
			} else {
				map.put(c, 1);
			}
		}
		for (Entry<Character, Integer> pair : map.entrySet()) {
			System.out.print(pair.getKey());
			System.out.print(pair.getValue());
		}
	}
	
	static void compressStringApproach2(String string) {
		char currentCharacter = string.charAt(0);
		int count = 1;
		StringBuilder compressed = new StringBuilder();
		for (int i = 1; i < string.length(); i++) {
			if(string.charAt(i) == currentCharacter) {
				count++;
			} else {
				compressed.append(currentCharacter);
				compressed.append(count);
				currentCharacter = string.charAt(i);
				count = 1;
			}
		}		
		compressed.append(currentCharacter);
		compressed.append(count);
		System.out.println(compressed.toString());
	}

}