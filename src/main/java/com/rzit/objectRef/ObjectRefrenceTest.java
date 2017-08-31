package com.rzit.objectRef;

import com.sun.javafx.collections.MappingChange;

import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;

/**
 * User: Ranjith Venganti
 * Date: 6/14/2017
 * Time: 1:40 AM
 */
public class ObjectRefrenceTest {

    public static void main(String[] args) {
        Integer prime = 1;
        WeakReference<Integer> soft = new WeakReference<Integer>(prime);
        System.out.println("SOFT:" + soft);
        prime = null;
        int i = 0;
        while (i < 100 || soft == null) {
            System.out.println("At iteration " + i + " the soft still holds the reference on:" + soft);
            try {
                Thread.sleep(1000l);
                System.gc();
            } catch (InterruptedException e) {
                System.out.println("Exception:" + soft);
                e.printStackTrace();
            }
            i++;
        }
        System.out.println("SOFT:" + soft);
        MyObjectKey key1 = new MyObjectKey("Ranjith", 25);
        WeakHashMap<MyObjectKey, Integer> weakHashMap = new WeakHashMap<MyObjectKey, Integer>();
        weakHashMap.put(key1,10 );
        System.out.println(weakHashMap);
        key1 = null;
        i = 0;
        while (weakHashMap.size() != 0) {
            System.out.println("At iteration " + i + " the map still holds the reference on someDataObject" + weakHashMap);
            try {
                Thread.sleep(1000l);
                System.gc();
            } catch (InterruptedException e) {
                System.out.println("Exception:" + weakHashMap);
                e.printStackTrace();
            }
            i++;
        }
        System.out.println("somDataObject has finally been garbage collected at iteration  hence the map is now empty");
        System.out.println(weakHashMap);

    }
}
