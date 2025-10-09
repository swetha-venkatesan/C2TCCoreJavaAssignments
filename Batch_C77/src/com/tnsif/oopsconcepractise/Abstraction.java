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
//1. What is abstraction in Java?
//Answer:
//Abstraction is the process of hiding internal implementation details and showing only the essential features. It focuses on what an object does rather than how it does it.

//🧱 2. How is abstraction achieved in Java?
//Answer:
//Abstraction is achieved using abstract classes and interfaces.
//Abstract class can have both abstract (unimplemented) and concrete (implemented) methods.
//Interface provides 100% abstraction (before Java 8), but now can have default and static methods too.

//⚙️ 3. What is an abstract class?
//Answer:
//An abstract class is a class that cannot be instantiated and can contain abstract methods (without implementation).
//It serves as a base for other classes to extend and provide specific implementations.

//🔗 4. What is an interface?
//Answer:
//An interface is a collection of abstract methods that define a contract for classes to implement.
//It helps achieve full abstraction and multiple inheritance in Java.

//🧠 5. Difference between abstract class and interface?
//Abstract Class	Interface
//Can have abstract and concrete methods	Only abstract methods (until Java 8)
//Supports single inheritance	Supports multiple inheritance
//Can have constructors	Cannot have constructors
//Can have instance variables	Can only have constants (public static final)

//🚫 6. Can we create an object of an abstract class?
//Answer:
//No, abstract classes cannot be instantiated directly.
//We must create an object of a subclass that provides implementations for all abstract methods.

//🧩 7. Can an abstract class have a constructor?
//Answer:
//Yes, abstract classes can have constructors. They are used to initialize common data for subclasses.

//⚡ 8. What happens if a subclass does not implement all abstract methods?
//
//Answer:
//Then the subclass must also be declared abstract, otherwise it will cause a compile-time error.

//🧩 9. Can we have abstract methods in a concrete (non-abstract) class?
//Answer:
//No. If a class has even one abstract method, it must be declared abstract.

//🧩 10. Why do we use abstraction?
//Answer:
//We use abstraction to:
//Reduce code complexity
//Increase security (by hiding internal logic)
//Improve flexibility and maintainability

//🧩 11. Can an abstract class implement an interface?
//Answer:
//Yes. An abstract class can implement an interface, but it does not have to provide implementations for all the interface methods.
//The subclass that extends the abstract class must implement the remaining methods.

//⚙️ 12. Can an interface extend another interface?
//Answer:
//Yes. Interfaces can extend one or more other interfaces using the extends keyword to achieve multiple inheritance of type.
//🧠 13. Can an interface extend an abstract class?
//Answer:
//No. Interfaces can only extend other interfaces, not abstract or concrete classes.

//🧩 14. Can an abstract class have a main method?
//Answer:
//Yes, an abstract class can have a main() method. It can be used for testing or demonstrating features, but you still can’t create an instance of that abstract class.

//🧱 15. What are the access modifiers allowed for abstract methods?
//Answer:
//Abstract methods can be public or protected, but not private or final, since they need to be overridden.

//⚡ 16. Can abstract methods be static?
//Answer:
//No. Abstract methods cannot be static because static methods belong to a class, and abstract methods need to be implemented by subclasses.

//🧩 17. Can an abstract class have final methods?
//Answer:
//Yes, an abstract class can have final methods — these cannot be overridden by subclasses.

//🔗 18. What is 100% abstraction?
//Answer:
//100% abstraction means hiding all implementation details — achieved using interfaces (before Java 8).
//Abstract classes provide partial abstraction.

//🧠 19. What are default and static methods in interfaces (Java 8+)?
//Answer:
//Default methods: have a body and can be inherited by implementing classes.
//Static methods: belong to the interface itself and can be called using the interface name.
//Example:

//interface Demo {
//    default void show() { System.out.println("Default Method"); }
//    static void display() { System.out.println("Static Method"); }
//}

//💬 20. Can we use both abstraction and encapsulation together?

//Answer:
//Yes — abstraction hides implementation from the user, while encapsulation hides data inside the class.
//Together, they provide a strong security and modular structure in OOP.