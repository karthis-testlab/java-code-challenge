package com.java.file.handlers;

import static com.java.file.handlers.Logger.*;

public class LoggerTest {

	public static void main(String[] args) {
		info("Hi! info Logger.");
		fail("Hi! failed Logger.");
	}

}
