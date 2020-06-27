package com.practice.stringjoiners;

import java.util.StringJoiner;

//Adding prefix and suffix

public class Example2 {

	public static void main(String[] args) {
		StringJoiner joinNames = new StringJoiner(",","[","]");

		joinNames.add("Rahul");
		joinNames.add("Riya");
		joinNames.add("Rajdeep");
		System.out.println(joinNames);
	}
}
