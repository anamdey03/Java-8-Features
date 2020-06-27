package com.practice.functional.interfaces;

import java.util.Date;
import java.util.function.Supplier;

/*
Supplier<T> -- T is the type of results supplied by this supplier
T get() -- Gets a result.

*/

public class SupplierExample {
	
	public static Date getDate() {
		return new Date();
	}

	public static void main(String[] args) {
		
		Supplier<String> sup = () -> "Hello";
		String helloStr = sup.get();
		System.out.println(helloStr);
		
		Supplier<String> sup1 = String :: new;
		String emptyStr = sup1.get();
		System.out.println(emptyStr);
		
		Supplier<Date> sup3 = SupplierExample::getDate;
		Date systemDate = sup3.get();
		System.out.println(systemDate);
	}
}
