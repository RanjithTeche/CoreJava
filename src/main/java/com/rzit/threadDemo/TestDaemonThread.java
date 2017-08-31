package com.rzit.threadDemo;

/**
 * Created by Ranjith on 8/2/2017.
 */
public class TestDaemonThread  {
    public static void main(String[] args) {
        Thread  t1= new Thread(new DaemonThread());
        Thread  t2= new Thread(new UserThread());
        t1.setDaemon(true);
        t1.setName("Daemon");
        t2.setName("User");
        t1.start();
        t2.start();
    }
}

class DaemonThread implements Runnable{

    @Override
    public void run() {
        while(true){
            processSomething();
        }
    }
    private void processSomething() {
        try {
            System.out.println("Processing :"+Thread.currentThread().getName());
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}

class UserThread implements Runnable{
    int count = 0;

    @Override
    public void run() {
        while(count < 10){
            processSomething();
            count ++;
        }
    }
    private void processSomething() {
        try {
            System.out.println("Processing :"+Thread.currentThread().getName());
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
