package com.string.challenges;

import java.util.regex.Pattern;

public class ConvertLowerToUpperViceVersaCases {
	
	public static void main(String[] args) {
		String string = "NaMaShIvAyA";
		String[] stringArray = string.split("");
		for (String element : stringArray) {
			if(Pattern.matches("[A-Z]", element)) {
				System.out.print(element.toLowerCase());
			} else {
				System.out.print(element.toUpperCase());
			}
		}		
	}

}