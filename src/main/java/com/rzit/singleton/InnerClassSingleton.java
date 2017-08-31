package com.rzit.singleton;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ranjith on 8/6/2017.
 */
public class InnerClassSingleton {

    private InnerClassSingleton() {

    }

    private static class SignletonHelleper {
        private static final InnerClassSingleton INSTANCE = new InnerClassSingleton();
    }

    public static InnerClassSingleton getInstance(){
        return SignletonHelleper.INSTANCE;
    }
}
