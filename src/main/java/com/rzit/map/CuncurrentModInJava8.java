package com.rzit.map;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by Ranjith on 8/29/2017.
 */
public class CuncurrentModInJava8 {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("a","k");
        map.put("b","k");
        map.put("c","k");
        map.put("d","k");
        System.out.println(map);
       /* for(Map.Entry<String,String> entry:map.entrySet()){
            System.out.println(entry.getKey());
            if(entry.getKey() == "b") {
                System.out.println("inside");
                map.remove(entry.getKey());
            }
        }*/

        map.values();
        map.keySet();
        map.entrySet().removeIf(e-> e.getKey() == "b");
        System.out.println(map);
        Set<String> newSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap<String, Boolean>());
        Set<String> newKeySet  = ConcurrentHashMap.newKeySet();


        String s  = "ranj";
        System.out.println(s.substring(1,1));
    }
}
