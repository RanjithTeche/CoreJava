package com.moini;

public class TetsMain {
	public static void main(String[] args) {
		ABC a = new ABC();
		System.out.println("a" + a.sizeofABC());
		//100
		ABC p = new ABC(10);
		System.out.println("p" + p.sizeofABC());
		//10

	}
}
