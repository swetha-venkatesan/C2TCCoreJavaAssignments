package com.tnsif.oopsconcepractise;

class Animal{
	void sound() {
		System.out.println("Animal make sound");
	}
}
class Dog extends Animal{
	void sound() {
		System.out.println("Dog barks");
	}
}

class Cat extends Animal{
	void sound() {
		System.out.println("cat makes sound as meow!!!");
	}
}
	
public class methodveridding {
	public static void main(String[] args) {
		Animal a;
		a=new Dog();
		a.sound();
		
		a=new Cat();
		a.sound();
	}
}





