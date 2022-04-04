package com.rzit.superthis;

/**
 * Created by Ranjith on 8/1/2017.
 */
public class SuperDemo {
    public static void main(String[] args) {
        Child child = new Child();
        child.print();
        child.m1();
    }
}

class Parent {
    int a = 100;

    public Parent() {
        System.out.println("Parent Called");
    }

    void m1(){
        System.out.println("Parent M1*****");
    }
}

class Child extends Parent {
    private int a = 200;

    public Child() {
        /*Implicitly it call the super() */
        System.out.println("Child Called");
    }
    public void m1(){
        super.m1();
        System.out.println("Child M1*****");
        super.m1();
    }
    public void print() {
        System.out.println("Super: " + super.a);
        System.out.println("This :" + a);
    }
}
