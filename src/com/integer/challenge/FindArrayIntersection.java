package com.integer.challenge;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

public class FindArrayIntersection {
	
	@Test
	public void testFindArrayIntersection() {
		int[] arr1 = {1,2,3,4,5,6,7,8,9,4};
		int[] arr2 = {2, 8};
		findArrayIntersection(arr1, arr2);
		findArrayIntersectionUsingSet(arr1, arr2);
	}

	private void findArrayIntersection(int[] arr1, int[] arr2) {
		for (int i = 0; i < arr1.length; i++) {               //O[n]
			for (int j = 0; j < arr2.length; j++) {           //O[m] 
				if(arr1[i] == arr2[j]) {                      //O[1]
					System.out.println(arr1[i]);              //O[1]
				}
			}
		}
		// O[n*m]
	}
	
	private void findArrayIntersectionUsingSet(int[] arr1, int[] arr2) {
		Set<Integer> set = new HashSet<Integer>();
		for (int i = 0; i < arr1.length; i++) {
			set.add(arr1[i]);
		}
		for (int i = 0; i < arr2.length; i++) {
			if(set.contains(arr2[i])) {
				System.out.println(arr2[i]);
			}
		}
	}
	

}