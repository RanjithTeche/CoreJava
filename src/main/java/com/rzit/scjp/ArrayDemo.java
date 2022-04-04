package com.rzit.scjp;

/**
 * Created by Ranjith on 7/31/2017.
 */
public class ArrayDemo {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Object myObj = new String[]{"one", "two", "three"};
        {
            for (String s : (String[]) myObj) System.out.print(s + ".");
        }
    }
}
