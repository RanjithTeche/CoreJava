package test;

import java.util.Scanner;

/**
 * Created by Ranjith on 8/10/2017.
 */
public class InTheFuture {
    static int minNum(int A, int K, int P) {
        if (A >= K) {
            return -1;
        }
        int ashaProblems = P;
        int kellyProblems = 0;
        int days = 0;
        while (true) {
            days++;
            ashaProblems += A;
            kellyProblems += K;
            if (kellyProblems > ashaProblems) {
                return days;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int K = sc.nextInt();
        int P = sc.nextInt();
        long minimumDays = minNum(A, K, P);
        System.out.println(minimumDays);
    }
}
