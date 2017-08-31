package com.rzit.scjp;

/**
 * Created by Ranjith on 7/30/2017.
 */
class EqualHash {
    public int i;

    @Override
    public boolean equals(Object o) {
        return true;

    }

    @Override
    public int hashCode() {
        return 0;
    }
}

public class HashEqualDemo {
    public static void main(String[] args) {
        EqualHash e1 = new EqualHash();
        e1.i = 10;
        EqualHash e2 = new EqualHash();
        e2.i =10;
        System.out.println(e1 == e2);
    }


}
