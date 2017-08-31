package com.rzit.hacker.math;

import java.util.Scanner;

/**
 * Created by Ranjith on 8/19/2017.
 */
public class TrangleMinHeight {
    static int lowestTriangle(int base, int area){
        // Complete this function
        System.out.println((double) (2*100)/17);
        System.out.println((2*area)/base);
        System.out.println(Math.ceil((2*area)/base));
        return (int)(Math.ceil((double)(2*area)/base));
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int base = in.nextInt();
        int area = in.nextInt();
        int height = lowestTriangle(base, area);
        System.out.println(height);
    }
}
