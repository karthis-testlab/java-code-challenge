package com.javaenum.practice;

import java.util.LinkedHashMap;
import java.util.Map;

public enum SuccessMessage {
	
	BROWSER,
	ELEMENT;
	
	private static String LAUNCHER_NOTE = "Successfully lanuched %s browser. Details=%s.";
	private static String CLOSE_NOTE = "Successfully closed current active session of the launch browser.";
	private static String QUIT_NOTE = "Successfully closed all the launched browsers.";
	private static String TYPE_NOTE = "Successfully enter the value in the %s=%s element.";
	
	public String browserLauncherNote(String browserName, String details) {
		return LAUNCHER_NOTE.formatted(browserName, details);
	}
	
	public String browserCloseNote() {
		return CLOSE_NOTE;
	}
	
	public String browserQuitNote() {
		return QUIT_NOTE;
	}
	
	public String getMessage(String key) {
		switch (this) {
		case BROWSER: {
			Map<String, String> browser = new LinkedHashMap<String, String>();
			browser.put("launch", LAUNCHER_NOTE);
			browser.put("close", CLOSE_NOTE);
			browser.put("quit", QUIT_NOTE);
			return browser.get(key);
		}
		case ELEMENT:{
			Map<String, String> element = new LinkedHashMap<String, String>();
			element.put("type", TYPE_NOTE);
			return element.get(key);
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + this);
		}
	}
	

}