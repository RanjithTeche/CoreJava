package com.rzit.hacker.strings;

import java.util.HashMap;
import java.util.Map;

public class Possible {

	// of insertions
	static int countingValleys(int n, String s) {
		char[] a = s.toCharArray();
		boolean sea = true;
		boolean valleyStart = (a[0] == 'D' ? true : false);
		int numOfValleys = 0;
		for (int i = 1; i < n; i++) {

		}
		return numOfValleys;
	}

	public static void main(String args[]) {

		System.out.println(countingValleys(8, "UDDDUDUU"));
	}
}