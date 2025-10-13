package com.tnsif.NonAccessModifier;

final class FinalClass {   // final class
    void display() {
        System.out.println("This is a final class - cannot be inherited");
    }
//}

// class SubClass extends FinalClass { }  ❌ Error: cannot inherit from final class

//public class FinalClassDemo {
    public static void main(String[] args) {
        FinalClass obj = new FinalClass();
        obj.display();
    }
}
