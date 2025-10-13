package com.tnsif.oopsconcepractise;
//what is abstraction?
//	->	Abstraction in Java is the process of hiding the internal implementation details
//and showing only the essential features of an object.
//	->	It helps reduce complexity and increase efficiency
//by focusing on what an object does rather than how it does it.
abstract class FrndName{
	abstract void name();
}

class Names extends FrndName{

//	@Override
	void name() {
		System.out.println("moni swey");
	}
	
}

public class Abstraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FrndName fn=new Names();
		fn.name();

	}

}
