package com.tnsif.lambdaFunction;
public class UsingLambdaWay {

	public static void main(String[] args) {
		
		//Lambda Expression
		MyCube obj = (no) -> no*no*no;
		
		/*
		 * MyCube obj1 = (no) -> { return no*no*no; };
		 */
		
		System.out.println("Lambda Cube is: "+obj.getCube(3));
		
		
		//Arithmetic
		
		Operations opr;
		
		//Addition
		
		opr = (a,b) -> a + b; 
		System.out.println("addition is: "+opr.performArithmetic(10, 20));
		
		//Subtraction
		
		opr = (a,b) -> a - b; 
		System.out.println("subtraction is: "+opr.performArithmetic(10, 20));
		
		//Multiplication
		
		opr = (a,b) -> a * b; 
		System.out.println("Multiplication is: "+opr.performArithmetic(10, 20));
		
		//Division
		
		opr = (a,b) -> a/b; 
		System.out.println("Division is: "+opr.performArithmetic(10, 20));
		
		//Palindrome - String of Palindrome
		
		Palindrome<String> strPalin;
		strPalin = (data) ->
		{
			String revData = new StringBuffer(data).reverse().toString();
			return data.equals(revData);
		};
		
		System.out.println("Is MALAYALAM palindrome?: "+strPalin.checkPalindrome("MALAYALAM"));
		System.out.println("Is CAR palindrome?: "+strPalin.checkPalindrome("CAR"));

		//Palindrome - Number of Palindrome
		
		
		Palindrome<Integer> intPalin;
		intPalin = (data) -> 
		{
			int rev = 0,no = data;
			while(no!=0)
			{
				rev = rev*10+no%10;
				no=no/10;
	
			}
			
			if(data==rev)
				return true;
			else
				return false;

		};
		
		System.out.println("Is 121 palindrome?: "+intPalin.checkPalindrome(121));
		System.out.println("Is 12132 palindrome?: "+intPalin.checkPalindrome(12132));
	}

}
