package com.practice.test;

import java.util.stream.IntStream;

/*
Write a method that returns the index of the first occurrence of given integer in a list.
Assume that the index of the first element in the list is zero.
If the number does not exist return -1.
*/
public class Practice9 {

	public static int search(Integer n, int[] arr) {

		return IntStream.range(0, arr.length)
				.filter(i -> n==arr[i])
				.findFirst()
				.orElse(-1);
	}
	
	public static void main(String[] args) {
		
		int[] my_array = { 5, 4, 6, 7, 1, 3, 2, 7, 8, 9 }; 
		
		System.out.println(search(7, my_array));
	}
}
