package com.rzit.threads;

/**
 * Created by Ranjith on 6/30/2017.
 */
public class ThreadStatesDemo {

    public static void main(String[] args) {
        Thread thread = new Thread();
        thread.yield();
        try {
            thread.sleep(1000l);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
