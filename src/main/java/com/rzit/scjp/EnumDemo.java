package com.rzit.scjp;

/**
 * Created by Ranjith on 7/31/2017.
 */
public class EnumDemo {
    public static void main(String[] args) {
        System.out.println(State.ACTIVE ==  State.ACTIVE);
        System.out.println(State.ACTIVE ==  State.INACTIVE);
        System.out.println(State.ACTIVE.equals(State.ACTIVE));
    }
}
enum State{ACTIVE, INACTIVE, DELETED}

