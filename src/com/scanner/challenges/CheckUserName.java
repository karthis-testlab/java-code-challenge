package com.scanner.challenges;

import java.util.Scanner;

public class CheckUserName {

	public static void main(String[] args) {
		
		String name = "";
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter name: ");
		
		name = input.nextLine();
		
		if(name == "Admin") {
			System.out.println("You're having privilege for admin rights.");
		} else {
			System.out.println("You don't have admin privilege rights.");
		}
		
		input.close();

	}

}
