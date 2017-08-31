package com.rzit.singleton;

import java.io.*;

/**
 * Created by Ranjith on 8/6/2017.
 */
public class EaggerSingletonDemo {
    public static void main(String[] args) {
        EaggerSingleton obj1 = EaggerSingleton.getInstance();
        EaggerSingleton obj2 = EaggerSingleton.getInstance();
        System.out.println(obj1 == obj2);

        StaticBlockEaggerSingleton staticObj1 = StaticBlockEaggerSingleton.getInstance();
        StaticBlockEaggerSingleton staticObj2 = StaticBlockEaggerSingleton.getInstance();
        System.out.println(staticObj1 == staticObj2);

        LazzySingleton lazy1 = LazzySingleton.getInstance();
        LazzySingleton lazy2 = LazzySingleton.getInstance();

        System.out.println(lazy1 == lazy2);


        InnerClassSingleton inner1 = InnerClassSingleton.getInstance();
        InnerClassSingleton inner2 = InnerClassSingleton.getInstance();
        System.out.println(inner1 == inner2);

        try {
            InnerClassSingleton inner3 = InnerClassSingleton.getInstance();
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(new File("/clone.txt")));
            objectOutputStream.writeObject(inner3);

            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(new File("/clone.txt")));
            try {
                InnerClassSingleton obj =  (InnerClassSingleton)objectInputStream.readObject();
                System.out.println(obj ==  inner3);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }


    }
}
