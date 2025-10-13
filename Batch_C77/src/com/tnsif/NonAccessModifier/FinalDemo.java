package com.tnsif.NonAccessModifier;

//final class FinalDemo {
class FinalDemo {
	final int Max = 100;
	String name="swetha";
	
//	 final void display() {
	void display() {
		System.out.println("Show the value of max:  "+Max);
		System.out.println(name);
	}

	public static void main(String[] args) {
		FinalDemo fd = new FinalDemo();
	//	fd.Max = 300;
		fd.display();
		
		
	}

}

class Child extends FinalDemo{
	
	
	void display() {
		System.out.println("Show the value of max:  "+Max);
	}
}
