package com.rzit.hacker;

import java.util.Scanner;

/**
 * Created by Ranjith on 8/13/2017.
 */
public class CoinChange {
    static long getWays(long n, long[] c) {
        long temp[][] = new long[c.length + 1][(int) n + 1];
        for (int i = 0; i <= c.length; i++) {
            temp[i][0] = 1;
        }
        for (int i = 1; i <= c.length; i++) {
            for (int j = 1; j <= n; j++) {
                if (c[i - 1] > j) {
                    temp[i][j] = temp[i - 1][j];

                } else {
                    temp[i][j] = temp[i][(int) (j - c[i - 1])] + temp[i - 1][j];
                }
                if (temp[i][j] < 0) {
                    System.out.println(i + "\t:" + j + "\t:" + temp[i][j]);
                    return 0;
                }

            }
        }
        return temp[c.length][(int) n];
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        long[] c = new long[m];
        for (int c_i = 0; c_i < m; c_i++) {
            c[c_i] = in.nextLong();
        }
        // Print the number of ways of making change for 'n' units using coins having the values given by 'c'
        long ways = getWays(n, c);
        System.out.println(ways);
        /*
        * i/p:
        * 166 23
           5 37 8 39 33 17 22 32 13 7 10 35 40 2 43 49 46 19 41 1 12 11 28
        *
        *
        * o/p : 96190959
        * */
    }
}
