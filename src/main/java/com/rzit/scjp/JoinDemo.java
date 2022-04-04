package com.rzit.scjp;

/**
 * Created by Ranjith on 7/30/2017.
 */
public class JoinDemo implements  Runnable {
    public static void main(String[] args) {
        Thread thread= new Thread(new JoinDemo());
        thread.start();
        System.out.println("Start");
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("End");
    }

    @Override
    public void run() {
        System.out.println("Run");
    }
}
