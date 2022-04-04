package com.rzit.threads;

/**
 * User: Ranjith Venganti
 * Date: 6/1/2017
 * Time: 5:52 AM
 */
public class MyThread1 extends  Thread {
    @Override
    public void run() {
        super.run();
        synchronized (String.class){
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "has acquired lock "
                    + "on String class and waiting to acquire lock on Object class...");
            synchronized (Object.class){
                System.out.println(Thread.currentThread().getName() +
                        " has acquired lock on Object class");
            }
        }
        System.out.println(Thread.currentThread().getName()+" has ENDED");
    }
}
