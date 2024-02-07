package com.java.read.files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CsvFileHandler {

	public static void main(String[] args) {
		
		writeFile();
		readFile();

	}

	public static void writeFile() {
		String fileFolder = System.getProperty("user.dir") + "/data.csv";

		FileWriter csvWriter;

		try {
			csvWriter = new FileWriter(fileFolder);

			csvWriter.append("baseUrl, testUrl, threshold, status \n");
			csvWriter.append("http://localhost:8080/indexA.html, http://localhost:8080/indexA.html, 0.01, NA \n");

			csvWriter.close();

			System.out.println("Successfully create csv file in the following folder " + fileFolder);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	
	public static void readFile() {

		String fileFolder = System.getProperty("user.dir") + "/data.csv";

		Scanner scanner;

		try {
			scanner = new Scanner(new File(fileFolder));

			scanner.useDelimiter(",");

			while (scanner.hasNext()) {
				System.out.println(scanner.nextLine() + "\t");
			}

			scanner.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		
		
	}

}