package com.rzit.threads;

/**
 * User: Ranjith Venganti
 * Date: 6/1/2017
 * Time: 5:55 AM
 */
public class MyThread2 extends  Thread {

    @Override
    public void run() {
        super.run();
        synchronized (Object.class){
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "has acquired lock "
                    + "on Object class and waiting to acquire lock on String class...");
            synchronized (String.class){
                System.out.println(Thread.currentThread().getName() +
                        " has acquired lock on String class");
            }
        }
        System.out.println(Thread.currentThread().getName()+" has ENDED");
    }
}
