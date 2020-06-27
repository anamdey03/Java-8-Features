package com.practice.collector;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

class Product {
	
	int id;
    String name;
    double price;

    public Product(int id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}


public class CollectorsApp {

	public static void main(String[] args) {
		
		List<Product> productsList = new ArrayList<Product>();
		
		//Adding Products
        productsList.add(new Product(1,"HP Laptop",25000));
        productsList.add(new Product(2,"Dell Laptop",30000));
        productsList.add(new Product(3,"Lenevo Laptop",28000));
        productsList.add(new Product(4,"Sony Laptop",28000));
        productsList.add(new Product(5,"Apple Laptop",90000));
        
        // Fetching data as a List
        List<Double> priceProductList = 
        		productsList.stream()
        		.map( x -> x.price)
        		.collect(Collectors.toList());
        System.out.println(priceProductList);
        
        // Converting data into Set
        Set<Double> priceProductSet = 
        		productsList.stream()
        		.map(x -> x.price)
        		.collect(Collectors.toSet());
        priceProductSet.forEach(n -> System.out.print(n + " "));
        System.out.println();
        
        // using sum method
        double sumPrices = productsList.stream().collect(Collectors.summingDouble(x -> x.price));
        System.out.println(sumPrices);
        
        int sumIds = productsList.stream().collect(Collectors.summingInt(x -> x.id));
        System.out.println(sumIds);
        
        // Getting average price
        double average = productsList.stream().collect(Collectors.averagingDouble(x -> x.price));
        System.out.println(average);
        
        // Counting Elements
        long count = productsList.stream().collect(Collectors.counting());
        System.out.println(count);
	}
}
