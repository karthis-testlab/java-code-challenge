package com.java.read.files;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadTextFile {

	public static void main(String[] args) {
		
		File textFile = new File("./textfile.txt");
		try {
			Scanner scanner = new Scanner(textFile);
			while(scanner.hasNextLine()) {
				String line = scanner.nextLine();
			    System.out.println(line);
			}
			scanner.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		

	}

}
