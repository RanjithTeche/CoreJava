package com.rzit.EnumerationsIterator;

import java.util.*;

/**
 * Created by Ranjith on 6/22/2017.
 */
public class HashMapHashtable {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("********* HashtableEnumerationDemo only fail safe  ******");
		try {
			HashtableEnumerationDemo();
		} catch (ConcurrentModificationException e) {
			System.out.println("Expected HashtableEnumerationDemo ConcurrentModificationException :" + e.getMessage());
			e.printStackTrace();
		}
       Thread.sleep(1000);
		System.out.println("********* HashtableIteratorDemo ******");
		try {
			HashtableIteratorDemo();
		} catch (ConcurrentModificationException e) {
			System.out.println("Expected HashtableIteratorDemo ConcurrentModificationException :" + e.getMessage());
			e.printStackTrace();
		}
		Thread.sleep(1000);
		System.out.println("********* HashMapEnumerationDemo ******");
		try {
			HashMapEnumerationDemo();
		} catch (ConcurrentModificationException e) {
			System.out.println("Expected HashMapEnumerationDemo ConcurrentModificationException :" + e.getMessage());
			e.printStackTrace();
		}
		Thread.sleep(1000);
		System.out.println("********* HashMapIteratorDemo ******");
		try {
			HashMapIteratorDemo();
		} catch (ConcurrentModificationException e) {
			System.out.println("Expected HashMapIteratorDemo ConcurrentModificationException :" + e.getMessage());
			e.printStackTrace();
		}

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
