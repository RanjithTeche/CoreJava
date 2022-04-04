package com.rzit.tricky;

import java.util.Map;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by Ranjith on 7/31/2017.
 */
public class MaxNumberFromArrayDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cols = scanner.nextInt();
        int rows = scanner.nextInt();
        long[] matrix = new long[cols];
        long max = 0;
        for (int i = 0; i < rows; i++) {
            int start = (scanner.nextInt() - 1);
            int end = scanner.nextInt();
            int incr = scanner.nextInt();
            while (start < end) {
                matrix[start] = matrix[start] + incr;
                if (max < matrix[start]) {
                    max = matrix[start];
                }
                start++;
            }

        }
        System.out.println(max);
    }
}
