package com.rzit.scjp;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ranjith on 7/30/2017.
 */
public class GenericDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);

        List objectList =  new ArrayList();
        objectList.add(10.12);
        objectList.add("R");
        System.out.println("Size before :"+list.size() +"\t ele :"+list);
        list.addAll(objectList);
        System.out.println("Size after :"+list.size() +"\t ele :"+list);
    }
}
