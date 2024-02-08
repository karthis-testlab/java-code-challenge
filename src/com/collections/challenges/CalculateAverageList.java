package com.collections.challenges;

import java.util.Arrays;
import java.util.List;

public class CalculateAverageList {

	public static void main(String[] args) {
	
		System.out.println(getAverage(Arrays.asList(2, 5, 20, 30, 56)));
		System.out.println(getAverage(Arrays.asList(-20, 30, -55)));
		
		System.out.println(getAverageJava8(Arrays.asList(2, 5, 20, 30, 56)));
		System.out.println(getAverageJava8(Arrays.asList(-20, 30, -55)));

	}
	
	static double getAverage(List<Integer> source) {
		double sum = 0;
		for (int i = 0; i < source.size(); i++) {
			sum += source.get(i);
		}
		return sum/source.size();
	}
	
	static double getAverageJava8(List<Integer> source) {		
		return source.stream().reduce(0, Integer::sum) / (double) source.size();
	}

}
