package com.tnsif.NonAccessModifier;

public class FinalVariableDemo {
    final int MAX = 100;  // final variable

    void show() {
        System.out.println("Value of MAX: " + MAX);
        // MAX = 200;  ❌ Error: cannot assign a value to final variable MAX
    }

    public static void main(String[] args) {
        FinalVariableDemo obj = new FinalVariableDemo();
        obj.show();
    }
}
