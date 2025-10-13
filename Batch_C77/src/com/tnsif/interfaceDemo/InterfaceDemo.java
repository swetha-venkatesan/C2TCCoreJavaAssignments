package com.tnsif.interfaceDemo;

interface Shape{
	 
	 //declaration
   void draw();
}
public class InterfaceDemo {
	//implementation or explanation
		public void draw() {
			System.out.println("Drawing a circle in an interface");
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			InterfaceDemo id = new InterfaceDemo();
			id.draw();
			

			
		}

}
