package com.rzit.sort;

import java.util.*;

/**
 * Created by Ranjith on 6/29/2017.
 */
public class MapValueComparator implements Comparator<String> {
    private Map<String, Integer> map;

    /**
     * Constructor for setting map
     *
     * @param map the map
     */
    public MapValueComparator(Map<String, Integer> map) {
        this.map = map;
    }

    /**
     * Method to compare the  values based on Total
     */
    @Override
    public int compare(String key1, String key2) {
        int value = map.get(key2).compareTo(map.get(key1));
        return (value == 0 ? key1.compareTo(key2) : value);
    }

    public static Map sortByValue(Map<String, Integer> map) {
        long startTime = System.currentTimeMillis();
        List list = new LinkedList(map.entrySet());
        Collections.sort(list, new Comparator() {
            public int compare(Object o1, Object o2) {
                return ((Comparable) ((Map.Entry) (o1)).getValue())
                        .compareTo(((Map.Entry) (o2)).getValue());
            }
        });
        Map result = new LinkedHashMap();
        for (Iterator it = list.iterator(); it.hasNext(); ) {
            Map.Entry entry = (Map.Entry) it.next();
            result.put(entry.getKey(), entry.getValue());
        }
        return result;
    }
}