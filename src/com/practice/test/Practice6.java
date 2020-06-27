package com.practice.test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

// Find Min or Max Object by key

class Employee {
	private int id;
	private String name;
	private int age;

	public Employee(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		StringBuilder str = null;
		str = new StringBuilder();
		str.append("Id:- " + getId() + " Name:- " + getName() + " Age:- " + getAge());
		return str.toString();
	}
}

public class Practice6 {

	public static Employee maximumEmployee(List<Employee> list, Comparator<Employee> comparator) {
		
		return list.stream().max(comparator).get();
	}
	
	public static Employee minimumEmployee(List<Employee> list, Comparator<Employee> comparator) {
		return list.stream().min(comparator).get();
	}
	
	
	public static void main(String[] args) {
		
		List<Employee> employees = new ArrayList<Employee>();
		 
		employees.add(new Employee(1, "Lokesh", 36));
		employees.add(new Employee(2, "Alex", 46));
		employees.add(new Employee(3, "Brian", 52));
		
		Comparator<Employee> comparator = Comparator.comparing(Employee::getAge, (a1,a2) -> {
			if (a1==a2)
				return 0;
			
			return a1>a2 ? -1 : 1;
		});
		Employee maxObject = maximumEmployee(employees, comparator); 
		Employee minObject = minimumEmployee(employees, comparator);
		
		System.out.println("maxObject = "+ maxObject);
		System.out.println("minObject = "+ minObject);
		
	}
	
}
