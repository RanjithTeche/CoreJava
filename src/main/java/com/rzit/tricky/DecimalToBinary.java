package com.rzit.tricky;

/**
 * Created by Ranjith on 7/21/2017.
 */
public class DecimalToBinary {
    /**
     * @param args
     */
    public static void main(String[] args) {
        for (int i = 0; i < 1000; i++) {
            System.out.println(i + "\t " + binaryConvector(i) + "\t " + decimalConvector(binaryConvector(i)));//101101
        }
    }

    /**
     * @param decimal
     * @return
     */
    static String binaryConvector(int decimal) {
        String binary = "";
        while (decimal >= 1) {
            int remainder = decimal % 2;
            binary = remainder + binary;
            decimal = decimal / 2;
        }
        return binary;
    }

    /**
     * @param binary
     * @return
     */
    static int decimalConvector(String binary) {
        char[] binaryArray = binary.toCharArray();
        int base = 2;
        int decimal = 0;
        for (int i = 0; i < binaryArray.length; i++) {
            decimal = decimal + (binaryArray[(binaryArray.length - 1) - i] == '1' ? 1 : 0) * (int) (Math.pow(base, i));
        }
        return decimal;
    }


}
