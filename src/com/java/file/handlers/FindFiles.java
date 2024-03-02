package com.java.file.handlers;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;

public class FindFiles {

	public static void main(String[] args) throws IOException {
	
		var dir = Path.of("..");
		Files
		 .find(dir, 2, (path, attribute) -> contains(path, attribute, "String"))
		 .forEach(System.out::println);

	}

	public static boolean contains(Path path, BasicFileAttributes attributes, String term) {
		try {
			return Files.readString(path).contains(term);
		} catch (IOException e) {
			return false;
		}
	}

}