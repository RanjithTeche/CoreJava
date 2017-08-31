package com.rzit.singleton;

/**
 * Created by Ranjith on 8/6/2017.
 */
public class EaggerSingleton {
    private static final EaggerSingleton INSTANCE = new EaggerSingleton();

    private EaggerSingleton() {

    }

    public static EaggerSingleton getInstance() {
        return INSTANCE;
    }


}
