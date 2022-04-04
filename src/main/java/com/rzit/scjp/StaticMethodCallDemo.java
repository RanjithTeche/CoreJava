package com.rzit.scjp;

/**
 * Created by Ranjith on 7/30/2017.
 */
public class StaticMethodCallDemo {
    public static void main(String[] args) {
        MyStaticClass obj = null;
        obj.process();
    }
}

class MyStaticClass {
    public static void process() {
        System.out.println("Ima going to process");
    }
}

