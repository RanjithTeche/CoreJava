package com.rzit.java8features;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ranjith on 7/27/2017.
 */
public class StreamDemo {

    public static void main(String[] args) {
        List<Integer>  list  =  new ArrayList<>();
         for(int i = 0 ; i <20 ; i ++){
             list.add(i);
         }
        list.stream().filter(integer -> integer > 10).forEach(integer -> System.out.println("Sequential Stream :"+integer));
        list.parallelStream().filter(integer -> integer > 10).forEach(integer -> System.out.println("Parallel Stream : "+integer));
    }
}
