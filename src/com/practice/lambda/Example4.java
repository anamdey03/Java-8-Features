package com.practice.lambda;

@FunctionalInterface
interface Sayable1 {
	String say(String msg);
}

public class Example4 {

	public static void main(String[] args) {
		
		Sayable1 s = (msg) -> {
			return "Hello " + msg;
		};
		
		System.out.println(s.say("Anamitra!!!"));
	}
}
