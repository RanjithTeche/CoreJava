package com.rzit.hacker;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by Ranjith on 8/22/2017.
 */
public class JumpGame {


    public static boolean canWin(int leap, int[] game) {
        // Return true if you can win the game; otherwise, return false.
        int end = game.length;
        System.out.println("****************");
        for (int i = 1; i < end; i++) {
            boolean f = isSolvable(leap, game, i + 1) || isSolvable(leap, game, i - 1) || isSolvable(leap, game, i + leap);
            ;
            System.out.println(f + "\t" + i);
            if (!f) {
                return false;
            }
        }
        System.out.println("****************");
        return true;
    }

    private static boolean isSolvable(int m, int[] arr, int i) {
        if (i < 0 || (i < arr.length && arr[i] == 1)) {
            System.out.println("if 1 rt false" + "\t" + i + "\t" + m);
            return false;
        }
        if ((i == arr.length - 1) || i + m > arr.length - 1) {
            System.out.println("if 2 rt true" + "\t" + i + "\t" + m);
            return true;
        }
        arr[i] = 1;
        return true;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();
            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                //game[i] = Math.random() < 0.5 ? 0 : 1;
                game[i] = scan.nextInt();
                System.out.print(game[i] + "\t");
            }

            System.out.println((canWin(leap, game)) ? "YES" : "NO");
        }
        scan.close();
    }

/*IP
3
6 2
0 1 0 1 0 1
10 6
0 0 1 1 0 0 1 1 0 0
10 3
0 0 1 1 0 0 1 1 0 0
YES
NO
YES
IP
3
6 2
0 1 0 1 0 1
10 6
0 0 1 1 0 0 1 1 0 0
10 3
0 0 1 1 0 0 1 1 0 0
YES
YES
NO*/


}
