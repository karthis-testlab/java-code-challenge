package com.integer.challenge;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindMaxAndMinNumber {

	public static void main(String[] args) {
		int[] arr = { 23, 5, 7, 99, 0 };
		findMinAndMaxNumber(arr);
		findMinAndMaxNumberUsingList(arr);
	}
	
	static void findMinAndMaxNumber(int[] arr) {
		int min = arr[0];
		int max = arr[0];
		
		for (int i = 1; i < arr.length; i++) {
			if(arr[i] < min) {
				min = arr[i];
			} else if(arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println("Min Number: " + min);
		System.out.println("Min Number: " + max);		
	}

	static void findMinAndMaxNumberUsingList(int[] arr) {
		List<Integer> list = new ArrayList<>();
		for (int integer : arr) {
			list.add(integer);
		}
		Collections.sort(list);
		System.out.println("Min Number: " + list.get(0));
		System.out.println("Min Number: " + list.get(list.size() - 1));
	}

}