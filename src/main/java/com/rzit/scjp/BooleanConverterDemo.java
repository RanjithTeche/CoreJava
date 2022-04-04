package com.rzit.scjp;

public final class BooleanConverterDemo {
	int a;

	public static void main(String[] args) {
		Integer i = -1;
		System.out.println(Boolean.valueOf(i.toString()));

		System.out.println(Boolean.valueOf("true"));
		System.out.println(Boolean.valueOf("tRue"));
		System.out.println(Boolean.valueOf("TRUE"));

		System.out.println(Boolean.valueOf("false"));
		System.out.println(Boolean.valueOf("fAlse"));
		System.out.println(Boolean.valueOf("FALSE"));

		Object o1 = new Object();
		Object o2 = new Object();
		System.out.println("==" + (o1 == o2));
		System.out.println("eq=" + (o1.equals(o2)));
		o1 = o2;
		System.out.println("eq1=" + (o1.equals(o2)));

		int a = 6, b = 4, c = 9;
		BooleanConverterDemo.doit(a, b, c);
		System.out.println(c);
	}

	static void doit(int a, int b, int c) {
		if (a == 5)
			c = b;
		else
			c = a;

	}

	/*
	 * int num =(int)50.05L;
	 * 
	 * byte x= (byte)50L; long y = (byte)50; byte z= (byte)50L;
	 */

	String integer = new String("cdd");
	

}