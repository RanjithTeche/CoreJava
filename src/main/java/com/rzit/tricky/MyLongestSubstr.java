package com.rzit.tricky;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Ranjith on 8/22/2017.
 */
public class MyLongestSubstr {
    String getLongestSubstr(String str) {
        String regex = "(.)(.+\\1)";
        Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        Matcher m = p.matcher(str);
        if (m.find()) {
            int count = m.groupCount();
            for (int i = 1; i <= count; i++) {
                System.out.println(m.group(i));
            }
        }

        return "";
    }

    public static void main(String a[]) {

        MyLongestSubstr mls = new MyLongestSubstr();
        System.out.println(mls.getLongestSubstr("java2novice"));
        /*System.out.println(mls.getLongestSubstr("java_language_is_sweet"));
        System.out.println(mls.getLongestSubstr("java_java_java_java"));
        System.out.println(mls.getLongestSubstr("abcabcbb"));*/
    }
}
