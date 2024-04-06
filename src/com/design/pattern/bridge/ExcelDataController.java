package com.design.pattern.bridge;

public class ExcelDataController implements DataHandler {

	@Override
	public String fetchData() {
		return "Data reads from the excel file";
	}
	
	public String fetchExcelData() {
		return "Data reads from the excel file from ExcelDataController class";
	}

}