package com.rzit.EnumerationsIterator;

import java.util.*;

/**
 * Created by Ranjith on 6/22/2017.
 */
public class HashMapHashtable {
    public static void main(String[] args) {
        HashtableEnumerationDemo();
        //HashtableIteratorDemo();
       // HashMapIteratorDemo();
       // HashMapEnumerationDemo();
    }

    public static void HashMapIteratorDemo() {
        HashMap<String, String> hashMap = new HashMap<String, String>();
        hashMap.put("A", "A");
        hashMap.put("B", "B");
        hashMap.put("C", "C");
        Iterator<String> e = hashMap.keySet().iterator();
        while (e.hasNext()) {
            String s = e.next();
            hashMap.put("D", "D");
            System.out.println(s + "\t :" + hashMap);
        }
    }

    public static void HashMapEnumerationDemo() {
        HashMap<String, String> hashMap = new HashMap<String, String>();
        hashMap.put("A", "A");
        hashMap.put("B", "B");
        hashMap.put("C", "C");
        Enumeration<String> e = Collections.enumeration(hashMap.keySet());
        while (e.hasMoreElements()) {
            String s = e.nextElement();
            hashMap.put("D", "D");
            System.out.println(s + "\t :" + hashMap);
        }
    }

    public static void HashtableEnumerationDemo() {
        Hashtable<String, String> hashtable = new Hashtable<String, String>();
        hashtable.put("A", "A");
        hashtable.put("B", "B");
        hashtable.put("C", "C");
        Enumeration<String> e = hashtable.keys();
        while (e.hasMoreElements()) {
            String s = e.nextElement();
            hashtable.put("D", "D");
            System.out.println(s + "\t :" + hashtable);
        }
    }

    public static void HashtableIteratorDemo() {
        Hashtable<String, String> hashtable = new Hashtable<String, String>();
        hashtable.put("A", "A");
        hashtable.put("B", "B");
        hashtable.put("C", "C");
        Iterator<String> e = hashtable.keySet().iterator();
        while (e.hasNext()) {
            String s = e.next();
            hashtable.put("D", "D");
            System.out.println(s + "\t :" + hashtable);
        }
    }

}
