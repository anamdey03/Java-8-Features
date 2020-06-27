package com.practice.test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

interface Operation {
	List<String> check(List<String> list);
}

class PerformOper {

	public static List<String> checkOperation(List<String> list, Operation operation) {
		return operation.check(list);
	}

	public static Operation listToUpperCase() {
		return ls -> ls.stream().map(m -> m.toUpperCase()).collect(Collectors.toList());
	}

	public static Operation listStartingWithA() {
		return ls -> ls.stream().filter(m -> m.startsWith("A")).collect(Collectors.toList());
	}

	public static Operation listWithFirstThreeInitials() {
		return ls -> ls.stream().map(m -> m.length() > 3 ? m.substring(0, 3) : m).collect(Collectors.toList());
	}

	public static Operation listInSortedOrder() {
		return ls -> ls.stream().sorted((p1, p2) -> p1.compareTo(p2)).collect(Collectors.toList());
	}
}

public class PracticeProblem11 {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		list.add("Anamitra");
		list.add("Sagarika");
		list.add("Abhishek");
		list.add("Amit");

//		Operation opr = PerformOper.listInSortedOrder();
//		PerformOper.checkOperation(list, opr).forEach(System.out::println);

		PerformOper.checkOperation(list, PerformOper.listToUpperCase()).forEach(System.out::println);
		System.out.println("--------");
		PerformOper.checkOperation(list, PerformOper.listStartingWithA()).forEach(System.out::println);
		System.out.println("--------");
		PerformOper.checkOperation(list, PerformOper.listWithFirstThreeInitials()).forEach(System.out::println);
		System.out.println("--------");
		PerformOper.checkOperation(list, PerformOper.listInSortedOrder()).forEach(System.out::println);

	}
}
