package com.practice.lambda;

@FunctionalInterface
interface Drawable {
	void draw();
}

public class Example2 {

	public static void main(String[] args) {
		int height = 15; // instance variable
		
		Drawable dr = () -> System.out.println("Drawing "+ height);
		dr.draw();
	}
}
