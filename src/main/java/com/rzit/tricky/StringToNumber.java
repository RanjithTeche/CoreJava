package com.rzit.tricky;

/**
 * Created by Ranjith on 7/28/2017.
 */
public class StringToNumber {
    public static void main(String[] args) {
        System.out.println(convertorStringInt("123456"));

        System.out.println(convertorStringInt("-123456"));
        System.out.println(convertorStringChar("bc"));
    }

    static int convertorStringInt(String coverString) {
        int number = 0;
        int counter = 0;
        boolean isNegagative = false;
        if (coverString.charAt(counter) == '-') {
            isNegagative = true;
            counter++;
        }
        while (counter < coverString.length()) {
            number = number * 10;
            number = number + (coverString.charAt(counter) - '0');
            counter++;
        }
        return isNegagative ? -number : number;
    }

    static int convertorStringChar(String coverString) {
        int number = 0;
        int counter = 0;
        boolean isNegagative = false;
        if (coverString.charAt(counter) == '-') {
            isNegagative = true;
            counter++;
        }
        while (counter < coverString.length()) {
            number = number * 10;
            number = number + (coverString.charAt(counter) - 'a');
            counter++;
        }
        return isNegagative ? -number : number;
    }
}
