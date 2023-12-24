package com.integer.challenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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

	@Test // +ve case
	public void example1() {
		int[] nums = {2,7,11,15};
		int target = 9;
		//twoSum(nums, target);
		twoSumUsing2Pointer(nums, target);
		//Output --> {0,1}
	}

	@Test // -ve case
	public void example2() {
		int[] nums = {2,7,11,15};
		int target = 45;
		twoSum(nums, target);
	}

	@Test // edge case
	public void example3() {
		int[] nums = {2,2,3,1,4,0,5};
		int target = 5;// 2 + 5 = 7
		//twoSum(nums, target);
		twoSumUsing2Pointer(nums, target);
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
		boolean isFound = false;                        //O[1]
		for (int i = 0; i < nums.length; i++) {         //O[n] 
			for (int j = i+1; j < nums.length; j++) {   //O[n]
				if(nums[i] + nums[j] == target) {       //O[1]
					System.out.println("{"+i+","+j+"}");//O[1]
					isFound = true;                     //O[1]
				}
			}			
		}
		if(!isFound)                                    //O[1] + O[1]
			throw new RuntimeException("The given target number "+target+" was not found in the given integer array "+Arrays.toString(nums));
	}
	
	//O[1] + O[3n^n] + O[2]
	//O[n^n] --> Quadratic time complexity !!
	
	/*
	 * Two Pointer Algorithm
	 * 
	 * 1) Left -> 0 index, Right -> last index
	 * 2) Loop through until left index value is smaller than right index value
	 *      a) Sum both left index value with right index
	 *          1) sum = k --> you got it !! --> return left, right
	 *          2) sum < k --> increment left
	 *          3) sum > k --> decrement right
	 * 
	 * Constrains:         
	 * 1) This solution works only when numbers are sorted!
	 * 2) We should able to return one pair of array          
	 * 
	 */
	
	private void twoSumUsing2Pointer(int[] nums, int target) {

		Arrays.sort(nums);
		
		System.out.println(Arrays.toString(nums));
		
		int[] array = new int[2];
		List<int[]> list = new ArrayList<int[]>();
		
		int left = 0, right = nums.length - 1;
		boolean isFound = false;

		while (left < right) {

			int sum = nums[left] + nums[right];

			if (sum == target) {
				array[0] = left;
				array[1] = right;
				list.add(array);
				isFound = true;
				break;
			} else if (sum < target) {
				left++;
			} else {
				right--;
			}

		}
		
		for (int[] indices : list) {
			System.out.println(Arrays.toString(indices));
		}

		if (!isFound) // O[1] + O[1]
			throw new RuntimeException("The given target number " + target
					+ " was not found in the given integer array " + Arrays.toString(nums));

	}

}