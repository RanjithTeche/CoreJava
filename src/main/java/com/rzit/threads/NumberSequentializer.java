package com.rzit.threads;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * Created by Ranjith on 7/3/2017.
 */
public class NumberSequentializer {
    public static void main(String[] args) {
        /*Initiate 10 threads each thread print the number in sequentially */
        /*OUTPUT: 1,2,3,4,5,6........*/
        // Create the workers
        Worker w1 = new Worker();
        Worker w2 = new Worker();
        Worker w3 = new Worker();
        Worker w4 = new Worker();

        // chain them in a round robin fashion
        w1.setNext(w2);
        w2.setNext(w3);
        w3.setNext(w4);
        w4.setNext(w1);

        // Create named threads for the workers
        Thread t1 = new Thread(w1, "Thread-1 - ");
        Thread t2 = new Thread(w2, "Thread-2 - ");
        Thread t3 = new Thread(w3, "Thread-3 - ");
        Thread t4 = new Thread(w4, "Thread-4 - ");

        // start the threads
        t1.start();
        t2.start();
        t3.start();
        t4.start();

        // Seed the first worker
        w1.accept(1);
    }
}

class Worker implements Runnable {
    BlockingQueue<Integer> q = new LinkedBlockingQueue<Integer>();
    Worker next = null; // next worker in the chain

    public void setNext(Worker t) {
        this.next = t;
    }

    public void accept(int i) {
        q.add(i);
    }

    @Override
    public void run() {
        while (true) {
            try {
                int i = q.take(); // blocks till it receives a number

                System.out.println(Thread.currentThread().getName() + i);

                Thread.sleep(1000); // delay to slow the printing
                if (next != null) {
                    next.accept(i + 1); // pass the next number to the next worker
                }

            } catch (InterruptedException e) {
                System.err.println(Thread.currentThread().getName() + " interrrupted.");
            }
        }
    }
}
