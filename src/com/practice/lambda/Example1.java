package com.practice.lambda;

@FunctionalInterface
interface FuncInterface {
	// An abstract function
	void abstractFun(int x);

	// An non abstract function (or default function)
	default void normalFun() {
		System.out.println("Hello Guys");
	}
}

public class Example1 {

	public static void main(String[] args) {
		
		//Lambda expression to implement above functional interface. This interface by default implements abstractFunc()
		FuncInterface func = (x) -> System.out.println(2*x);
		
		//This calls above lambda function and prints 10
		func.abstractFun(5);
		func.normalFun();
	}
}
