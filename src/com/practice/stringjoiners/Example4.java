package com.practice.stringjoiners;

import java.util.StringJoiner;

//StringJoiner Methods

public class Example4 {

	public static void main(String[] args) {
		
		StringJoiner joinerNames = new StringJoiner(",");
		
		System.out.println(joinerNames);
		
		joinerNames.setEmptyValue("It is empty");
		System.out.println(joinerNames);
		
		joinerNames.add("Raju");
		joinerNames.add("Ram");
		System.out.println(joinerNames);
		
		System.out.println(joinerNames.length());
		
		String str = joinerNames.toString();
		System.out.println(str);
		
		char ch = str.charAt(3);
		System.out.println(ch);
		
		joinerNames.add("Sourav");
		System.out.println(joinerNames);
		
		System.out.println(joinerNames.length());
	}
}
