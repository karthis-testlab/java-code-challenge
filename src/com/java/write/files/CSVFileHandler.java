package com.java.write.files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;

public class CSVFileHandler {

	public static void main(String[] args) {

		modifyCSVFile();

	}

	public static void modifyCSVFile() {

		try {
			CSVReader reader = new CSVReader(new FileReader(new File(System.getProperty("user.dir") + "/data.csv")));
			List<String[]> records = reader.readAll();
			String[] row = records.get(1);
			System.out.println(row);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException | CsvException e) {
			e.printStackTrace();
		}

	}

}