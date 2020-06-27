package com.practice.test;

import java.util.Arrays;
import java.util.List;

// Write a method that returns the average of a list of integers.

public class Practice3 {

	public static Double aveargeValue(List<Integer> list) {
//		return list.stream().collect(Collectors.averagingInt(x -> x));
		return list.stream().mapToInt(x -> x).average().getAsDouble();
	}
	
	public static void main(String[] args) {
		
		List<Integer> list  = Arrays.asList(2,1,4,5,6);
		System.out.println(aveargeValue(list));
	}
}
