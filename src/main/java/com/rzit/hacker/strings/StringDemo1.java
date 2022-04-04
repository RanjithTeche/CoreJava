package com.rzit.hacker.strings;

import java.util.Scanner;

/**
 * Created by Ranjith on 8/21/2017.
 */
public class StringDemo1 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        System.out.println(A.length()+B.length());
        int comp = A.compareTo(B);
        System.out.println(comp > 0 ? "Yes":"No") ;
        A = A.toLowerCase().replace(A.charAt(0),Character.toUpperCase(A.charAt(0)));
        B = B.toLowerCase().replace(B.charAt(0),Character.toUpperCase(B.charAt(0)));
        System.out.println(comp > 0 ? A +" "+B : B +" "+A );


    }

    static  void subStr(){
            Scanner in = new Scanner(System.in);
            String S = in.next();
            int start = in.nextInt();
            int end = in.nextInt();
            System.out.println(S.substring(start,end));
    }
}
