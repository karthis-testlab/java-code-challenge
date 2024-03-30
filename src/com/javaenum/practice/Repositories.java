package com.javaenum.practice;

public enum Repositories {
	
	GITHUB("karthike", "tests.lab");
	String repository;
	String project;
	static String URI = "https://github.com/%s/%s/%s";
	Repositories(String repository, String project) {
		this.repository = repository;
		this.project = project;
	}
	
	public String getTestLabProjectUrl() {
		return URI.formatted(this.repository,this.project,"commits");
	}

}