package com.practice.test;

import java.util.stream.Collectors;
import java.util.stream.Stream;

// Reverse String

public class Practice8 {

	public static String reverse(String s) {
		return Stream.of(s).map(n -> n.toLowerCase())
					.map(m -> new StringBuilder(m).reverse())
					.collect(Collectors.joining());
	}
	
	public static void main(String[] args) {
		
		System.out.println(reverse("Anamitra Dey"));
	}
}
