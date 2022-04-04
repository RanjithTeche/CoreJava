package com.rzit.collection;

import java.util.TreeSet;

public class TreeSetComparable {
	public static void main(String[] args) {
		TreeSet treeSet = new TreeSet<>();
		treeSet.add(new StringBuffer("StringBuffer is not impl Comparable "));
		System.out.println(treeSet);
		// O/P
		// Exception in thread "main" java.lang.ClassCastException:
		// java.base/java.lang.StringBuffer cannot be cast to
		// java.base/java.lang.Comparable
	}
}
