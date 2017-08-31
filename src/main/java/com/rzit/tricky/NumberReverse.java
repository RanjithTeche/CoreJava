package com.rzit.tricky;

/**
 * Created by Ranjith on 7/10/2017.
 */
public class NumberReverse {
    public static void main(String[] args) {
        int number = 55;
        int reverse = reversNumber(number);
        System.out.println(number + " reverse is " + reverse);
    }

    /**
     * This method is used to reverse the number and return reversed number
     * @param number is the number to reverse
     * @return reverse number
     */
    private static int reversNumber(int number) {
        int reverse = 0;
        while (number != 0) {
            reverse = (reverse * 10) + number % 10;
            number = number / 10;
        }
        return reverse;
    }
}
