package com.tnsif.oopsconcepractise;
class GrandParents1 {
    void g1() {
        System.out.println("Grand Parents");
    }
}
class Parents1 extends GrandParents1 {
    void p1() {
        System.out.println("Parents");
    }
}
class Child1 extends Parents1 {
    void child() {
        System.out.println("Child");
    }
}
public class MultilevelInheritance {

    public static void main(String[] args) {
        Child1 c = new Child1();
        c.child(); // child's method
        c.p1();    // parent's method
        c.g1();    // grandparent's method
    }
}
