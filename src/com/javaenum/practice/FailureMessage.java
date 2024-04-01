package com.javaenum.practice;

import java.util.LinkedHashMap;
import java.util.Map;

public enum FailureMessage {
	
	BROWSER,
	ELEMENT;
	
	private static final String DUE_TO = "Due To --> ";
	private static String LAUNCHER_NOTE = "Unable to lanuched %s browser. "+DUE_TO+"%s";
	private static String CLOSE_NOTE = "Unable to close current active session of the launched browser. "+DUE_TO+"%s";
	private static String QUIT_NOTE = "Unable to close all the launched browsers. "+DUE_TO+"%s";
	private static String TYPE_NOTE = "Unable to enter the value in the %s=%s element. "+DUE_TO+"%s";
	
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