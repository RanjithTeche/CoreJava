package com.rzit.threadDemo;


/**
 * Created by Ranjith on 8/2/2017.
 */
public class ShutdownHookDemo {
    public static void main(String[] args) {
        Runtime runTime = Runtime.getRuntime();
        runTime.addShutdownHook(new Thread(new ShutDownFire()));
        System.out.println(Thread.currentThread().getName() +"\t is running and we  going to sleep 5000 and press Cntrl+c");
        try {
            Thread.currentThread().sleep(5000l);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() +"\t is going to END");
    }
}

class ShutDownFire implements Runnable{
    @Override
    public void run() {
        System.out.println("This will fire when the JV going to shutdown (Main Thread running we kill the JVM by cntrl+c");
    }
}
