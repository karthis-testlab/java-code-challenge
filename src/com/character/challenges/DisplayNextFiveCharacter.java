package com.character.challenges;

public class DisplayNextFiveCharacter {
	
	

	public static void main(String[] args) {
		DisplayNextFiveCharacter displayNextFiveCharacter = new DisplayNextFiveCharacter();
		displayNextFiveCharacter.display('A');
	}

	void display(char ch) {
		for (int i = 0; i < 5; i++) {
			if (ch > 'z') {
				ch = 'A';
			} else if (ch > 'Z' && ch < 'a') {
				ch = 'a';
			}
			System.out.print(ch++);
		}
	}

}