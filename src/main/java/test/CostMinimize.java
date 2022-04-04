package test;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by Ranjith on 8/10/2017.
 */
public class CostMinimize {
	static int winner(int n, int m, String s) {
		HashMap<Character, Integer> charCountMap = new HashMap<Character, Integer>();

		HashMap<Character, Integer> sorted = new HashMap<Character, Integer>();

		// Converting given string to char array

		char[] strArray = s.toCharArray();

		// checking each char of strArray
		for (char c : strArray) {
			if (charCountMap.containsKey(c)) {

				// If char is present in charCountMap,
				// incrementing it's count by 1
				charCountMap.put(c, charCountMap.get(c) + 1);
			} else {

				// If char is not present in charCountMap,
				// putting this char to charCountMap with 1 as it's value
				charCountMap.put(c, 1);
			}
		}
		int result = 0;
		sorted = charCountMap.entrySet().stream().sorted(Map.Entry.comparingByValue())
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e2, LinkedHashMap::new));

		return result;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int firstGamer = sc.nextInt();
		int[] firstGamerPoints = new int[firstGamer];
		for (int i = 0; i < firstGamer; i++) {
			firstGamerPoints[i] = sc.nextInt();
		}
		int secondGamer = sc.nextInt();
		int[] secondGamerPoints = new int[secondGamer];
		for (int i = 0; i < firstGamer; i++) {
			secondGamerPoints[i] = sc.nextInt();
		}
		String gameType = sc.next();
		String winer = winner(firstGamerPoints, secondGamerPoints, gameType);
		System.out.println(winer);
	}
}
