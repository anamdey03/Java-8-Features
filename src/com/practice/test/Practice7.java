package com.practice.test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// write a program for second highest number using java 8 given list of numbers

public class Practice7 {

	public static Integer output(List<Integer> list) {
		return list.stream().sorted(Collections.reverseOrder()).limit(2).skip(1).findFirst().get();
	}
	
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,3,4,5,2,8,9,3,6,10,23,2,5);
		System.out.println(output(list));
	}
}
