package com.integer.challenge;

import org.junit.Test;

public class FindMinimumNumber {
	
	@Test
	public void testFindMinimumNumber() {
		int[] numbers = {2,4,1,5,-1};
		System.out.println(findMinimumNumber(numbers));
	}
	
	/*
	 * int --> primitive data type --> -2^31 to +2^31 (int data type range)
	 * Integer --> Wrapper class for int primitive data type
	 */
	int findMinimumNumber(int[] numbers) {
		int min = Integer.MAX_VALUE;                  //O[1]
		for (int i = 0; i < numbers.length; i++) {    //O[n]
			/*if(numbers[i] < min) {                    //O[1]
				min = numbers[i];                     //O[1]
			}*/
			min = (numbers[i] < min) ? numbers[i] : min;
		}
		return min;                                   //O[1]
	}
	
	// O[1] + O[2n] + O[1] --> Time complexity !! (Drop the constant)
	// O[2n]
	//O[n] Final Time complexity

}