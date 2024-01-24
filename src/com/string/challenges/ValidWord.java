package com.string.challenges;

import java.util.regex.Pattern;

public class ValidWord {
	
	/*
	 * 
	 * Problem Statement:
	 * 
	 * The problem statement asks to determine the number of valid words in a given string. 
	 * A valid word contains at least 3 characters with only alphanumeric characters 
	 * (i.e., numbers 0-9, letters A-Z, either case), 
	 * at least one vowel (‘a’, ‘e’, ‘i’, ‘o’, ‘u’), 
	 * and at least one consonant. 
	 * 
	 */
	public static void main(String[] args) {		
		
		int count = 0;
		String sentence = "The given string is T0yaq i9yej Tayq0";
		for (String word : sentence.split(" ")) {
			if(isValidWord(word))
				count++;
		}
	    System.out.println("Number of word in the given sentence is: "+count);

	}
	
		
	/**
	 * This method is used to validate the given contains three alphanumeric characters,
	 * at least on vowel and at least one constant.
	 * @param word - String data type to compare with regex
	 * @return boolean value if word matches the given string
	 */
	public static boolean isValidWord(String word) {
		 String regex = "(\\w){3}([aeiouAEIOU]){1}([^aeiouAEIOU]){1}";
		 return Pattern.matches(regex, word);
	}

}
