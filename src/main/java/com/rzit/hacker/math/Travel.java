package com.rzit.hacker.math;

import java.util.Scanner;

/**
 * Created by Ranjith on 8/20/2017.
 */
public class Travel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cases = scanner.nextInt();
        for (int i=0;i<cases;i++){
            int cities = scanner.nextInt();
            int ways =1;
            for (int j=0;j<cities-1;j++){
                ways=(ways* scanner.nextInt());
            }
            System.out.println(ways);
        }
    }
}
