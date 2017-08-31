package com.rzit.hacker.format;

import java.util.Scanner;

/**
 * Created by Ranjith on 8/21/2017.
 */
public class FormatPrintf {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++){
            String s1=sc.next();
            int x=sc.nextInt();
            System.out.printf("%-15s%03d%n",s1,x);
        }
        System.out.println("================================");

    }
}
