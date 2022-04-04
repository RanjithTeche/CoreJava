package com.rzit.scjp;

/**
 * Created by Ranjith on 7/27/2017.
 */
public class FinallyBlockDemo {
    public static void main(String[] args) {
        System.out.println(giveValue());
    }

    public  static  String giveValue(){
        try {
            String a = null;
            a.split("-");
            return "try";
        }catch (Exception e){
        	System.out.println("In Exception block ");
            return "exception";
        }finally {
        	System.out.println("In finally  block ");
            return "fainally";

        }
    }
}
