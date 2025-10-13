//program to demonstrate try catch block
package com.tnsif.exceptionHandling;

//Program to demonstrate try-catch block
public class TryCatchEg {

	static int performDivision(int x, int y) {
		System.out.println("I am in performDivision method");
		int z = 0;
		z = x / y;
		return z;
	}

	static float performDivision1(float a, float b) {
		return a / b;
	}

	public static void main(String[] args) {
		System.out.println("Integer division: " + performDivision(10, 2));
		System.out.println("Float division: " + performDivision1(10.5f, 2.5f));
	}
}