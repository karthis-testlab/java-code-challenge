package com.java.quizs;

import java.util.LinkedHashSet;
import java.util.Set;

public class QuizDay48 {

	public static void main(String[] args) {

		Set<Object> s = new LinkedHashSet<Object>();
		s.add(new String("1"));
		s.add(1);
		s.add(3);
		s.add(2);
		System.out.println(s);

	}

}