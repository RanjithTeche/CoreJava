package com.rzit.tricky;

/**
 * Created by Ranjith on 8/24/2017.
 */
public class IsPerfectNumber {
    static boolean isPerfectNumber(int num) {
        int sum = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        return sum == num;
    }

    public static void main(String a[]) {

        for (int i = 0; i < 100; i++) {

            System.out.println(i + " is perfect number: " + isPerfectNumber(i));
        }
    }
}
