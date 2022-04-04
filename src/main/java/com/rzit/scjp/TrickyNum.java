package com.rzit.scjp;

/**
 * Created by Ranjith on 7/31/2017.
 */
public class TrickyNum<X extends Object> {

    private X x;

    public TrickyNum(X x) {
        this.x = x;
    }

    private String getString() {
        return  x.toString();
        /*Here we can call only extended class methods only */
       // return x.doubleValue();
    }

    private double getDouble() {
         return ((Double)x).doubleValue();
    }

    public static void main(String args[]) {
        TrickyNum<Integer> a = new TrickyNum<Integer>(new Integer(1));
        System.out.println(a.getString());
        System.out.println(a.getDouble());
        TrickyNum2<Integer> a2 = new TrickyNum2<Integer>(new Integer(1));
        System.out.println(a2.getDouble());
    }
}

class  TrickyNum2<X extends Integer>{
    private X x;

    public TrickyNum2(X x) {
        this.x = x;
    }

     double getDouble() {
        return x.doubleValue();
    }
}
