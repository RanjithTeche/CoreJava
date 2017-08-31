package com.rzit.hacker;

import java.util.Scanner;

/**
 * Created by Ranjith on 8/20/2017.
 */
public class CuttingPaperSquares {
    static long solve(int n, int m) {
        // Complete this function
        long cuts = ((long) n * (long) m) - 1;
/*524074814996367239
*
*
* 689715240 759842301
* */
        return cuts;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        long result = solve(n, m);
        int a = (int) Math.pow(10, 9);
        double b = Math.pow(10, 9);
        System.out.println("a" + a);
        System.out.println("b" + b);
        System.out.println(Math.pow(10, 9));
        System.out.println(result);
        System.out.println(689715240 * 759842301);
        long a1 = 689715240L;
        long b1 = 759842301L;
        long re = a1 * b1;
        System.out.println(re);
    }
}
