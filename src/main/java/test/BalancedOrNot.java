package test;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

/**
 * Created by Ranjith on 8/10/2017.
 */
public class BalancedOrNot {
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
        Scanner sc = new Scanner(System.in);
        String[] expressions = new String[sc.nextInt()];
        for (int i = 0; i < expressions.length; i++) {
            expressions[i] = sc.next();
        }
        int[] maxReplacements = new int[sc.nextInt()];
        for (int i = 0; i < maxReplacements.length; i++) {
            maxReplacements[i] = sc.nextInt();
        }
        int[] result = balancedOrNot(expressions, maxReplacements);
        System.out.println(Arrays.toString(result));

    }

}
