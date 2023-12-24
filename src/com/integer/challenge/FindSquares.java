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
		Assert.assertArrayEquals(new int[] {1,16,25,49,49}, findSquares(nums));
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
	
	public int[] findSquares(int[] nums) {
		if(nums.length == 0)
			return nums;			
		
		for (int i = 0; i < nums.length; i++) {
			nums[i] = nums[i]*nums[i];
		}
		
		Arrays.sort(nums);
		
		return nums;
	}

}