package com.rzit.tricky;

/**
 * Created by Ranjith on 7/30/2017.
 */
public class FloatMinDemo {
    public static void main(String[] args) {
        System.out.println("FLOAT -> MIN_VALUE):"+Float.MIN_VALUE+"\t MIN_NORMAL:"+Float.MIN_NORMAL+"\tMIN_EXPONENT"+Float.MIN_EXPONENT);
        System.out.println("DOUBLE-> MIN_VALUE):"+Double.MIN_VALUE+"\t MIN_NORMAL:"+Double.MIN_NORMAL+"\tMIN_EXPONENT"+Double.MIN_EXPONENT);

        System.out.println(Math.min(Float.MIN_VALUE,0.0f));
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Float.MIN_VALUE);
        System.out.println(Float.MAX_VALUE);
        System.out.println(Math.min(Float.MIN_VALUE,Float.MIN_VALUE));
        System.out.println(Math.min(Float.MIN_VALUE,0.0d));
    }
}
