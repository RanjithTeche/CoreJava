package com.rzit;

import java.math.BigDecimal;

/**
 * Created by Ranjith on 10/27/2016.
 */
public class Hello {
    private final String sayStatement;

    public Hello(String s) {
        this.sayStatement = s;
    }

    public String sayHello() {
        String test = "Ranjivbhgjnngnhgghgjjblhkhjhvgglglkh;h bmhjknmmbvbvntfgh1jj23";
        return this.sayStatement;

    }

    public static void main(String[] args) {
        int a =(int) (Math.pow(10,12)+(2*Math.pow(10,5)));
        long b =(long) (Math.pow(10,12)+(2*Math.pow(10,5)));
        BigDecimal c =new BigDecimal(Math.pow(10,12)+(2*Math.pow(10,5)));
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(Math.pow(10,12)+(2*Math.pow(10,5)));

        System.out.println("J");
    }
}
