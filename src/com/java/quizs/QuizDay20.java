package com.java.quizs;

public class QuizDay20 {

	public static void main(String[] args) {
		
		int day = 4;
		String year;
		switch(day) {		
		case 1:
		case 2:
			year = "2020"; break;
		case 3:
		case 4:
		case 5:	
			year = "2022"; break;
		case 6:
		case 7:
			year = "2024"; break;
		case 8:
		default:
			year = "Invalid Day!";			
		
		}
		
		System.out.println(year); 
	

	}

}