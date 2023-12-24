package com.integer.challenge;

import org.junit.jupiter.api.Test;

public class TwoSum {

	/*
	 * Given the input int array, find the sum of any two distinct indices of the
	 * matching given the target
	 * 
	 * int[] nums = {2,7,11,15}; int target = 9;
	 * 
	 * Output --> {0,1}
	 * 
	 * int[] nums = {-2,7,11,15}; int target = 9;
	 * 
	 * Output --> {0,2}
	 * 
	 * int[] nums = {2,2,3,1,4,0,5}; int target = 5;
	 * 
	 * Output --> {{0,2},{1,2},{3,4},{5,6}}
	 * 
	 * int[] nums = {2,7,9,15}; int target = 9;
	 * 
	 * int[] nums = {2,7,9,11,15}; int target = 4;
	 * 
	 * Output --> {0,0}
	 * 
	 * 1) Ask good questions! 2) Do not ask stated / bad questions !!
	 * 
	 */

	//@Test // +ve case
	public void example1() {
		int[] nums = {2,7,11,15};
		int target = 9;
		twoSum(nums, target);
		//Output --> {0,1}
	}

	@Test // -ve case
	public void example2() {
		int[] nums = {2,7,11,15};
		int target = 45;
		twoSum(nums, target);
	}

	//@Test // edge case
	public void example3() {
		int[] nums = {2,2,3,1,4,0,5};
		int target = 5;
		twoSum(nums, target);
		//Output --> {{0,2},{1,2},{3,4},{5,6}}
	}

	/*
	 * Brute force !!
	 * Pseudo Code here:
	 *
	 * 1) Take the input array
	 * 2) Traverse every element using for loop
	 * 3) Add with the next element with the outer loop
	 * 4) Compare the sum with the target
	 *      a) If it matches, store them in a list !!
	 *      b) If it does not, continue
	 * 5) Finally, return the list !!     
	 * 
	 * 
	 */

	private void twoSum(int[] nums, int target) {
		boolean isFound = false;
		for (int i = 0; i < nums.length; i++) {
			for (int j = i+1; j < nums.length; j++) {
				if(nums[i] + nums[j] == target) {
					System.out.println("{"+i+","+j+"}");
					isFound = true;
				}
			}			
		}
		if(!isFound)
			throw new RuntimeException("The given target number "+target+" was not found in the given integer array");
	}

}