package com.java.log.practice;

public class ConsoleLog {
	
	public enum Log {
		
		INFO("\033[0;33m"),
		ERROR("\033[0;41m");
		
		String template;
		String RESET = "\u001B[0m";
		
		Log(String color) {
			this.template = (color + "%s" + RESET);
		}
		
		@SuppressWarnings("static-access")
		public void console(String message) {
			var colored = this.template.format(message);
			System.out.println(colored);
		}
		
	}
	
	public static void main(String[] args) {
		Log.INFO.console("Hi! Champ. Welcome to the world of Java.");
		Log.ERROR.console("Red Alert!"); 
	}

}