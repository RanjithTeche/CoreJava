package com.rzit.singleton;

/**
 * Created by Ranjith on 8/6/2017.
 */
public class StaticBlockEaggerSingleton {
    private static final StaticBlockEaggerSingleton instance;

    private StaticBlockEaggerSingleton() {

    }

    static {
        instance = new StaticBlockEaggerSingleton();
    }

    public static StaticBlockEaggerSingleton getInstance() {
        return instance;
    }
}
