package com.rzit.hacker;

/**
 * Created by Ranjith on 8/15/2017.
 */
public class RegxSolution {
    public static void main(String[] args) {
        System.out.println(match("xaabyc", "xa*b.c"));
    }

    static boolean match(String text, String regx) {
        char[] t = text.toCharArray();
        char[] r = regx.toCharArray();

        boolean[][] match = new boolean[t.length + 1][r.length + 1];
        match[0][0] = true;
        for (int i = 0; i <= t.length; i++) {
            for (int j = 1; j <= r.length; j++) {
                if (i == 0) {
                    if (r[j - 1] == '*') {
                        match[0][j] = match[0][j - 2];
                    }
                } else if (r[j - 1] == '.' || r[j - 1] == t[j - 1]) {
                    match[i][j] = match[i - 1][j - 1];
                } else if (r[j - 1] == '*') {
                    match[i][j] = match[i][j - 2];
                    if (r[j - 2] == '.' || r[j - 2] == t[j - 1]) {
                        match[i][j] = match[i][j] || match[i - 1][j];
                    }
                }
            }
        }

        return match[t.length][r.length];
    }
}
