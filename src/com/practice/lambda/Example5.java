package com.practice.lambda;

@FunctionalInterface
interface Addable {
	void add(int num1, int num2);
}

public class Example5 {

	public static void main(String[] args) {
		
		Addable a = (num1, num2) -> System.out.println("Addition of " + num1 + " and " + num2 + " is " + (num1 + num2));
		a.add(10, 20);
	}
}
