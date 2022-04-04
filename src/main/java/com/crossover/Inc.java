package com.crossover;

public class Inc {
	public static void main(String[] args) {
		int[] i = { 1 };
		Inc in = new Inc();
		System.out.println(i);
		in.increamnet(i);
		System.out.println(i[i.length - 1]);
	}

	void increamnet(int[] i) {
		System.out.println(i);
	int x =	i[i.length - 1]++;
	System.out.println("before x:"+x);
	System.out.println("after x:"+(x++));
		i[i.length - 1]++;
	}
}
