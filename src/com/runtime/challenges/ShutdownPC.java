package com.runtime.challenges;

public class ShutdownPC {

	public static void main(String[] args) {
		try {			
			// Shutdown the PC
			Runtime.getRuntime().exec(new String[] {"shutdown /s /t 1"});			
		} catch (Exception e) {
			e.printStackTrace();
		}		

	}

}
