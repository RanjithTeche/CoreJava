package com.rzit.tricky;

/**
 * Created by Ranjith on 7/30/2017.
 */
public class IntegerCacheDemo {
    public static void main(String[] args) {
        Integer i1 = 10;
        Integer i2 = 10;

        Integer i3 = 150;
        Integer i4 = 150;
        System.out.println("Chache :" + (i1 == i2) + "\t not cache limit :" + (i3 == i4));



    }
}
