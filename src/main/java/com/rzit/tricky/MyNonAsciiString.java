package com.rzit.tricky;

import java.util.regex.Pattern;

/**
 * Created by Ranjith on 8/23/2017.
 */
public class MyNonAsciiString {
    public static void main(String a[]) {
        String str = "Bj��rk����oacute�i789i¥";
        System.out.println(str);
        str = str.replaceAll("[^\\p{ASCII}]", "");
        System.out.println("After removing non ASCII chars:");
        System.out.println(str);

    }
}
