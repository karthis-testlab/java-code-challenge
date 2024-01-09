package com.array.challenges;

import org.junit.Test;

public class FindTheIntersectionofTwoArray {
	
	@Test
	public void testFindTheIntersectionofTwoArray() {
		int[] array1 = {1,2,11,12};
		int[] array2 = {2,12};
		findTheIntersectionofTwoArray(array1, array2);
	}

	/*
	 * value of the left == value of the right --> got the intersection => Print and move both
	 * value of the left < value of the right --> move left
	 * value of the left > value of the right --> move right
	 */
	private void findTheIntersectionofTwoArray(int[] array1, int[] array2) {
		
		int left = 0, right = 0;
		boolean isFound = false;

		while (left < array1.length && right < array2.length) {
			if (array1[left] == array2[right]) {
				System.out.println(array1[left]);
				isFound = true;
				left++;
				right++;
			} else if (array1[left] < array2[right]) {
				left++;
			} else {
				right++;
			}
		}
		
		if(!isFound)
			System.err.println("There's no intersection.");
	}

}