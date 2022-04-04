package com.rzit.tricky;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * Created by Ranjith on 8/9/2017.
 */
public class BalancedOrNotDemo {
    static int[] balancedOrNot(String[] expressions, int[] maxReplacements) {
        int[] result = new int[expressions.length];
        for (int i = 0; i < expressions.length; i++) {
            Stack<Character> stack = new Stack<>();
            int replaceChoice = maxReplacements[i];
            boolean isBalanced = true;
            for (char c : expressions[i].toCharArray()) {
                if (c == '<') {
                    stack.push(c);
                } else {
                    if (stack.isEmpty()) {
                        if (replaceChoice > 0) {
                            replaceChoice--;
                        } else {
                            isBalanced = false;
                            break;
                        }
                    } else {
                        char opening = stack.peek();
                        if (opening == '<') {
                            stack.pop();
                        } else if (replaceChoice > 0) {
                            replaceChoice--;
                        }
                    }
                }
            }
            if (isBalanced && stack.isEmpty()) {
                result[i] = 1;
            }

        }
        return result;
    }

    public static void main(String[] args) {
        String[] exp = {"<>", "<>><", "<>><", "<>>>", "<>>>>"};
        int[] replacement = {1, 0, 1, 2, 2};
        for (int res : balancedOrNot(exp, replacement)) {
            System.out.println(res);
        }
    }
}
