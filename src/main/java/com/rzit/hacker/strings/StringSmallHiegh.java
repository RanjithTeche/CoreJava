package com.rzit.hacker.strings;

import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by Ranjith on 8/21/2017.
 */
public class StringSmallHiegh {
    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        for(int i=0;i<= s.length()-k;i++){
            String current  = s.substring(i,i+k);
            if(smallest == "" || current.compareTo(smallest) < 0){
                smallest = current;
            }
            if(largest == "" || current.compareTo(largest) > 0){
                largest = current;
            }
        }
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}
