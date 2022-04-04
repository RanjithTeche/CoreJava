package com.rzit.tricky;

/**
 * Created by Ranjith on 7/30/2017.
 */
public class MethodOverload {
    public void process(Object obj){
        System.out.println("Object:"+obj);
    }
    public void process(String obj){
        System.out.println("String:"+obj);
    }
    /*public void process(Integer obj){
        System.out.println("Integer:"+obj);
    }*/
    public static void main(String[] args) {
        MethodOverload m1= new MethodOverload();
        /*If the class have the integer and string overlaoded methods if we try to pass the direct null value compile time error will occured*/
        m1.process(null);
    }
}
