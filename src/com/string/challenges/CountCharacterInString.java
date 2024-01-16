package com.string.challenges;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountCharacterInString {

	public static void main(String[] args) {

		String str = "Karthikeyan";
		char[] charArray = str.toCharArray();

		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();

		for (int i = 0; i < charArray.length; i++) {
			if (map.containsKey(charArray[i])) {
				System.out.println(charArray[i]);
				map.put(charArray[i], map.get(charArray[i]) + 1);
			} else {
				map.put(charArray[i], 1);
			}

		}

		System.out.println(map);

		// find frequency of each character in a given string using Java 8 streams
		Map<String, Long> collect = Arrays.stream(str.split("")).collect(
				Collectors.groupingBy(Function.identity(), Collectors.counting()));
		
		System.out.println(collect);

	}

}