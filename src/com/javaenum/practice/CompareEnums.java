package com.javaenum.practice;

public class CompareEnums {
	
	public enum DayOfWeek {
		MONDAY,
		TUESDAY,
		WEDNESDAY,
		THURSDAY,
		FRIDAY,
		SATURDAY,
		SUNDAY
	}
	
	public static void main(String[] args) {
		
		DayOfWeek enum1 = DayOfWeek.MONDAY;
		DayOfWeek enum2 = DayOfWeek.MONDAY;
		
		if(enum1.equals(enum2)) {
			System.out.println("Equals Method");
		}
		
		if(enum1 == enum2) {
			System.out.println("==");
		}
		
	}

}