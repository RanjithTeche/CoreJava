package com.rzit.threadDemo;

/**
 * User: Ranjith Venganti
 * Date: 5/17/2017
 * Time: 1:01 AM
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("MyThread Running"+Thread.currentThread().getName());
    }
}
