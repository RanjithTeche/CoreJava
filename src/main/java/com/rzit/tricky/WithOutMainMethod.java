package com.rzit.tricky;

/**
 * Created by Ranjith on 8/1/2017.
 */
public class WithOutMainMethod {
    {
        System.out.println("In static of  WithOutMainMethod");
    }
    public WithOutMainMethod() {
        System.out.println("In Cons");
    }

    public static void main(String[] args) {
        WithOutMainMethod o = new WithOutMainMethod();
        System.out.println("In Main");
    }

}
