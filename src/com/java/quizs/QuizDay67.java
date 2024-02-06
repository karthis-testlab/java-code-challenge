package com.java.quizs;

public class QuizDay67 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
	
		One one = new One();
		System.out.println("");
		Two two = new Two();
		System.out.println("");
		Three three = new Three();

	}

}

class One {
	{
		System.out.print(1);
		System.out.print(" ");
	}
}

class Two extends One {
	{
		System.out.print(2);
		System.out.print(" ");
	}
}

class Three extends Two {
	{
		System.out.print(3);
	}
}