//package com.tnsif.oopsconcepractise;
//
////import com.tnsif.oopsconcept.Apple;
//
//class Fruit{
//	void show() {
//		System.out.println("I like to eat fruits");
//	}
//}
//
//class Apple extends Fruit{
//	void AppleDemo() {
//		System.out.println("I like to eat apple");
//	}
//}
//
//class Grapes extends Fruit{
//	void GrapesDemo() {
//		System.out.println("I like to eat grapes");
//	}
//}
//
//public class HeirachyInheritance {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Apple a = new Apple();
//		a.AppleDemo();
//		a.show();
//	}
//
//}
package com.tnsif.oopsconcepractise;

class Fruit {
    void show() {
        System.out.println("I like to eat fruits");
    }
}

class Apple extends Fruit {
    void appleDemo() {
        System.out.println("I like to eat apple");
    }
}

class Grapes extends Fruit {
    void grapesDemo() {
        System.out.println("I like to eat grapes");
    }
}

public class HeirachyInheritance {

    public static void main(String[] args) {
        Apple a = new Apple();
        a.appleDemo();
        a.show();

        System.out.println("------------------");

        Grapes g = new Grapes();
        g.grapesDemo();
        g.show();
    }
}

