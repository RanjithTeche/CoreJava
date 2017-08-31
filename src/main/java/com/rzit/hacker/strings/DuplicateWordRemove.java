package com.rzit.hacker.strings;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Ranjith on 8/21/2017.
 */
public class DuplicateWordRemove {
    public static void main(String[] args) {

        String s = "here here here     here is ahi-ahi ahi-ahi ahi-ahi joe's joe's joe's joe's joe's the result result     result";
        String regex = "\\b(\\w+)\\s+\\1\\b";
        System.out.println( s.replaceAll( regex, ""));


        Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);

        Scanner in = new Scanner(System.in);
        int numSentences = Integer.parseInt(in.nextLine());

        while (numSentences-- > 0) {
            String input = in.nextLine();

            Matcher m = p.matcher(input);

            // Check for subsequences of input that match the compiled pattern
            while (m.find()) {
                input = input.replaceAll("(?i)\\b([a-z]+)\\b(?:\\s+\\1\\b)+", "$1");
            }

            // Prints the modified sentence.
            System.out.println(input);
        }

        in.close();
    }
}
