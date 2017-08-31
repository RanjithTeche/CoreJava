package com.rzit.hacker.math;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by Ranjith on 8/22/2017.
 */
public class BigIntegerDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigInteger a = new BigInteger(scanner.next());
        BigInteger b = new BigInteger(scanner.next());
        System.out.println(a.multiply(b));
        System.out.println(a.add(b));
        try {
            int i = 0;
            int y = 0;
            System.out.println(i / y);
        } catch (Exception e) {
            System.out.println("************getStackTrace***************");
            for (StackTraceElement s :  e.getStackTrace()){
                System.out.println(s);
            }
            System.out.println("***********fillInStackTrace ******************");
            System.out.println(e.fillInStackTrace());
            System.out.println("********** getSuppressed *******************");
            for (Throwable s :  e.getSuppressed()){
                System.out.println(s);
            }
            System.out.println(e.getClass().getCanonicalName());
        }
    }
}
