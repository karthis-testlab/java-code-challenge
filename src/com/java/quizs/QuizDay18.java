package com.java.quizs;

public class QuizDay18 {	

	public static void main(String[] args) {
		
		Language obj = new Language();
		obj.func();		

	}

}

class Language {
	
	private void Java() {
		System.out.print("JV");
	}
	
	private void Python() {
		System.out.print("PY");
	}
	
	public void func() {
		Java();
		Python();
	}
	
}