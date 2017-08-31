package com.rzit.EnumerationsIterator;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * Created by Ranjith on 6/22/2017.
 */
public class EnumerationsIteratorDemo {
    public static void main(String[] args) {
        System.out.println("********* EnumerationsArrayListDemo ******");
        try {
            EnumerationsArrayListDemo();
        } catch (ConcurrentModificationException e) {
            System.out.println("Expected ConcurrentModificationException :" + e.getMessage());
            e.printStackTrace();
        }
        System.out.println("*********EnumerationsCopyOnWriteArrayListDemo ******");
        EnumerationsCopyOnWriteArrayListDemo();
        System.out.println("*********IteratorDemo ******");
        try {
            IteratorDemo();
        } catch (ConcurrentModificationException e) {
            System.out.println("Expected ConcurrentModificationException :" + e.getMessage());
            e.printStackTrace();
        }
        System.out.println("******** IteratorCopyOnWriteArrayDemo *************");
        IteratorCopyOnWriteArrayDemo();
    }

    public static void EnumerationsArrayListDemo() {
        List<String> list = new ArrayList<String>();
        list.add("A");
        list.add("B");
        list.add("C");
        Enumeration<String> e = Collections.enumeration(list);
        while (e.hasMoreElements()) {
            String s = e.nextElement();
            if (s == "B") {
                list.add("D");
            }
            System.out.println(s + "\t :" + list);
        }
    }

    public static void EnumerationsCopyOnWriteArrayListDemo() {
        List<String> list = new CopyOnWriteArrayList<String>();
        list.add("A");
        list.add("B");
        list.add("C");
        Enumeration<String> e = Collections.enumeration(list);
        while (e.hasMoreElements()) {
            String s = e.nextElement();
            if (s == "B") {
                list.add("D");
            }
            System.out.println(s + "\t :" + list);
        }
    }

    public static void IteratorDemo() {
        List<String> list = new ArrayList<String>();
        list.add("A");
        list.add("B");
        list.add("C");
        Iterator<String> e = list.iterator();
        while (e.hasNext()) {
            String s = e.next();
            if (s == "B") {
                list.add("D");
            }
            System.out.println(s + "\t :" + list);
        }
    }

    public static void IteratorCopyOnWriteArrayDemo() {
        List<String> list = new CopyOnWriteArrayList<String>();
        list.add("A");
        list.add("B");
        list.add("C");
        Iterator<String> e = list.iterator();
        while (e.hasNext()) {
            String s = e.next();
            if (s == "B") {
                list.add("D");
            }
            System.out.println(s + "\t :" + list);
        }
    }
}
