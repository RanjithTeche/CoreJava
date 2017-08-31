package com.rzit.hacker;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * Created by Ranjith on 8/14/2017.
 */
public class Textparser {
    public static void main(String[] args) {
        String s="ABC DEF \"GHI JKL\" MNO PQR";
        for(String k : s.split("\\s+^//\".?")){
            System.out.println(k);
        }
    }
    public static String parseText(String text){
        String parseText = "";
        //Arrays.stream(text.split(" ")).collect( );

        return parseText;
    }
}
