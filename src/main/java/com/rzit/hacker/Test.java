package com.rzit.hacker;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * Created by Ranjith on 8/15/2017.
 */
public class Test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while (testCases > 0) {
            String pattern = in.nextLine();
            try {
                Pattern.compile(pattern);
                System.out.println("Valid");
            } catch (Exception e) {
                System.out.println("Invalid");
            }
        }
    }
}
