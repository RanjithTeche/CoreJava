package com.rzit.map;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Ranjith on 6/22/2017.
 */
public class MapDemo {
    public static void main(String[] args) {
        //keyWithOutHashDemo();
        // keyWithHashDemo();
        //keyStringDemo();
        mapKeyWithHashCodeWithOutEquals();
       // mapKeyWithOutHashCodeWithEquals();
    }

    public static void mapKeyWithHashCodeWithOutEquals() {
        Map<MapKeyWithHashCodeWithOutEquals, Integer> map = new HashMap();
        MapKeyWithHashCodeWithOutEquals m1 = new MapKeyWithHashCodeWithOutEquals("First");
        MapKeyWithHashCodeWithOutEquals m2 = new MapKeyWithHashCodeWithOutEquals("First");
        map.put(m1, 1);
        map.put(m2, 2);
        System.out.println(map.size());
        System.out.println(map.get(m1));
        System.out.println(map.get(m2));
        MapKeyWithHashCodeWithOutEquals m3 = new MapKeyWithHashCodeWithOutEquals("First");
        System.out.println(map.get(m3));
        System.out.println(m3.hashCode() + "\t : M1 hashcode :" + m1.hashCode() + "\t but :m1 and m3" + m1.equals(m3));
    }

    public static void mapKeyWithOutHashCodeWithEquals() {
        Map<MapKeyWithOutHashCodeWithEquals, Integer> map = new HashMap();
        MapKeyWithOutHashCodeWithEquals m1 = new MapKeyWithOutHashCodeWithEquals("First");
        MapKeyWithOutHashCodeWithEquals m2 = new MapKeyWithOutHashCodeWithEquals("First");
        map.put(m1, 1);
        map.put(m2, 2);
        System.out.println(map.size());
        System.out.println(map.get(m1));
        System.out.println(map.get(m2));
        MapKeyWithOutHashCodeWithEquals m3 = new MapKeyWithOutHashCodeWithEquals("First");
        System.out.println(map.get(m3));
        System.out.println(m3.hashCode() + "\t : M1 hashcode :" + m1.hashCode() + "\t but :m1 and m3" + m1.equals(m3));
    }

    public static void keyWithOutHashDemo() {
        Map<MapKey, String> myHashMap = new HashMap<MapKey, String>();
        //MyKey name argument passed is used for equals() and hashCode()
        MapKey key = new MapKey("Pankaj"); //assume hashCode=1234
        System.out.println("key hash:" + key.hashCode());
        myHashMap.put(key, "Value");

        // Below code will change the key hashCode() and equals()
        // but it's location is not changed.
        key.setName("Amit"); //assume new hashCode=7890

        //below will return null, because HashMap will try to look for key
        //in the same index as it was stored but since key is mutated,
        //there will be no match and it will return null.

        String val = myHashMap.get(new MapKey("Pankaj"));
        String val1 = myHashMap.get(new MapKey("Amit"));
        String val2 = myHashMap.get(key);
        System.out.println("Val:" + val);
        System.out.println("Val1:" + val1);
        System.out.println("val2:" + val2);
    }


    public static void keyWithHashDemo() {
        Map<HashKey, String> myHashMap = new HashMap<HashKey, String>();
        //MyKey name argument passed is used for equals() and hashCode()
        HashKey key = new HashKey("Pankaj"); //assume hashCode=1234
        System.out.println("key hash:" + key.hashCode());
        myHashMap.put(key, "Value");

        // Below code will change the key hashCode() and equals()
        // but it's location is not changed.
        key.setName("Amit"); //assume new hashCode=7890

        //below will return null, because HashMap will try to look for key
        //in the same index as it was stored but since key is mutated,
        //there will be no match and it will return null.

        String val1 = myHashMap.get(new HashKey("Pankaj"));
        String val2 = myHashMap.get(new HashKey("Amit"));
        String val3 = myHashMap.get(key);
        System.out.println("Val1:" + val1);
        System.out.println("Val2:" + val2);
        System.out.println("val3:" + val3);
    }

    public static void keyStringDemo() {
        Map<String, String> myHashMap = new HashMap<String, String>();
        String key = "Pankaj"; //assume hashCode=1234
        myHashMap.put(key, "Value");

        // Below code will change the key hashCode() and equals()
        // but it's location is not changed.
        key = key + "Extra"; //assume new hashCode=7890

        //below will return null, because HashMap will try to look for key
        //in the same index as it was stored but since key is mutated,
        //there will be no match and it will return null.

        String val = myHashMap.get("Pankaj");
        String val1 = myHashMap.get("PankajExtra");
        String val2 = myHashMap.get(key);
        System.out.println("Val:" + val);
        System.out.println("Val1:" + val1);
        System.out.println("val2:" + val2);
    }
}
