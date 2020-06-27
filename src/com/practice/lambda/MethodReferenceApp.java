package com.practice.lambda;

interface Calculator {
	void add(int num1, int num2);
}

interface Messenger {
	Message getMessage(String msg);
}

class Message {
	Message(String msg) {
		System.out.println(">> Message is: "+msg);
	}
}

class Calc {
	public static void addSomething(int num1, int num2) {
		System.out.println(num1 + " and " + num2 + " addition is: "+ (num1 + num2));
	}
	
	public void letsAdd(int num1, int num2) {
		System.out.println(num1 + " and " + num2 + " add to: "+ (num1 + num2));
	}
}

public class MethodReferenceApp {

	public static void main(String[] args) {
		
//		Calc.addSomething(10, 20);
		
		// 1. Reference to a Static Method
		Calculator cRef = Calc::addSomething;   // Method Reference
		cRef.add(10, 20);
		
		// 2. Reference to a non static method or Instance method
		Calc calc = new Calc();
		Calculator cRef2 = calc::letsAdd;	// Method Reference
		cRef2.add(14, 15);
		
		// 3. Reference to a Constructor
		Messenger messenger = Message::new;
		messenger.getMessage("Hello from the other side!!!");
	}
}
