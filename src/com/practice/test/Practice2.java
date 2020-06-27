package com.practice.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
Given a list of Strings, write a method that returns a list of all strings that start
with the letter 'a' (lower case) and have exactly 3 letters.
*/
public class Practice2 {

	public static List<String> getList(List<String> list) {
		return list.stream().filter(i -> i.startsWith("a") & i.length() == 3).collect(Collectors.toList());
	}
	
	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("abc", "abbba", "ana", "aad", "aa");
		getList(list).stream().forEach(System.out::println);
	}
}
