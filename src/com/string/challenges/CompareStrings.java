package com.string.challenges;

public class CompareStrings {

	public static void main(String[] args) {
		
		String name = "Karthikeyan";
		String  firstName = "Karthikeyan";
		
		System.out.println(name == firstName);
		
		String object1 = new String("Karthikeyan");
		String object2 = new String("Karthikeyan");
		
		System.out.println(name == object1);
		
		System.out.println(object1 == object2);

	}

}
