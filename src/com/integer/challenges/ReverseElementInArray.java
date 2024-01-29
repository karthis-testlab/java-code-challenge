package com.integer.challenges;

import java.util.Arrays;

public class ReverseElementInArray {

	public static void main(String[] args) {
		
		int[] numbers = {7, 17, 13, 19, 5, 1};
		int left = 0, right = numbers.length - 1;
		
		System.out.println("Original Array: "+Arrays.toString(numbers));
		
		while(left<right) {
			int temp = numbers[left];
			numbers[left] = numbers[right];
			numbers[right] = temp;
			left++;
			right--;
		}		
		
		System.out.println("Reversed Array: "+Arrays.toString(numbers));

	}

}
