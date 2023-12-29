package com.string.challenge;

import java.util.HashMap;
import java.util.Map;

public class CountCharacterInString {

	public static void main(String[] args) {
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		String str = "Karthikeyan";
		char[] charArray = str.toCharArray();
		for (int i = 0; i < charArray.length; i++) {			
			if (map.containsKey(charArray[i])) {
				System.out.println(charArray[i]);
				map.put(charArray[i], map.get(charArray[i]) + 1);
			} else {
				map.put(charArray[i], 1);
			}
			
		}
		System.out.println(map);
	}

}