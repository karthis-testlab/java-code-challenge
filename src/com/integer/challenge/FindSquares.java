package com.integer.challenge;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class FindSquares {
	
	/*
	 * Given sorted integer array in non-decreasing order, return the array
	 * of the square of each number sorted in non-decreasing order 
	 * 
	 */
	
	@Test
	public void postive_testcase() {
		int[] nums = {2,3,4,4,5};
		Assert.assertArrayEquals(new int[] {4,9,16,16,25}, findSquares(nums));
	}
	
	@Test
	public void edge_testcase() {
		int[] nums = {-7,-5,1,4,7};
		//Assert.assertArrayEquals(new int[] {1,16,25,49,49}, findSquares(nums));
		System.out.println(Arrays.toString(findSquaresUsingTwoPointer(nums)));
	}
	
	@Test //Empty array
	public void negative_testcase() {		
		int[] nums = {};
		Assert.assertArrayEquals(new int[] {}, findSquares(nums));
	}
	
	/*
	 * Brute force !!
	 * Pseudo Code here:
	 *
	 * 1) Take the input array
	 * 2) Traverse every element using for loop
	 * 3) Square the value and store in the same element (Multiple with the same indices element)
	 * 4) Sorted the array
	 * 5) Finally, return the result !!
	 * 
	 * 
	 */
	
	private int[] findSquares(int[] nums) {
		if(nums.length == 0)
			return nums;			
		
		for (int i = 0; i < nums.length; i++) {
			nums[i] = nums[i]*nums[i];
		}
		
		Arrays.sort(nums);
		
		return nums;
	}
	
	/*
	 * 1) Create a new array of same size and value
	 * 2) Assign the left = 0 and right = len - 1
	 * 3) insertIndex = len - 1 (bigger number at end)
	 * 4) while(left <= right)
	 *    a) If left absolute value is smaller than right absolute value
	 *       --> insert the square value of left in the insert index
	 *    b) else insert the squared value of the right in the insert index   
	 * 
	 */
	private int[] findSquaresUsingTwoPointer(int[] nums) {
		
		int[] newArray = new int[nums.length];
		int left = 0, right = nums.length - 1;
		int insertIndex = nums.length - 1;
		
		while(left <= right) {
			if(returnAbsoluteValue(nums[left]) == returnAbsoluteValue(nums[right])) {
				newArray[insertIndex] = nums[left]*nums[left];
				left++;
				insertIndex--;
			} else if(returnAbsoluteValue(nums[left]) < returnAbsoluteValue(nums[right])) {
				newArray[insertIndex] = nums[right]*nums[right];
				right--;
				insertIndex--;
			} else {
				newArray[insertIndex] = nums[left]*nums[left];
				left++;
				insertIndex--;
			}
		}
		
		return newArray;
		
	}
	
	int returnAbsoluteValue(int number) {
		return Math.abs(number);
	}
	
	/*
	 * Time Complexity : O[n/2] --> Best Case // O[n] --> Worst Case
	 * Space Complexity: O[n]
	 */
	private int[] squareAndSort(int[] nums) {
		int[] squared = new int[nums.length];
		int left = 0, right = nums.length - 1;
		int insertIndex = nums.length - 1;
		
		while(left <= right) {
			if(returnAbsoluteValue(nums[left]) < returnAbsoluteValue(nums[right])) {
				squared[insertIndex--] = nums[right] * nums[right--];
			} else {
				squared[insertIndex--] = nums[left] * nums[left++];
			}
		}
		return squared;
		
	}

}