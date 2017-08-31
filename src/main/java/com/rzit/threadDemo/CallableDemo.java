package com.rzit.threadDemo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.*;

/**
 * Created by Ranjith on 7/6/2017.
 */
public class CallableDemo {
    public static void main(String[] args) {
        //Thread t = new Thread(new MyCallable());
        ArrayList<Future<String>> futureList = new ArrayList<>();
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        List<MyCallable> myCallableList = new ArrayList<>();
        myCallableList.add(new MyCallable());
        myCallableList.add(new MyCallable());
        myCallableList.add(new MyCallable());
        myCallableList.add(new MyCallable());
        myCallableList.add(new MyCallable());
        for (MyCallable callable : myCallableList) {
            futureList.add(executorService.submit(callable));

        }
        executorService.shutdown();
        System.out.println(executorService.isShutdown());
        System.out.println(executorService.isTerminated());
        while (!executorService.isTerminated()) {

        }
        for (Future<String> o : futureList) {
            System.out.println(executorService.isTerminated());
            try {
                System.out.println(o.get(1, TimeUnit.MILLISECONDS));
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            } catch (TimeoutException e) {
                e.printStackTrace();
            }
        }
    }
}

class MyCallable implements Callable<String> {
    @Override
    public String call() throws Exception {
        Thread.sleep(100);
        return "Hi";
    }
}