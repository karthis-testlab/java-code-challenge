package com.array.challenges;

import java.util.Arrays;

import org.junit.Test;

public class MoveZerosToRightSide {
	
	@Test
	public void testMoveZerosToRightSide() {
		int[] nums = {3,0,4,5,0,0,1};
		moveZerosToRightSide(nums);
	}

	private void moveZerosToRightSide(int[] nums) {
		int left = 0, right = 0;
		while (right < nums.length) {
			if(nums[right] != 0) {
				int temp = nums[right];
				nums[right] = nums[left];
				nums[left++] = temp;
			}
			right++;
		}
		System.out.println(Arrays.toString(nums));
	}

}