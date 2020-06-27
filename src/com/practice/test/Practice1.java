package com.practice.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Practice1 {
	
	public static String getString(List<Integer> list) {
		return list.stream().map( i -> {
			if(i%2 == 0)
				return "e"+i;
			else
				return "o"+i;
		}).collect(Collectors.joining(","));
		
		
	}

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(2,3,4,5,6);
		System.out.println(getString(list));
	}
}
