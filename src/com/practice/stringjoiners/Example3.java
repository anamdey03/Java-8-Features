package com.practice.stringjoiners;

import java.util.StringJoiner;

//Merge Two StringJoiner
//The merge() method merges two StringJoiner objects excluding of prefix and suffix of second StringJoiner object.

public class Example3 {

	public static void main(String[] args) {
		
		StringJoiner str1 = new StringJoiner(",", "[", "]");
		str1.add("Rahul");
		str1.add("Raju");
		
		StringJoiner str2 = new StringJoiner(":", "[", "]");
		str2.add("Piya");
		str2.add("Rashmi");
		
		StringJoiner merge = str1.merge(str2);
		System.out.println(merge);
	}
}
