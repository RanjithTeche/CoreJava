package com.rzit.hacker;

import java.util.Scanner;

/**
 * Created by Ranjith on 8/19/2017.
 */
public class ArmyGame {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[][] grid = new int[n][m];
        int drops =0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 0) {
                    grid[i][j] = 1;
                    if (j + 1 < m) {
                        grid[i][j + 1] = 1;
                    }
                    if (i + 1 < n) {
                        grid[i + 1][j] = 1;
                    }
                    if (i + 1 < n && j + 1 < m) {
                        grid[i + 1][j + 1] = 1;
                    }
                    drops++;
                }
            }
        }
        System.out.println(drops);
    }

}
