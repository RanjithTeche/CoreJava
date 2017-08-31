package com.rzit.java8features;

/**
 * Created by Ranjith on 7/10/2017.
 */
public class RunableFuntionalInterface {
    public static void main(String[] args) {
        Thread t = new Thread(()->{
            System.out.println("In my runable task");
        });

        t.start();
    }
}
