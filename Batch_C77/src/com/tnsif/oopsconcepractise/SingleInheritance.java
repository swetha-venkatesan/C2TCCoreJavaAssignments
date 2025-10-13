package com.tnsif.oopsconcepractise;

class Animals{
	String name;
	Animals(String name){
		this.name=name;
	}
	void display() {
		System.out.println("Animal name "+name);
	}
}
class Dog1 extends Animals{
	String breed;
	
	Dog1(String name, String breed){
		super(name);
		this.breed = breed;	
	}
	void showDetails() {
		display();
		System.out.println("Dog breed "+breed);
	}
}
public class SingleInheritance {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog1 d1=new Dog1("dhori","seberian husky");
		d1.showDetails();
		
		
	}

}
