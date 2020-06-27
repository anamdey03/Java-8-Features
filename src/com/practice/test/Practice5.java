package com.practice.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

// Find Maximum

public class Practice5 {

	public static Integer maximum(List<Integer> list) {
		int maximum = list.stream().max(Comparator.comparing(Integer::valueOf)).get();
		return maximum;
	}
	
	public static Integer minimum(List<Integer> list) {
		int minimum = list.stream().min(Comparator.comparing(Integer::valueOf)).get();
		return minimum;
	}
	
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>();
		list = Arrays.asList(12,43,13,87,21);
		System.out.println(maximum(list));
		System.out.println(minimum(list));
	}
}
