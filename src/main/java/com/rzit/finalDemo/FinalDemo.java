package com.rzit.finalDemo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ranjith on 8/4/2017.
 */
public class FinalDemo {
    public static void main(String[] args) {
        final int a =10;
        final List<Integer> list  =new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println(list);
        System.out.println(a+1);
    }
}
