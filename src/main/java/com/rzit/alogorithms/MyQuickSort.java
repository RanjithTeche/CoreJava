package com.rzit.alogorithms;

import java.util.Arrays;

/**
 * Created by Ranjith on 7/20/2017.
 */
public class MyQuickSort {
    public static void main(String[] args) {
        int[] input = {24, 2, 45, 20, 56, 75, 2, 56, 99, 53, 12};
        quickSort(input, 0, input.length - 1);
        System.out.println("After Sort");
        for (int i : input) {
            System.out.println(i);
        }
    }

    private static void exchangeNumbers(int[] unsortedArray, int i, int j) {
        int temp = unsortedArray[i];
        unsortedArray[i] = unsortedArray[j];
        unsortedArray[j] = temp;
    }


    static void quickSort(int[] unsortedArray, int lowerIndex, int higherIndex) {
        int pivot = unsortedArray[lowerIndex + (higherIndex - lowerIndex) / 2];
        int leftIndex = lowerIndex;
        int rightIndex = higherIndex;
        // Divide into two arrays
        while (leftIndex <= rightIndex) {
            while (unsortedArray[leftIndex] < pivot) {
                leftIndex++;
            }
            while (unsortedArray[rightIndex] > pivot) {
                rightIndex--;
            }
            if (leftIndex <= rightIndex) {
                exchangeNumbers(unsortedArray, leftIndex, rightIndex);
                leftIndex++;
                rightIndex--;
            }
        }
        if (lowerIndex < rightIndex) {
            System.out.println("*** lower index " + lowerIndex + "is below the right index" + rightIndex);
            for (int i : unsortedArray) {
                System.out.print(i + "\t");
            }
            quickSort(unsortedArray, lowerIndex, rightIndex);
        }
        if (leftIndex < higherIndex){
            System.out.println("*** leftIndex " + leftIndex + "is below the higherIndex " + higherIndex);
            for (int i : unsortedArray) {
                System.out.print(i + "\t");
            }
            quickSort(unsortedArray, leftIndex, higherIndex);
        }
    }
}
