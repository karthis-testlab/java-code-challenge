package com.design.pattern.bridge;

public class DemoBridgePattern {

	public static void main(String[] args) {
		
		DataHandler csv = new CsvDataController();
		System.out.println(csv.fetchData());
		
		DataHandler excel = new ExcelDataController();
		System.out.println(excel.fetchData());	
		ExcelDataController ex = (ExcelDataController) excel;
		System.out.println(ex.fetchExcelData());	

	}

}