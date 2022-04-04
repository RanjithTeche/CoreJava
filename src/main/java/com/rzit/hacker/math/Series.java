package com.rzit.hacker.math;

import java.util.Scanner;

/**
 * Created by Ranjith on 8/21/2017.
 */
public class Series {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int cases = in.nextInt();
        for(int i=0;i<cases;i++){
            int n =in.nextInt();
            System.out.println(Math.pow(n,2));
            System.out.println(Math.pow(n,2)%1000000007);
            System.out.println((int)(Math.ceil(Math.pow(n,2)%(Math.pow(10,9)+7))));
        }
    }
}
