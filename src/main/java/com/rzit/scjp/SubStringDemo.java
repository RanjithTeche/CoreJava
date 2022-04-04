package com.rzit.scjp;

/**
 * Created by Ranjith on 7/30/2017.
 */
public class SubStringDemo {
    public static void main(String[] args) {
        String str = "ABC JAVA TEST";
        char c= str.charAt(str.length()-4);
        System.out.println("lenght :"+ str.length()+ "char possition looking"+( str.length()-4)+ "Char :"+c);
        /*in sub string endIndex is exclusive*/
        str= str.substring(6,8);
        System.out.println("Sub String :"+str +"\t:lenght:"+str.length());
        str = str +c;
        System.out.println(str);


        String test = "This is a test string";
        String[] tokens = test.split("\\s");
        System.out.println(tokens.length);
    }
}
