package com.rzit.hacker;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Ranjith on 8/15/2017.
 */
public class Polindrome {
    public static void main(String[] args) {

        /*Scanner sc=new Scanner(System.in);
        String A=sc.next();
        char[] arr = A.toCharArray();
        for(int start=0,end=arr.length-1;start<(arr.length+1)/2;start++,end--){
              if(arr[start] != arr[end]){
                  System.out.println("No");
                  System.exit(0);
              }
        }
        System.out.println("Yes");
        */
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        s=s.trim();
        if(s.length() <1){
            String[] tokens = s.split("[^A-Za-z]+");
            System.out.println(tokens.length);
            for (String k: tokens){
                System.out.println(k);
            }
        }else {
            System.out.println(0);
        }


        scan.close();
        System.out.println(isAnagram("Hello","hello"));
        System.out.println(isAnagram("Hello","helll"));
    }
    static boolean isAnagram(String a, String b) {
        char[] a1= a.toLowerCase().toCharArray();
        char[] b1= b.toLowerCase().toCharArray();
        Arrays.sort(a1);
        Arrays.sort(b1);
        return Arrays.toString(a1).equals(Arrays.toString(b1));
    }
}
