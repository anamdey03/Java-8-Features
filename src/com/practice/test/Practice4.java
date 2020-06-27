package com.practice.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Practice4 {

	public static List<String> convertsToUpper(List<String> list) {
		return list.stream().map(x -> x.toUpperCase()).collect(Collectors.toList());
	}
	
	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("abc", "abbba", "ana", "aad", "aa");
		convertsToUpper(list).stream().forEach(x -> System.out.println(x));
	}
}
