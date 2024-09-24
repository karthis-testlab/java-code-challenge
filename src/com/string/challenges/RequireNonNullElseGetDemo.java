package com.string.challenges;

import java.util.Objects;

public class RequireNonNullElseGetDemo {

	public static void main(String[] args) {
	 
		String name = null;
		String defaultName = "Java";
		
		String languageName = Objects.requireNonNullElseGet(name, () -> defaultName);
		System.out.println(" Programming language name: "+ languageName);

	}

}
