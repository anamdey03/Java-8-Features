package com.practice.functional.interfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

class Mango {
	private String color;
	private Double weight;

	public Mango(String color, Double weight) {
		super();
		this.color = color;
		this.weight = weight;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Double getWeight() {
		return weight;
	}

	public void setWeight(Double weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Mango [color=" + color + ", weight=" + weight + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		Mango mango = (Mango) obj;
		if (this.getColor().equals(mango.getColor()) && this.getWeight().equals(mango.getWeight())) {
			return true;
		}
		return false;
	}

}

public class PredicateExample1 {

	public static Predicate<Mango> isWeightAbove150() {
		return mango -> mango.getWeight() >= 150;
	}

	public static List<Mango> filterMangoes(List<Mango> mangoes, Predicate<Mango> predicate) {
		return mangoes.stream().filter(predicate).collect(Collectors.toList());
	}
	
	public static Predicate<Mango> isColorGreen() {
		return mango -> mango.getColor().equals("green");
	}

	public static void main(String[] args) {

		List<Mango> mangoes = Arrays.asList(new Mango("green", 120.0), new Mango("red", 110.0),
				new Mango("brown", 150.0), new Mango("green", 160.0), new Mango("red", 122.0));
		
//		PredicateExample1.filterMangoes(mangoes, isWeightAbove150()).forEach(System.out::println);
		
//		PredicateExample1.filterMangoes(mangoes, mango -> {
//			return mango.getWeight() >= 150;
//		}).forEach(System.out::println);
		
		mangoes.stream().filter(mango -> {
			return mango.getWeight() >= 150;
		}).collect(Collectors.toList()).forEach(System.out::println);
		
		System.out.println();
		
		// and method - default Predicate and(Predicate other)
		Predicate<Mango> andPredicate = isColorGreen().and(isWeightAbove150());
		mangoes.stream().filter(andPredicate).collect(Collectors.toList()).forEach(System.out::println);
		
		System.out.println();
		
		// negate method - default Predicate negate()
		Predicate<Mango> negPredicate = isColorGreen().negate();
		PredicateExample1.filterMangoes(mangoes, negPredicate).forEach(System.out::println);
		
		System.out.println();
		
		// abstract test method - boolean test(T t)
		Mango mango = new Mango("green", 120.0);
		System.out.println(isColorGreen().test(mango));
		System.out.println(isWeightAbove150().test(mango));
		
		System.out.println();
		
		// isEqual method - static Predicate isEqual(Object targetRef)
		Predicate<Mango> standardMangoPredicate = Predicate.isEqual(new Mango("red", 150.0));
		System.out.println(standardMangoPredicate.test(mango));
		System.out.println(standardMangoPredicate.test(new Mango("red", 150.0)));
	}
}
