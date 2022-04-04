package test;

import java.util.Scanner;

/**
 * Created by Ranjith on 8/10/2017.
 */
public class ConsecutiveSum {
    static int consecutive(long num) {
        int noOfConsecutiveSequences = 0;
        if (num <= 2)
            return 1;
        int start = 1;
        int end = ((int) num + 1) / 2;
        while (start < end) {
            int sum = 0;
            for (int i = start; i <= end; i++) {
                sum += i;
                if (sum == num) {
                    noOfConsecutiveSequences++;
                    break;
                }
                if (sum > num) {
                    break;
                }
            }
            start++;
        }
        return noOfConsecutiveSequences;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();
        int possibleWays = consecutive(num);
        System.out.println(possibleWays);
    }

}
