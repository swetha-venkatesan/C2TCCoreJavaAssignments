package com.tnsif.oopsconcepractise;


//polymorphism

//Polymorphism means “many forms.”
//In Java, polymorphism allows one object to behave differently based on the context
//— i.e., the same method or function can perform different actions depending on the object that calls it.

//types of polymorphism

//->method overriding
// Method overloading means having multiple methods with the same name in the same class, 
//but with different parameters (different number or type of arguments).

//->method overloading
//Method overriding occurs when a child class provides its own implementation 
//of a method that is already defined in the parent class.

//It allows subclass to change or extend the behavior of the parent method.


//method overriding

//class Animal {
//    void sound() {
//        System.out.println("Animal makes a sound");
//    }
//}
//
//class Dog extends Animal {
//    void sound() {
//        System.out.println("Dog barks");
//    }
//}
//
//class Cat extends Animal {
//    void sound() {
//        System.out.println("Cat meows");
//    }
//}
//
//public class polymorphism1 {
//    public static void main(String[] args) {
//        Animal a; // reference variable of parent class
//
//        a = new Dog();  // Dog object
//        a.sound();      // Output: Dog barks
//
//        a = new Cat();  // Cat object
//        a.sound();      // Output: Cat meows
//    }
//}


//method overloading
class MathOperation {
    int multiply(int a, int b) {
        return a * b;
    }

    double multiply(double a, double b) {
        return a * b;
    }

    int multiply(int a, int b, int c) {
        return a * b * c;
    }
}

public class polymorphism1 {
    public static void main(String[] args) {
        MathOperation m = new MathOperation();

        System.out.println(m.multiply(2, 3));        // Calls 2-arg int version
        System.out.println(m.multiply(2.5, 4.5));    // Calls double version
        System.out.println(m.multiply(2, 3, 4));     // Calls 3-arg version
    }
}









//

