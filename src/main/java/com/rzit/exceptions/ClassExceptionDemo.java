package com.rzit.exceptions;

/**
 * Created by Ranjith on 7/10/2017.
 */
public class ClassExceptionDemo {

    public static void main(String[] args) {
        ClassNotFoundExceptionDemo();
        NoClassDefFoundErrorDemo();
    }

    public static void ClassNotFoundExceptionDemo() {
        try {
            ClassLoader.getSystemClassLoader().loadClass("A");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void NoClassDefFoundErrorDemo() {
          MyClass myClass = new MyClass();
          MyClass2 myClass2 = new MyClass2();
    }
}



