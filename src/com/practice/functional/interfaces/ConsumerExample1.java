package com.practice.functional.interfaces;

import java.util.function.Consumer;

public class ConsumerExample1 {

	public static void main(String[] args) {
		
		Consumer<String> first = x -> System.out.println(x.toLowerCase());
		Consumer<String> second = y -> System.out.println(y.toUpperCase());
		
		Consumer<String> result = first.andThen(second);
		result.accept("Anamitra Dey");
	}
}
