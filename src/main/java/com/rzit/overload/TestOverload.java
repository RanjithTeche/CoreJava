package com.rzit.overload;

public class TestOverload {
	static void m1(Object o) {
		System.out.println("Object");
	}

	static void m1(String s) {
		System.out.println("String");
	}

	static void m1(int i) {
		System.out.println("int");
	}

	public static void main(String[] args) {
		m1(null);
	}
}