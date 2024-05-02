package com.character.challenges;

import java.util.Scanner;

public class DisplayNextFiveCharacter {
	
   /*
    *  Write a java program to enter a letter and display next five letter
    *  Input - capital (W)
    *  Output - XYZab
    *  
    *   Or
    *   
    *  Input - small (x)
    *  Output - yzABC 
    * 
    */

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter an Alphabet: ");
		char ch = in.next().charAt(0);
		
		DisplayNextFiveCharacter displayNextFiveCharacter = new DisplayNextFiveCharacter();
		displayNextFiveCharacter.display(ch);
		
		in.close();
	}

	void display(char ch) {
		for (int i = 0; i < 5; i++) {
			ch++;
			if (ch > 'z') {
				ch = 'A';
			} else if (ch > 'Z' && ch < 'a') {
				ch = 'a';
			}
			System.out.print(ch);
		}
	}

}