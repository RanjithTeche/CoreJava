package com.rzit.iterator;

import java.util.*;

/**
 * Created by Ranjith on 6/22/2017.
 */
public class IteratorDemo {
    public static void main(String[] args) {
        iteratorRemove();
        listIteratorAdd();
    }



    public static void iteratorRemove() {
        Set<String> set = new HashSet<String>();
        set.add("A");
        set.add("B");
        set.add("C");
        set.add("D");

        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            String c = iterator.next();
            if (c == "C") {
                System.out.println("Removed the C");
                iterator.remove();
            }
            System.out.println(c + "\t size:" + set.size() +"\t set :"+set);
        }
    }

    public static void listIteratorAdd() {
        List<String> list = new ArrayList<String>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");

        ListIterator<String> iterator = list.listIterator();
        while (iterator.hasNext()) {
            String c = iterator.next();
            if (c == "C") {
                System.out.println("Removed the C");
                iterator.remove();
            }
            if (c == "A") {
                System.out.println("Addd the X");
                iterator.add("X");
            }
            System.out.println(c + "\t size:" + list.size() +"\t list:"+list);
        }
    }


}
