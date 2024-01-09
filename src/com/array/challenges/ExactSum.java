package com.array.challenges;

import org.junit.Test;

public class ExactSum {
	
	@Test
	public void example1() {
		int[] nums = {1,7,4,3,1,2,1,5,1};
		int k = 7;
		findExactSumIndicies(nums, k);
	}

	/*
	 * 1) Start with first element
	 * 2) If the sum is less than the desired sum, slide to next element [Grow]
	 * 3) Again, sum that and check if it is lesser, equal or greater
	 * 4) If it is lesser, add the next element to slide [Grow]
	 * 5) If it is greater, than shrink the last element on the left [Shrink]
	 * 6) If it is equal, you got it and again do both Grow and Shrink [slide]
	 */
	private void findExactSumIndicies(int[] nums, int k) {
		int left = 0, sum = 0;
		for (int right = 0; right < nums.length; right++) { // right always traverse.
			sum += nums[right];
			while(sum > k) {
				sum -= nums[left++];
			}
			if(sum == k) {
				System.out.println(left+","+right);
			}
		}
	}

}