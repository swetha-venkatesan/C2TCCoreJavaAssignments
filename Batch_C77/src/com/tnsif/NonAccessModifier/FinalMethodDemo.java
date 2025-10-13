package com.tnsif.NonAccessModifier;

class Parent {
    final void display() {   // final method
        System.out.println("This is a final method in Parent class");
    }
}

class Child1 extends Parent {
//     void display() { }  
//	❌ Error: cannot override the final method from Parent
}

public class FinalMethodDemo {
    public static void main(String[] args) {
        Child1 c = new Child1();
        c.display();
    }
}
