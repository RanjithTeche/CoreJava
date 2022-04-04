package com.rzit.threads;

/**
 * User: Ranjith Venganti
 * Date: 6/1/2017
 * Time: 5:57 AM
 */
public class DeadLockTest {

    public static void main(String[] args) {
        Thread thread1 = new Thread(new MyThread1(), "Thread-1");
        Thread thread2 = new Thread(new MyThread2(), "Thread-2");
        thread1.start();
        thread2.start();
    }
}
