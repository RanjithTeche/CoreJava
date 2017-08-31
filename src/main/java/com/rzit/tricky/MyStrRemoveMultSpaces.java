package com.rzit.tricky;

import java.util.StringTokenizer;

/**
 * Created by Ranjith on 8/24/2017.
 */
public class MyStrRemoveMultSpaces {
    public static void main(String a[]){
        String str = "String    With Multiple               Spaces";
        /*StringTokenizer st = new StringTokenizer(str, " ");
        StringBuffer sb = new StringBuffer();
        while(st.hasMoreElements()){
            sb.append(st.nextElement()).append(" ");
        }*/
        System.out.println(str.trim().replaceAll(" +", " "));
    }
}
