package test;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Ranjith on 8/10/2017.
 */
public class LargestSubset {
    static long[] maxSubsetSum(int[] k) {
        long[] output = new long[k.length];
        for (int counter = 0; counter < k.length; counter++) {
            int sum = 0;
            for (int j = 2; j <= k[counter] / 2; j++) {
                if (k[counter] % j == 0) {
                    sum += j;
                }
            }
            output[counter] = sum + k[counter] + 1;
        }
        return output;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] k = new int[sc.nextInt()];
        for (int i = 0; i < k.length; i++) {
            k[i] = sc.nextInt();
        }
        long[] result = maxSubsetSum(k);
        System.out.println(Arrays.toString(result));
    }
}
