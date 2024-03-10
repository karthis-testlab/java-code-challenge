package com.date.challenges;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
public class GetCurrentDateAndDay {

	public static void main(String[] args) {
		
		LocalDate currentDate = LocalDate.now();
		SimpleDateFormat dateFormat = new SimpleDateFormat("d");
		System.out.println(dateFormat.format(new Date()));
		System.out.println(currentDate.getDayOfWeek());
		
		LocalDate date = LocalDate.of(2024, 3, 9);
		System.out.println(date.getDayOfWeek());
		
		System.out.println(currentDate.getMonth().toString());
		System.out.println(currentDate.getYear());

	}

}