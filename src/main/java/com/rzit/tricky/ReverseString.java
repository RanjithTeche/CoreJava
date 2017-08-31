package com.rzit.tricky;

/**
 * Created by Ranjith on 7/28/2017.
 */
public class ReverseString {

    public static void main(String[] args) {
        String string  = "abcdefgh ijkl mno";
        String reveredString =  reverseRecursively(string);
        System.out.println("String :"+string);
        System.out.println("reversed :"+reveredString);
    }
    public static String reverseRecursively(String str) {

        //base case to handle one char string and empty string
        System.out.println(str +"\t :"+str.charAt(0));
        if (str.length() < 2) {
            return str;
        }
        return reverseRecursively(str.substring(1)) + str.charAt(0);

    }
}
