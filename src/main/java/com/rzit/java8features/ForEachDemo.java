package com.rzit.java8features;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Ranjith on 7/27/2017.
 */
public class ForEachDemo {
    public static void main(String[] args) {
        List<Integer>  list = new ArrayList<>();
        for(int i=0; i<5;i++){
            list.add(i);
        }
        list.forEach(integer -> {
            System.out.println("Number is :"+integer);
        });
    }
}
