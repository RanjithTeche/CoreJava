package com.rzit.hacker.format;

import java.util.Scanner;

/**
 * Created by Ranjith on 8/21/2017.
 */
public class MathTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        for(int i=1;i<=10;i++){
            System.out.printf("%d x %d = %d%n",N,i,N*i);
        }
    }
}
