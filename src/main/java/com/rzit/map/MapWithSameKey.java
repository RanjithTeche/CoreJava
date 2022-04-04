package com.rzit.map;

import java.util.HashMap;
import java.util.LinkedHashMap;

/**
 * Created by Ranjith on 7/5/2017.
 */
public class MapWithSameKey {
    public static void main(String[] args) {
        hashMapKeyOverRide();
        linkedHashMapKeyOverRide();
    }

    public  static void hashMapKeyOverRide(){
        HashMap<String, String> hashMap = new HashMap();
        hashMap.put("A","A");
        hashMap.put("B","B");
        hashMap.put("C","C");
        hashMap.put("A","D");
        System.out.println(hashMap);
    }

    public  static void linkedHashMapKeyOverRide(){
        LinkedHashMap<String, String> hashMap = new LinkedHashMap<>();
        hashMap.put("A","A");
        hashMap.put("B","B");
        hashMap.put("C","C");
        hashMap.put("A","D");
        System.out.println(hashMap);
    }
}
