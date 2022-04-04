package com.rzit.collectionViews;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by Ranjith on 6/21/2017.
 */
public class MapViews {
    public static void main(String[] args) {
        keySetView();
       // valuesCollectionView();
       // setMappingsView();

    }

    public static void keySetView() {
        Map<String, String> map = new HashMap<String, String>();
        for (int i = 1; i < 5; i++) {
            map.put("Key_" + i, "Value_" + i);
        }
        /*Returns a Set view of the keys contained in this map*/
        Set<String> keySetView = map.keySet();
        System.out.println("keySetView :" + keySetView + "\t map:" + map);

        /*add a key in map*/
        map.put("Key_5", "Value_5");
        System.out.println("After map add a key keys :" + keySetView + "\t map:" + map);
        /*add a key in keySetView , add and adAll not support , But remove support*/

        keySetView.remove("Key_5");
        System.out.println("After  remove a key keys :" + keySetView + "\t map:" + map);

        keySetView.add("Key_6");
        System.out.println("After map add a key keys :" + keySetView + "\t map:" + map);

    }


    public static void valuesCollectionView() {
        Map<String, String> map = new HashMap<String, String>();
        for (int i = 1; i < 5; i++) {
            map.put("Key_" + i, "Value_" + i);
        }
       /*Returns a Collection view of the values contained in this map.*/
        Collection<String> valuesCollectionView = map.values();
        System.out.println("valuesCollectionView :" + valuesCollectionView + "\t map:" + map);

        /*add a key , value in map*/
        map.put("Key_5", "Value_5");
        System.out.println("After map add a key,value valuesCollectionView :" + valuesCollectionView + "\t map:" + map);
        /*add a key in keySetView , add and adAll not support , But remove support*/

        valuesCollectionView.remove("Value_5");
        System.out.println("After  remove a value  valuesCollectionView :" + valuesCollectionView + "\t map:" + map);

        valuesCollectionView.add("Key_6");
        System.out.println("After  add a value valuesCollectionView :" + valuesCollectionView + "\t map:" + map);
    }

    public static void setMappingsView() {
        Map<String, String> map = new HashMap<String, String>();
        for (int i = 1; i < 5; i++) {
            map.put("Key_" + i, "Value_" + i);
        }
       /*Returns a Set view of the mappings contained in this map.*/
        Set<Map.Entry<String, String>> setMappingsView = map.entrySet();
        System.out.println("setMappingsView :" + setMappingsView + "\t map:" + map);

        /*add a key , value in map*/
        map.put("Key_5", "Value_5");
        System.out.println("After map add a key,value setMappingsView :" + setMappingsView + "\t map:" + map);
        /*add a key in keySetView , add and adAll not support , But remove support*/
        Map.Entry<String, String> entry = new Map.Entry<String, String>() {
            public String getKey() {
                return "Key_5";
            }

            public String getValue() {
                return "Value_5";
            }

            public String setValue(String value) {
                return "Value_5";
            }

            public boolean equals(Object o) {
                return true;
            }

            public int hashCode() {
                return "Key_5".hashCode();
            }
        };
        setMappingsView.remove(entry);
        System.out.println("After  remove a value  setMappingsView :" + setMappingsView + "\t map:" + map);

        setMappingsView.add(entry);
        System.out.println("After  add a value setMappingsView :" + setMappingsView + "\t map:" + map);
    }
}
