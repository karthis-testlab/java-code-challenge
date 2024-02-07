package com.date.challenges;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class AgeCalculation {

	public static void main(String[] args) {
		
		int year = 0, month = 0, day = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the year you were born: ");
		year = scanner.nextInt();
		
		System.out.println("Enter the month you were born: ");
		month = scanner.nextInt();
		
		System.out.println("Enter the day you were born: ");
		day = scanner.nextInt();
		
		LocalDate birthDate = LocalDate.of(year, month, day);
		LocalDate currentDate = LocalDate.now();
		
		Period age = Period.between(birthDate, currentDate);
		
		System.out.println("Your age is: "+ age.getYears() + " years " + 
		               age.getMonths() + " months " + age.getDays() + "days ");
		
		scanner.close();		 

	}

}
