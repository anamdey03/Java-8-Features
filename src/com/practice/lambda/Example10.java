package com.practice.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Example10 {

	public static void main(String[] args) {
		
		List<Integer> number = Arrays.asList(6,2,4,3,5);
		
		 // demonstration of map method
		List<Integer> square = number.stream().map(x -> x*x).sorted().collect(Collectors.toList());
		square.forEach( y -> System.out.print(" " + y));
		System.out.println();
		
		List<String> names = Arrays.asList("Reflection","Collection","Stream");
		
		 // demonstration of filter method
		List<String> result = names.stream().filter( name -> name.startsWith("S")).collect(Collectors.toList());
		System.out.println(result);
		
		// demonstration of sorted method
		List<String> show = names.stream().sorted().collect(Collectors.toList());
		System.out.println(show);
		
		// create a list of integers
        List<Integer> numbers = Arrays.asList(2,3,4,5,3,5);

        // collect method returns a set
        Set<Integer> squareSet = numbers.stream().map(x->x*x).collect(Collectors.toSet());
        System.out.println(squareSet);
        
        // demonstration of reduce method
        int even = numbers.stream().filter(x -> x % 2 == 0).reduce(0, (ans,i)-> ans+i);
        System.out.println(even);
        
        
	}
}
