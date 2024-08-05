package com.integer.challenges;

public class AddWithoutArithmetic {

	public static void main(String[] args) {
		int num1 = 15;
		int num2 = 32;
		int sum = add(num1 , num2);
		System.out.println("Sum: "+sum);
	}
	
	public static int add(int a, int b) {
		while (b != 0) {
			int carry = (a & b) << 1;
			a = a ^ b;
			b = carry;
		}
		return a;
	}

}