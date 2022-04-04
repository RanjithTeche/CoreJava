package com.rzit.threads;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

/**
 * Created by Ranjith on 7/30/2017.
 */

public class ExecutorServiceDemo {
    public static void main(String[] args) {
        List<Future<String>> futureList = new ArrayList<>();
        List<MyCallable> callableList = new ArrayList<>();
        callableList.add(new MyCallable());
        callableList.add(new MyCallable());
        callableList.add(new MyCallable());
        ExecutorService service = Executors.newFixedThreadPool(callableList.size());
        for (MyCallable callable : callableList) {
            futureList.add(service.submit(callable));
        }
        service.shutdown();
        while (!service.isTerminated()) {

        }
        for (Future future : futureList) {
            try {
                System.out.println(future.get());
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        }
    }
}

class MyCallable implements Callable<String> {
    @Override
    public String call() throws Exception {
        return "WORK" + Thread.currentThread().getName();
    }
}
