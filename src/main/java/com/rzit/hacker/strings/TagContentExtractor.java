package com.rzit.hacker.strings;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Ranjith on 8/21/2017.
 */
public class TagContentExtractor {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while (testCases > 0) {
            String line = in.nextLine();
            String regex = "<([^>]*)\\b*>([^<]+)</\\1>";
            //String regex = "<([A-Za-z][A-Za-z 0-9]*)\\b[^>]*>(.*?)</\\1>";
            Pattern p = Pattern.compile(regex);
            Matcher m = p.matcher(line);
            if (m.find()) {
                System.out.println(m.group(2));
            }else {
                System.out.println("None");
            }
            testCases--;
        }
    }
}
