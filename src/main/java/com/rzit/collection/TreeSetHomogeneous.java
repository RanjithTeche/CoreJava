package com.rzit.collection;

import java.util.TreeSet;

public class TreeSetHomogeneous {
	public static void main(String[] args) {
		TreeSet treeSet = new TreeSet<>();
		treeSet.add("String");
		treeSet.add(new Integer(10));
		System.out.println(treeSet);
		// O/P
		// Exception in thread "main" java.lang.ClassCastException:
		// java.base/java.lang.String cannot be cast to java.base/java.lang.Integer
	}
}
