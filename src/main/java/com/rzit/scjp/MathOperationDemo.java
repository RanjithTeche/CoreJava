package com.rzit.scjp;

/**
 * Created by Ranjith on 7/30/2017.
 */
public class MathOperationDemo {
    public static void main(String[] args) {
        int x1,x2,x3,x4;
        x1=x2=x3=x4=20;
        x1+=x2-=x3*=x4/=20;
        System.out.printf("x1:"+x1 +"\t x2:"+x2 +"\t x3:"+x3 +"\t x4:"+x4);
    }
}
