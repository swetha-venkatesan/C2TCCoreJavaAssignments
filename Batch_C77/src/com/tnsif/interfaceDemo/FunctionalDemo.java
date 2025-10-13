package com.tnsif.interfaceDemo;

public class FunctionalDemo {
	public static void main(String[] args) {
		
		//Lambda Expression
		GreetingDemo1 gd = () -> 
		System.out.println("Hello Everyone, Welcome to the Java Session this is swetha");
		
		gd.greet();
		
		

	}

}
