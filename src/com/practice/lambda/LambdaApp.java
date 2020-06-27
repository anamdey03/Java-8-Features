package com.practice.lambda;

@FunctionalInterface
interface Cab {
	//void bookCab();
	//void bookCab(String source, String destination);
	double bookCab(String source, String destination);
	default void bookAnotherCab() {
		System.out.println("Booked another one");
	}
	static void cancelCab() {
		System.out.println("Cancelled the cab at is late!!");
	}
}

/*
 * class UberX implements Cab {
 * 
 * @Override public void bookCab() {
 * System.out.println("UberX booked!! Comming Soon...");
 * 
 * } }
 */

public class LambdaApp {

	public static void main(String[] args) {
		// Cab cab = new UberX();
		// cab.bookCab();
		
		// Anonymous Class Implementation 
		/*
		 * Cab cab = new Cab() {
		 * 
		 * @Override public void bookCab() {
		 * System.out.println("UberX booked!! Comming Soon..."); } }; cab.bookCab();
		 */
		
		// Using Lambda Expression -> Functional iterfaces
		Cab cab = (source, destination) -> {
			System.out.println("UberX booked from " + source + " to " + destination+ " !! Comming Soon...");
			return 850.12;
		};
		double fare = cab.bookCab("Toronto", "Montreal");
		System.out.println("Fare shall be "+fare);
		cab.bookAnotherCab();
		Cab.cancelCab();
	}
}
