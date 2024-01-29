package com.integer.challenges;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
		System.out.println("Reversed List: "+ getReversed(Arrays.asList(7, 17, 13, 19, 5)));
		

	}
	
	static List<Integer> getReversed(List<Integer> source) {
		
		ArrayList<Integer> myNumbers = new ArrayList<Integer>();

        for(int i = source.size() - 1; i >=0; i--) {
            myNumbers.add(source.get(i));
        }

        return myNumbers;
		
	}

}
