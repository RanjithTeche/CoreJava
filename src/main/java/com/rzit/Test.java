package com.rzit;

/**
 * User: Ranjith Venganti
 * Date: 5/17/2017
 * Time: 1:00 AM
 */
public class Test {
    public static void main(String[] args) {
        System.out.println(Double.MIN_VALUE);
        System.out.println("Wel come to rzit");
        Integer integer1 = new Integer(500000);
        Integer integer4 = new Integer(500000);
        System.out.println(integer1 == integer4);
        Integer integer2 = 500000;
        Integer integer3 = Integer.valueOf(500000);
        Integer integer5 = Integer.valueOf(500000);
        System.out.println(integer3 == integer5);
        System.out.println(integer1.hashCode());
        System.out.println(integer2.hashCode());
    }
}
