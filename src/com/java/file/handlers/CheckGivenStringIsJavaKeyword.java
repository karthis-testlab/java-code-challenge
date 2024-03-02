package com.java.file.handlers;

import javax.lang.model.SourceVersion;

public class CheckGivenStringIsJavaKeyword {

	public static void main(String[] args) {
		
		var keyword = SourceVersion.isKeyword("for");
		System.out.println(keyword);

	}

}