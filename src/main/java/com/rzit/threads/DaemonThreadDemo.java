package com.rzit.threads;

/**
 * Created by Ranjith on 7/11/2017.
 */
public class DaemonThreadDemo {
    public static void main(String[] args) {
        Thread daemon = new Thread(() -> {
            while (true){
                System.out.println("My Work in the background");
            }
        });
        daemon.setDaemon(true);
        daemon.start();
        try {
            Thread.sleep(100l);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.gc();
    }

}
