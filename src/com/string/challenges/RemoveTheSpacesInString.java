package com.string.challenges;

public class RemoveTheSpacesInString {

	public static void main(String[] args) {

		String input = "TODO Auto-generated method stub";
		
		String result = input.replaceAll("\\s+", "");
		
		System.out.println(result);

	}

}