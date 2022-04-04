package com.rzit.threadDemo;

/**
 * User: Ranjith Venganti
 * Date: 5/17/2017
 * Time: 1:02 AM
 */
public class Test {
    public static void main(String[] args) {
        MyThread myThread1 = new MyThread();
        MyThread myThread2 = new MyThread();
        myThread1.start();
        myThread2.start();

    }
}
