package com.rzit.sort;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by Ranjith on 6/28/2017.
 */
public class SortPrimitiveAndWraper {
    public static void main(String... ignored) {
        for (int i = 0; i < 10; i++) {
            System.out.println("TIMES :"+i);
            sortPrimitive();
            sortWrapper();
        }
    }

    public static void sortPrimitive(){
        Random random = new Random();

        int[] array = new int[5000];
        for (int i=0 ; i<5000;i++){
            array[i] = random.nextInt(5000);
        }
        long start = System.nanoTime();
        Arrays.sort(array);
        long time = System.nanoTime() - start;
        System.out.printf("int[] sort took %.1f ms%n", time / 1e6);
    }

    public static void sortWrapper(){
        Random random = new Random();

        Integer[] array = new Integer[5000];
        for (int i=0 ; i<5000;i++){
            array[i] = random.nextInt(5000);
        }
        long start = System.nanoTime();
        Arrays.sort(array);
        long time = System.nanoTime() - start;
        System.out.printf("int[] sort took %.1f ms%n", time / 1e6);
    }
}
