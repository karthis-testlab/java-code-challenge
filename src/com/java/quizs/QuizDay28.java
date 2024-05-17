package com.java.quizs;

import java.util.ArrayList;

public class QuizDay28 {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		
		ArrayList obj = new ArrayList();  
		obj.add("A");	
		obj.add("B");
		obj.add(1, "C");
		obj.add("D");
		obj.add(3, "c");
		System.out.println(obj);
	}

}