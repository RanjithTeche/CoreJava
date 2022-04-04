package com.rzit.gc;

import java.io.IOException;

/**
 * Created by Ranjith on 8/2/2017.
 */
public class GCDemo {
    public static void main(String[] args) throws InterruptedException {
        MyClass my1 = new MyClass();
        MyClass my2 = new MyClass();
        my1=null;
        // MyClass my3 = my2;
        my2=null;
        System.gc();
       Thread.sleep(1000);
    }
}
class MyClass {
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("IN finalize before going to destroy ");
    }
}
