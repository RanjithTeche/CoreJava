package com.rzit.overload;

public class TestOverload2 {
	static void m1(int i) {
		System.out.println("int");
	}
	static void m1(double f) {
		System.out.println("double");
	}

	static void m1(float f) {
		System.out.println("float");
	}

	public static void main(String[] args) {
		//m1(null);
		m1(19.2f);
	}
}