package com.rzit.sort;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by Ranjith on 6/29/2017.
 */
public class MapValueComparatorDemo {
    public static void main(String[] args) {
        Map<String, Integer> map = new TreeMap<>();

        StringBuffer buffer = new StringBuffer();
        buffer.ensureCapacity(buffer.length());

        StringBuilder builder = new StringBuilder();
        builder.ensureCapacity(builder.length());


        map.put("A", 10);
        map.put("b", 20);
        map.put("D", 12);
        System.out.println(map);
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("A", 10);
        hashMap.put("b", 20);
        hashMap.put("D", 12);
        System.out.println("Before sort " + hashMap);
        Map<String, Integer> afterKeySort = new TreeMap<>(new MapValueComparator(hashMap));
        System.out.println("afterKeySort " + afterKeySort);
        afterKeySort.putAll(hashMap);
        System.out.println("afterKeySort after put all : " + afterKeySort);
        System.out.println("after value after: " + MapValueComparator.sortByValue(hashMap));
    }
}
