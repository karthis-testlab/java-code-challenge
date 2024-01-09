package com.array.challenges;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class RemoveMatchingElement {
	
	/*
	 * Given the integer array and the target, 
	 * remove the matching target from the array 
	 * 
	 * static array and dynamic array !!
	 * 
	 * static array --> Length fixed --> number of elements is declared at the beginning
	 * you cannot resize them --> resize?? --> create another array (Arrays.copyOf())
	 * 
	 * Dynamic array --> Array size that can change (grow or shrink)
	 * List / Set / Map
	 * 
	 */
	
	@Test
	public void postive_testcase() {
		int[] nums = {1,2,3,4,99,5};
		int target = 99;
		Assert.assertArrayEquals(new int[] {1,2,3,4,5}, removeMatchingElement(nums, target));
	}	

	@Test
	public void edge_testcase() {
		int[] case1 = {1,2,3,4,5,99};
		int target = 99;
		Assert.assertArrayEquals(new int[] {1,2,3,4,5}, removeMatchingElement(case1, target));
		int[] case2 = {1,2,3,99,4,99,5,99};
		Assert.assertArrayEquals(new int[] {1,2,3,4,5}, removeMatchingElement(case2, target));
	}
	
	@Test
	public void negative_testcase() {
		int[] nums = {1,2,3,4,5};
		int target = 99;
		Assert.assertArrayEquals(nums, removeMatchingElement(nums, target));
	}
	
	/*
	 * Brute force !!
	 * Pseudo Code here:
	 *
	 * 1) Create one array list object
	 * 2) Take the input array
	 * 3) Traverse every element using for loop
	 * 4) Compare the each integer element with the target number
	 * 5) Push the all not matching element into the list object
	 * 6) Create one integer array with size equal to the list object size
	 * 7) Add all the integer from list to newly created integer array using for loop
	 * 8) Finally, return the newly created integer array !!
	 * 
	 * 
	 */
	
	private int[] removeMatchingElement(int[] nums, int target) {	
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != target)
				list.add(nums[i]);			
		}
		
		int[] newNumArray = new int[list.size()];
		for (int i = 0; i < list.size(); i++) {
			newNumArray[i] = list.get(i);
		}
		return newNumArray;
	}

}