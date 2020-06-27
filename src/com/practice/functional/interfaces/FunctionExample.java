package com.practice.functional.interfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

/*
Function<T, R> - T is the type of the input to the function and R is the type of the result of the function
R apply(T t) 
default <V> Function<V, R> compose(Function<? super V, ? extends T> before)
default <V> Function<T, V> andThen(Function<? super R, ? extends V> after)
static <T> Function<T, T> identity()
*/
public class FunctionExample {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>();  
        list.add(10);  
        list.add(20);  
        list.add(30);  
        list.add(40);
        
		Function<List<Integer>, Integer> sum = x -> {
			return list.stream().reduce(0, (ans,i) -> ans + i);
		};
		
		System.out.println(sum.apply(list));
	}
}
