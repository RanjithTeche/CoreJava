package com.rzit.scjp;

/**
 * Created by Ranjith on 7/30/2017.
 */
public class IfConditionEvalutionDemo {
    public static void main(String[] args) {
        boolean f1= true;
        boolean f2 = false;
        boolean f3 = true;
        if(f1&f2|f2&f3|f2){
            System.out.println("TRUE1");
        }

        if(f1&f2|f2&f3|f2|f3){
            System.out.println("TRUE2");
        }
    }


}
