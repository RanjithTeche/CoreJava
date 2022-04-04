package com.moini;

public class ABC {
	
	private int size;

	public ABC() {
		System.out.println("in default consturctor so  sizing default");
		this.size = 100;
	}

	public ABC(int a) {
		System.out.println("in parameterized intilizing class varibale with " + a);
		this.size = a;
	}
	
	public int sizeofABC() {
		return this.size;
	}

}
