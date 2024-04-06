package com.design.pattern.bridge;

public class CsvDataController implements DataHandler {

	@Override
	public String fetchData() {		
		return "Data reads from the csv file";
	}

}