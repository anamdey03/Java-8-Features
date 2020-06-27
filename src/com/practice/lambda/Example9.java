package com.practice.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//Filter collection data by using stream

class Mobiles {
	int id;
	String name;
	double price;

	public Mobiles(int id, String name, double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
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

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}

public class Example9 {

	public static void main(String[] args) {

		List<Mobiles> mob = new ArrayList<Mobiles>();
		mob.add(new Mobiles(005, "Samsung", 21000));
		mob.add(new Mobiles(003, "Mi", 12000));
		mob.add(new Mobiles(001, "Oneplus", 36000));
		mob.add(new Mobiles(004, "Moto", 38200));
		mob.add(new Mobiles(002, "Nokia", 18500));

		// Sorting the Mobile List wrt Id

//		mob.sort((m1, m2) -> {
//			if (m1.getId() == m2.getId())
//				return 0;
//			return m1.getId() > m2.getId() ? 1 : -1;
//		});

		// Sorting the Mobile List wrt Name
//		Collections.sort(mob, (m1, m2) -> {
//			return m1.getName().compareTo(m2.getName());
//		});

		// using lambda to filter data and sort
		List<Double> filteredData = mob.stream().filter(mobiles -> mobiles.price > 20000).map(x -> x.price).sorted((m1, m2) -> {
			if (m1 == m2)
				return 0;
			return m1 > m2 ? -1 : 1;
		}).collect(Collectors.toList());
		
		System.out.println(filteredData);
		// using lambda to iterate through the collection
//		filteredData.forEach(mobiles -> System.out.println(mobiles.id + " " + mobiles.name + " " + mobiles.price));
	}
}
