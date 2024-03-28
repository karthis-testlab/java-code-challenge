package com.java.file.handlers;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.text.SimpleDateFormat;
import java.util.Date;

public interface Logger {

	Path information = Path.of("./info.log");
	Path failuer = Path.of("./error.log");
	String pattern = "dd-MM-yyyy'T'HH:mm:ss.SSS";
	String currentDate = new SimpleDateFormat(pattern).format(new Date());

	static void info(String message) {
		try {
			Files.writeString(information, currentDate + " [INFO]: " + message + "\n", StandardOpenOption.CREATE,
					StandardOpenOption.APPEND);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	static void fail(String message) {
		try {
			Files.writeString(failuer, currentDate + " [FAIL]: " + message + "\n", StandardOpenOption.CREATE,
					StandardOpenOption.APPEND);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}