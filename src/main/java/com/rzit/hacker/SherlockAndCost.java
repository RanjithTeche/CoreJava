package com.rzit.hacker;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Ranjith on 8/14/2017.
 */
public class SherlockAndCost {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();
        for (int c = 0; c < testCase; c++) {
            int length = sc.nextInt();
            int best = 0;
            int[] arr = new int[length];

            for (int i = 0; i < length; i++) {
                arr[i] = sc.nextInt();
                if (i > 0) {
                    int hTol1 = Math.abs(arr[i - 1] - 1);
                    int hToh1 = Math.abs(arr[i - 1] - arr[i]);
                    int lTol1 = Math.abs(1 - 1);
                    int lToh1 = Math.abs(1 - arr[i]);
                    best += Math.abs(arr[i] - arr[i - 1]);
                    System.out.println(Arrays.toString(arr) + "\t " + best);
                }
            }

            System.out.println(best);
        }

    }
}
