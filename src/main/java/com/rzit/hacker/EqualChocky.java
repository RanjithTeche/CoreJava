package com.rzit.hacker;

import java.util.Scanner;

/**
 * Created by Ranjith on 8/13/2017.
 */
public class EqualChocky {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        for (int i = 0; i < T; i++) {
            int[] c = new int[scanner.nextInt()];
            int min = -1;
            for (int j = 0; j < c.length; j++) {
                c[i] = scanner.nextInt();
                if (min > c[i]) {
                    min = c[i];
                }
            }
            for (int k = 0; i < 5; i++) {
                System.out.println(minToEqual(c, min));
            }

        }


    }


    static int minToEqual(int[] c, int min) {
        int ans = 0;
        for (int i = 0; i < c.length; i++) {
            int temp = c[i] - min;
            ans += temp / 5 + temp % 5 / 2 + temp % 5 % 2;
        }
        return ans;
    }
}
