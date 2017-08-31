package test;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Ranjith on 8/10/2017.
 */
public class PsychometricTesting {
    static int[] jobOffers(int[] scores, int[] lowerLimits, int[] upperLimits) {
        int[] result = new int[lowerLimits.length];
        for (int i = 0; i < lowerLimits.length; i++) {
            int noOfOffers = 0;
            for (int j = 0; j < scores.length; j++) {
                if (scores[j] >= lowerLimits[i] && scores[j] <= upperLimits[i]) {
                    noOfOffers++;
                }
            }
            result[i] = noOfOffers;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] scores = new int[sc.nextInt()];
        for (int i = 0; i < scores.length; i++) {
            scores[i] = sc.nextInt();
        }
        int[] lowerLimits = new int[sc.nextInt()];
        for (int i = 0; i < lowerLimits.length; i++) {
            lowerLimits[i] = sc.nextInt();
        }
        int[] upperLimits = new int[sc.nextInt()];
        for (int i = 0; i < upperLimits.length; i++) {
            upperLimits[i] = sc.nextInt();
        }
        int[] jobOffers = jobOffers(scores, lowerLimits, upperLimits);
        System.out.println(Arrays.toString(jobOffers));
    }
}
