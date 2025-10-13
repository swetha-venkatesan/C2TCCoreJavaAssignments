package com.tnsif.exceptionHandling;


public class TryCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("I am in main method");
		int result;
		try {

			result = TryCatchEg.performDivision(12, 0);
			if (result != 0)
				System.out.println("Division is " + result);

			System.out.println("------------------------------");

			result = TryCatchEg.performDivision(12, 3);
			if (result != 0)
				System.out.println("Division is " + result);

			System.out.println("------------------------------");
		} catch (ArithmeticException e) {
			//System.out.println("I am in catch block: " + e.getMessage());
			e.printStackTrace();
		}
		System.out.println(TryCatchEg.performDivision1(12f, 5f));

		System.out.println("------------------------------");
//		System.out.println(TryCatchEg.performDivision1(12f, 0f));

		

	}

}
