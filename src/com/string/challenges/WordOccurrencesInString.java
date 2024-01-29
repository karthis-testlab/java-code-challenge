package com.string.challenges;

import java.util.Arrays;

public class WordOccurrencesInString {

	public static void main(String[] args) {
		
		String source = "Here is an example. Right here.";
		String word = "here";
		
		int count = 0;
        String[] words = source.split(" ");
        for(String eachWord: words) {
            if(eachWord.replaceAll("[^a-zA-Z0-9]", "").equalsIgnoreCase(word)) {
                count+=1;
            }
        }
        
        System.out.println("Code returned: "+count);
        
        System.out.println("Code returned: "+getOccurenceWord(source, "example"));
		
	}
	
	static int getOccurenceWord(String source, String word) {
		String cleanUpSource = source.replaceAll("\\.", "");
		return (int) Arrays.stream(cleanUpSource.split(" "))
				     .filter(eachWord -> eachWord.equalsIgnoreCase(word))
				     .count();				  
	}

}
