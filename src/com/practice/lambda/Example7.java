package com.practice.lambda;

import java.util.ArrayList;
import java.util.List;

// Lambda Expression in foreach loop

public class Example7 {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		list.add("Anamitra");
		list.add("Abhishek");
		list.add("Sagar");
		list.add("Rohit");
		
		list.forEach((n) -> System.out.println(n));
	}
}
