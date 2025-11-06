package com.tnsif.lambdaFunction;

//1.Defining the implementation of class

class MyCubeImpl implements MyCube
{
	public int getCube(int no)
	{
		
		//implementation
		return no*no*no;
	}
}



public class UsingOldWay {

	public static void main(String[] args) {
		
		//1. using object of implementation of class
		
		MyCube obj = new MyCubeImpl();
		System.out.println("Cube is: "+obj.getCube(4));
		
		//2.Using Anonymous class
		
		MyCube obj1 = new MyCube() {
			
			public int getCube(int no)
			{
				//implementation
				return no*no*no;
			}
			
		};
		
		System.out.println("Cube is : "+obj1.getCube(5));
		
	}

}
