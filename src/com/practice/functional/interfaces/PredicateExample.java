package com.practice.functional.interfaces;

/*
Predicate<T> -- T is the type of the input to the Predicate
boolean test(T t) -- returns true, if the input argument matches the predicate otherwise false
default Predicate<T> and(Predicate<? super T> other) -- Logical AND [throws NullPointerException if the other is null]
default Predicate<T> negate() -- returns Logical Negation of this predicate
default Predicate<T> or(Predicate<? super T> other) -- Logical OR [throws NullPointerException if the other is null]
static <T> Predicate<T> isEqual(Object targetRef) -- It's a static method which tests if two arguments are equal 
*/

import java.util.function.Predicate;

class Apple {
	String color;
	double weight;
	
	public Apple(String color, double weight) {
		super();
		this.color = color;
		this.weight = weight;
	}	
}

public class PredicateExample {

	public static void main(String[] args) {
		
		// Creating Predicate
		Predicate<Integer> lesserThan = i -> i < 18;
		Predicate<Integer> greaterThan = i -> i > 10;
		
		// Calling Predicate Method
		System.out.println(lesserThan.test(15));
		
		// 'and' Default Method of Predicate
		boolean result = lesserThan.and(greaterThan).test(15);
		System.out.println(result);
		
		// 'negate' Default Method of Predicate
		boolean result2 = lesserThan.and(greaterThan).negate().test(9);
		System.out.println(result2);
		
		// Creating Predicate
		Predicate<Integer> lesserThan2 = i -> i > 18;
		Predicate<Integer> greaterThan2 = i -> i < 10;

		// 'or' Default Method of Predicate
		boolean result3 = lesserThan2.or(greaterThan2).test(9);
		System.out.println(result3);
		
		// 'isEqual' Default Method of Predicate		
		Predicate<Apple> applePredicate = Predicate.isEqual(new Apple("green", 120.5));
		boolean result4 = applePredicate.test(new Apple("green", 120.5));
		System.out.println(result4);
		
		
	}
}
