package com.practice.stringjoiners;

import java.util.StringJoiner;

//Java added a new final class StringJoiners in java.util.package.
//It is used to construct a sequence of characters separated by delimiters.

public class Example1 {

	public static void main(String[] args) {
		
		StringJoiner joinNames = new StringJoiner(",");
		
		joinNames.add("Rahul");
        joinNames.add("Riya");
        joinNames.add("Rajdeep");
        System.out.println(joinNames);
	}
}
