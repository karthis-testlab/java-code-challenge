package com.string.challenges;

import java.util.StringTokenizer;  

public class CountNumberOfWordsInString {

	public static void main(String[] args) {
		
		String sentence = "I Love Java and SpringBoot Framewrok.";
		
		System.out.println(countWordUsingSplitMethod(sentence));
		System.out.println(countWordUsingStringTokenizer(sentence));
		System.out.println(countWordWithoutSplitAndStringTokenizer(sentence));
		

	}
	
	public static int countWordUsingSplitMethod(String sentence) {
		if(sentence == null || sentence.isEmpty()) {
			return 0;
		}
		return sentence.split(" ").length;	
	}
	
	public static int countWordUsingStringTokenizer(String sentence) {
		if(sentence == null || sentence.isEmpty()) {
			return 0;
		}
		StringTokenizer tokens = new StringTokenizer(sentence);
		return tokens.countTokens();
	}
	
	public static int countWordWithoutSplitAndStringTokenizer(String sentence) {
		int count = 0;
		if(sentence == null || sentence.isEmpty()) {
			return 0;
		}
		String newSentence = sentence.replaceAll(" ", "#");		
		for (int i = 0; i < newSentence.length(); i++) {
			if(newSentence.charAt(i) == '#') {
				count++;
			}
		}
		return count+1;
	}

}
