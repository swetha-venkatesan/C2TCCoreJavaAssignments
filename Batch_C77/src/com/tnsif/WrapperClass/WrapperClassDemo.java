package com.tnsif.WrapperClass;
//Wrapper Class = “a box that holds a simple toy (primitive value) so Java can treat it like a big object.”
public class WrapperClassDemo {
	public static void main(String[] args) {
		
		//autoboxing - primitive to object
		//unboxing - object to primitive
		int x = 5;
		//autoboxing
		Integer y = Integer.valueOf(x);
		//unboxing 
		int z = y;
		
		System.out.println(y +" "+ z);

	}

}
//🔹 Wrapper Class lets you turn simple values into objects.
//🔹 Autoboxing = put primitive in a wrapper.
//🔹 Unboxing = take primitive out of a wrapper.