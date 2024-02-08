package com.collections.challenges;

import java.util.Arrays;
import java.util.List;

public class CalculateAverageList {

	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(2, 5, 20, 30, 56);
		double sum = 0;
		
		for (int i = 0; i < numbers.size(); i++) {
			sum += numbers.get(i);
		}
		
		System.out.println(sum/numbers.size());

	}
	

}
