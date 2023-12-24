package com.integer.challenge;

import org.junit.Test;

public class FindArrayIntersection {
	
	@Test
	public void testFindArrayIntersection() {
		int[] arr1 = {1,2,3,4,5,6,7,8,9,4};
		int[] arr2 = {2, 8};
		findArrayIntersection(arr1, arr2);
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

}