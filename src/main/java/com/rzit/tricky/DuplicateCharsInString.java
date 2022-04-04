package com.rzit.tricky;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by Ranjith on 7/3/2017.
 */
public class DuplicateCharsInString {

    public static void main(String[] args) {
        Map<Character, Integer> duplicateCounterMap = charCount("ababacfdg");
        for (Map.Entry<Character, Integer> entry : duplicateCounterMap.entrySet()) {
            System.out.println(entry.getKey() + "\t :" + entry.getValue());
        }
        System.out.println(firstNonRepeatedCharacter("ababacfdg"));
    }

   static Character firstNonRepeatedCharacter(String s) {
        Map<Character, Integer> duplicateCounterMap = charCount(s);
        Character nonRepaetChar= null;
        for (Map.Entry<Character, Integer> entry : duplicateCounterMap.entrySet()) {
              if(entry.getValue() == 1 ){
                  nonRepaetChar = entry.getKey();
                  break;
            }

        }
        return nonRepaetChar;
    }

    static Map<Character, Integer> charCount(String s) {
        Map<Character, Integer> duplicateCounterMap = new LinkedHashMap<>();
        char[] charArray = s.toCharArray();
        for (char c : charArray) {
            if (!duplicateCounterMap.containsKey(c)) {
                duplicateCounterMap.put(c, 0);
            }
            duplicateCounterMap.put(c, duplicateCounterMap.get(c) + 1);
        }
        return duplicateCounterMap;
    }
}
