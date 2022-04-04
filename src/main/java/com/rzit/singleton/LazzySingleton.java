package com.rzit.singleton;

/**
 * Created by Ranjith on 8/6/2017.
 */
public class LazzySingleton {
    private static LazzySingleton instance;

    private LazzySingleton() {

    }

    public  static LazzySingleton getInstance() {
        if (instance == null) {
            synchronized (LazzySingleton.class) {
                if (instance == null) {
                    instance = new LazzySingleton();
                }
            }
        }
        return instance;
    }
}
