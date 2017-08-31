package com.rzit.regex;

/**
 * Created by Ranjith on 8/15/2017.
 */
public class RegexDemo {
    public static void main(String[] args) {
        System.out.println("1".matches("1"));
        System.out.println("1".matches("[0-9]"));
        System.out.println("A".matches("[0-9]"));
        System.out.println("1".matches("[2-9]"));
        System.out.println("1".matches("[1-9]"));
        System.out.println("1".matches("//d"));
    }
}
