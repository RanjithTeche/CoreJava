package com.rzit.tricky;

import java.util.Arrays;

/**
 * Created by Ranjith on 8/23/2017.
 */
public class MyStringLineCounter {
    static int lineCount(String str) {
        return str.split("[\n|\r]").length;
    }

    public static void main(String[] args) {

        String str = "line1\nline2\nline3\rline4";
        System.out.println(str);
        int count = lineCount(str);
        System.out.println("line count: " + count);

        String rzit = "ranjit is good boy\nhe is very crazy\nhe knows very vwll tech";
        System.out.println(rzit);
        System.out.println(lineCount(rzit));
        String rtCar = "hello world \r rafter \n nafter\ffafter";
        System.out.println(rtCar);
        Arrays.stream(rtCar.split("[\n|\r]")).forEach(it -> System.out.println(it));
    }
}
