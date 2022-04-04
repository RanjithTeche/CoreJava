package com.rzit.tricky;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Ranjith on 8/18/2017.
 */
public class Hashing {
    public static void main(String[] args) {
        Map<String,String>  hashMap  = new HashMap<>();
        hashMap.put("A","A");
        System.out.println(hashMap);

        int hascode = "123".hashCode();
        System.out.println("hascode:"+hascode);
        System.out.println(":"+(hascode^(hascode >>> 16)));
        System.out.println(hash("458457888888855858588"));

    }

    static final int hash(Object key) {
        int h;
        //1271114143
        //1271128668
        System.out.println("key.hashCode():"+key.hashCode());

        return (key == null) ? 0 : (h = key.hashCode()) ^ (h >>> 16);
    }
}
