package com.practice.lambda;

@FunctionalInterface
interface Sayable {
	String say();
}

public class Example3 {

	public static void main(String[] args) {
		
		Sayable s = () -> {
			return "Lambda Expression with no parameter";
		};
		
		System.out.println(s.say());
	}
}
