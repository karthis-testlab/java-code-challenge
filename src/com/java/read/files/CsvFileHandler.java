package com.java.read.files;

import java.io.FileWriter;
import java.io.IOException;

public class CsvFileHandler {

	public static void main(String[] args) throws IOException {
		
		String fileFolder = System.getProperty("user.dir")+"/data.csv";
		
		FileWriter csvWriter = new FileWriter(fileFolder);
		
		csvWriter.append("baseUrl, testUrl, threshold, status \n");
		csvWriter.append("http://localhost:8080/indexA.html, http://localhost:8080/indexA.html, 0.01, NA \n");
		
		csvWriter.close();
		
		System.out.println("Successfully create csv file in the following folder "+fileFolder);
	

	}

}
