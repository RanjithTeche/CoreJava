package com.rzit.hacker;

import java.util.Scanner;

/**
 * Created by Ranjith on 8/15/2017.
 */
public class HourGlassSol {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for(int arr_i=0; arr_i < 6; arr_i++){
            for(int arr_j=0; arr_j < 6; arr_j++){
                arr[arr_i][arr_j] = in.nextInt();
            }
        }
        int best =Integer.MIN_VALUE;
        for(int i=0;i<4;i++){
            int sum=0;
            for(int j=0;j<4;j++){
                sum = arr[i][j]+arr[i][j+1]+arr[i][j+2]+arr[i+1][j+1]+arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2];
                best = Math.max(best, sum);
            }
        }
        System.out.print(best);
    }
}
