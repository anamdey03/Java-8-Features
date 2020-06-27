package com.practice.optional;

import java.util.Optional;

/*
Java introduced a new class in jdk8 - Optional.
It is a public final class and used to deal with NullPointerException in Java application.
we must import java.util package to use this class.
It provides methods which are used to check the presence of value for particular variable.
*/

public class Example1 {

	public static void main(String[] args) {
		
		String[] str = new String[10];
		Optional<String> checkNull = Optional.ofNullable(str[5]);
		if(checkNull.isPresent()) {
			String lowerCaseString = str[5].toLowerCase();
			System.out.println(lowerCaseString);
		}
		else {
			System.out.println("Value is not present");
		}
	}
}
