package com.practice.lambda;

@FunctionalInterface
interface Addable1 {
	int sum(int num1, int num2);
}

public class Example6 {

	public static void main(String[] args) {
		
		// Lambda expression without return keyword
		Addable1 add1 = (num1, num2) -> num1 + num2;
		System.out.println(add1.sum(30, 40));
		
		// Lambda expression with return keyword
		Addable1 add2 = (num1, num2) -> {
			return num1 + num2;
		};
		System.out.println(add2.sum(60, 40));
	}
}
