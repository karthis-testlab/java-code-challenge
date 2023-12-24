package com.integer.challenge;

import java.util.Arrays;

import org.junit.Test;

public class MoveZerosToLeftSide {
	
	@Test
	public void testMoveZerosToLeftSide() {
		int[] nums = {3,0,4,5,0,0,1};		
		moveZerosToLeftSide(nums);
	}	
	
	private void moveZerosToLeftSide(int[] nums) {
		int left = nums.length-1, right = nums.length-1;
		while (left >= 0) {
			if(nums[left] != 0) {
				int temp = nums[left];
				nums[left] = nums[right];
				nums[right--] = temp;
			}
			left--;
		}
		System.out.println(Arrays.toString(nums));
	}

}