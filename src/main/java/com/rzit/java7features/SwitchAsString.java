package com.rzit.java7features;

public class SwitchAsString {

	public static void main(String[] args) {
		String color = "Red";

		if (color.equals("Red")) {
			System.out.println("Stop");
		} else if (color.equals("Yellow")) {
			System.out.println("Ready to go");
		} else {
			System.out.println("Go");
		}

		switch (color)

		{
		case "Red":
			System.out.println("Case1: Value is: ");
		case "Yellow":
			System.out.println("Case2: Value is: " );
		case "Green":
			System.out.println("Case3: Value is: ");
		default:
			System.out.println("Default: Value is: ");
		}
	}
}
