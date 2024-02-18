package com.java.quizs;

public class QuizDay50 {

	public static void main(String[] args) {

		Number[] nb = new Number[6];
		nb[0] = 45;
		nb[1] = (byte) 67;
		nb[2] = 45.f;
		nb[3] = 45.00;
		nb[4] = 45324567L;
		// Gives a compile time error because 
		// String class is not the subclass of Number class.
		//nb[5] = "Vivek";
		for (Number n : nb) {
			System.out.print(" " + n);
		}

	}

}