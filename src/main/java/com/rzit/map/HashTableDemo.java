package com.rzit.map;

import java.util.HashMap;
import java.util.Hashtable;

public class HashTableDemo {
	public static void main(String[] args) {
		//insertNullsToHashTable();
		insertNullsToHashMap();
	}
	
	private static void insertNullsToHashMap() {
		HashMap<String, String> hastMap = new HashMap<>();
		//hastMap one null key and  any number of null values also
		hastMap.put("Value as null", null);
		hastMap.put(null,null);
		hastMap.put(null,"Key as null");
		System.out.println(hastMap);
	}
	
	private static void insertNullsToHashTable() {
		Hashtable<String, String> hastTable = new Hashtable<>();
		//Hastable dosen't allow the null keys and null values also
		hastTable.put("Value as null", null);
		hastTable.put(null,"Key as null");
		hastTable.put(null,null);
		System.out.println(hastTable);
	}
}
