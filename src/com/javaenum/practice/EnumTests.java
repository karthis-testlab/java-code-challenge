package com.javaenum.practice;

import static com.javaenum.practice.PrintMessage.*;

public class EnumTests {

	public static void main(String[] args) {		
		
		System.out.println(Repositories.GITHUB.getTestLabProjectUrl());
		System.out.println(SuccessMessage.BROWSER.browserLauncherNote("chrome", "lanched in mac os"));
		System.out.println(SuccessMessage.BROWSER.browserCloseNote());
		System.out.println(SuccessMessage.BROWSER.browserQuitNote());
		System.out.println(SuccessMessage.BROWSER.getMessage("launch").formatted("chrome","lanched in mac os"));
		System.out.println(SuccessMessage.ELEMENT.getMessage("type").formatted("ID","user-name"));
		System.out.println(getBrowserMessage(FAIL, "chrome", "some error"));
		System.out.println(getBrowserMessage(PASS, "chrome", "lanched in mac os"));
		System.out.println(getBrowserMessage("close", "some error"));

	}

}

class PrintMessage {
	
	public static final int PASS = 1;
	public static final int FAIL = -1;

	public static String getBrowserMessage(int status, String browserName, String details) {
		if(status < 0) {
			return FailureMessage.BROWSER.getMessage("launch").formatted(browserName,details);
		}
		return SuccessMessage.BROWSER.getMessage("launch").formatted(browserName,details);
	}
	
	public static String getBrowserMessage(String key) {
		String message = null;
		if (SuccessMessage.BROWSER.getMessage(key) != null)
			message = SuccessMessage.BROWSER.getMessage(key);
		else
			throw new IllegalArgumentException("Unexpected value: Relavent browser print message was not found for the given argument: " + key);
		return message;
	}
	
	public static String getBrowserMessage(String key, String errDetails) {
		String message = null;
		if (FailureMessage.BROWSER.getMessage(key) != null)
			message = FailureMessage.BROWSER.getMessage(key).formatted(errDetails);
		else
			throw new IllegalArgumentException("Unexpected value: Relavent browser print message was not found for the given argument: " + key);
		return message;
	}

}