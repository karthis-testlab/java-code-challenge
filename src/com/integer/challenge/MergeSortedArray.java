package com.integer.challenge;

import java.util.Arrays;

import org.junit.Test;

public class MergeSortedArray {
	
	@Test
	public void testMergeSortedArray() {
		int[] nums1 = {0};
		int[] nums2 = {1};
		int m = 0;
		int n = 1;
		merge(nums1, m, nums2, n);
	}
	
	public void merge(int[] nums1, int m, int[] nums2, int n) {

		int[] newArray = new int[m + n];
		int left = 0, right = 0, index = 0;

		while (left < m || right < n) {
			if(left == m) newArray[index++] = nums2[right++];
			else if(right == n) newArray[index++] = nums1[left++];
			else if(nums1[left] <= nums2[right]) newArray[index++] = nums1[left++];	
			else newArray[index++] = nums2[right++];
		}

		System.out.println(Arrays.toString(newArray));

	}
	
	public void mergeWithoutThridArray(int[] nums1, int m, int[] nums2, int n) {

        int left = m-1, right = n-1, index = m+n-1;

		while (right >= 0) {
			if(left >= 0 && nums1[left] > nums2[right]) nums1[index--] = nums1[left--];
			else nums1[index--] = nums2[right--];
		}  
        
    }

}