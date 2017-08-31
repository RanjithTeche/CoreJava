package com.rzit.files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Scanner;

/**
 * Created by Ranjith on 8/3/2017.
 */
public class Ganesh {
    public static void main(String[] args) {
        //System.out.printf("Sa:"+findMaximumSatisfaction());
        System.out.printf("Sa:"+findSolution("input1.txt"));
    }
    /**
     * This method finds the maximum satisfaction for the given file(which contains the items).
     *
     * @return maximum satisfaction
     */
    public static int findMaximumSatisfaction() {
        int output = -1;
        InputStream in = null;
        Scanner sc = null;
        try {
            in = LargeFileRead.class.getClassLoader()
                    .getResourceAsStream("data.txt");
            sc = new Scanner(in, "UTF-8");
            int timeGiven = sc.nextInt();
            int numberOfItems = sc.nextInt();
            int[] satisfaction = new int[numberOfItems];
            int[] time = new int[numberOfItems];
            for (int i = 0; i < numberOfItems; i++) {
                satisfaction[i] = sc.nextInt();
                time[i] = sc.nextInt();
            }
            output = maxSatisfaction(timeGiven, time, satisfaction, numberOfItems);
        } catch (Exception e) {
            System.out.println("Exception occurred while finding maximum satisfaction." + e.getMessage());
            e.printStackTrace();
        }
        return output;

    }

    /**
     * This method calculates the max satisfaction for given input.
     *
     * @param T
     * @param time
     * @param satisfaction
     * @param n
     * @return max satisfaction
     */
    private static int maxSatisfaction(int T, int[] time, int[] satisfaction, int n) {
        int i, j;
        int K[][] = new int[n + 1][T + 1];
        // Build table K[][] in bottom up manner
        for (i = 0; i <= n; i++) {
            for (j = 0; j <= T; j++) {
                if (i == 0 || j == 0) {
                    K[i][j] = 0;
                } else if (time[i - 1] <= j) {
                    K[i][j] = max(satisfaction[i - 1] + K[i - 1][j - time[i - 1]], K[i - 1][j]);
                } else {
                    K[i][j] = K[i - 1][j];
                }
            }
        }
        for (i = 0; i <= n; i++) {
            for (j = 0; j <= T; j++) {
                System.out.print(K[i][j] + "\t");
            }
            System.out.println();
        }
        return K[n][T];
    }

    /**
     * This method finds the maximum among the given numbers.
     *
     * @param a
     * @param b
     * @return max number
     */
    private static int max(int a, int b) {
        return (a > b) ? a : b;
    }


    public static int findSolution(String fileName) {
        System.out.println("Inside controller");
        Scanner sc;
        InputStream in = null;
        int output = -1;
        try {
            in = LargeFileRead.class.getClassLoader()
                    .getResourceAsStream(fileName);
            sc = new Scanner(in, "UTF-8");
            int T = sc.nextInt();
            int n = sc.nextInt();
            int[] satisfaction = new int[n];
            int[] time = new int[n];
            for(int i = 0; i < n; i++) {
                satisfaction[i] = sc.nextInt();
                time[i] = sc.nextInt();
            }
            System.out.println("-------------------------------Inputs-------------------------------\n");
            System.out.println("Total time in minutes : " + T);
            System.out.println("Items in the list : " + n);
            System.out.println("Satisfaction\tTime_Taken");
            for(int i = 0; i < n; i++) {
                System.out.println(satisfaction[i] + "\t\t" + time[i]);
            }
            output = maxSatisfaction1(T, time, satisfaction, n);
            System.out.println("Feasible Solution : " + output);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return output;

    }

    private static int maxSatisfaction1(int T, int[] time, int[] satisfaction, int n) {
        int i, w;
        int K[][] = new int[n+1][T+1];
        // Build table K[][] in bottom up manner
        for (i = 0; i <= n; i++) {
            for (w = 0; w <= T; w++) {
                if (i==0 || w==0) {
                    K[i][w] = 0;
                    System.out.println("i:"+i+"\t w:"+w +"\tif:" +K[i][w] +"\t");
                } else if (time[i-1] <= w) {
                    K[i][w] = max(satisfaction[i - 1] + K[i - 1][w - time[i - 1]], K[i - 1][w]);
                    System.out.println("satisfaction :"+ (i-1)+"\t"+(satisfaction[i-1]) +"\t w:"+w+"\t K[i-1]:"+(i-1)+"\t w - time[i - 1]"+(w - time[i - 1])+"\t K[i - 1][w - time[i - 1]] :"+(K[i - 1][w - time[i - 1]]));
                    System.out.println("i:"+i+"\t w:"+w +"\telseif:" +K[i][w] +"\t");
                } else{
                    K[i][w] = K[i-1][w];
                    System.out.println("i:"+i+"\t w:"+w +"\telse:" +K[i][w] +"\t");
                }
            }

        }
        return K[n][T];
    }



}

