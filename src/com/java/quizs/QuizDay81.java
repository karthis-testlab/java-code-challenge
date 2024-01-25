package com.java.quizs;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class QuizDay81 {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		
		Object obj = new ArrayList().iterator();
		
		System.out.print((obj instanceof List)+", ");
		System.out.print((obj instanceof Iterator)+", ");
		System.out.print((obj instanceof ListIterator));
		

	}

}
