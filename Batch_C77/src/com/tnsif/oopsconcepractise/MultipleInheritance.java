package com.tnsif.oopsconcepractise;

interface Parents11 {
    void pts1();
}
interface Parents2 {
    void pts2();
}
// Child implements both interfaces
class Child implements Parents11, Parents2 {
    public void pts1() {
        System.out.println("Parent 1");
    }
    public void pts2() {
        System.out.println("Parent 2");
    }
    void child() {
        System.out.println("Child class");
    }
}
public class MultipleInheritance {
    public static void main(String[] args) {
        Child c = new Child();
        c.pts1();
        c.pts2();
        c.child();
    }
}
