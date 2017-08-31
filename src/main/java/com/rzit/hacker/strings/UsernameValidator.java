package com.rzit.hacker.strings;

import java.util.Scanner;

/**
 * Created by Ranjith on 8/21/2017.
 */
public class UsernameValidator {
    /*
    * Write regular expression here.
    */
    public static final String regularExpression = "[a-zA-Z][a-zA-Z_0-9]{7,29}";
    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int n = Integer.parseInt(scan.nextLine());
        while (n-- != 0) {
            String userName = scan.nextLine();

            if (userName.matches(UsernameValidator.regularExpression)) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }
        }
    }
}
