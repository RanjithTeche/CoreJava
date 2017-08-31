package com.rzit.java8features;

/**
 * Created by Ranjith on 7/10/2017.
 */
public class MyFunctionalInterfaceDemo {
    public static void test(MyFunctionalInterface functionalInterface) {
        functionalInterface.firstWork();
    }

    public static void main(String[] args) {
        test(() -> {
            System.out.println("This is my functionalInterface first task");
        });
    }
}
