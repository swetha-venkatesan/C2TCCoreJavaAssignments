package com.tnsif.oopsconcepractise;

class Calci{
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
public class MethodOverloading {
    public static void main(String[] args) {
        Calci m = new Calci();
        System.out.println(m.multiply(2, 3));       
        System.out.println(m.multiply(2.5, 4.5));    
        System.out.println(m.multiply(2, 3, 4));    
    }
}







