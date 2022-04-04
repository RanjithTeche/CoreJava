package com.rzit.tricky;

import java.util.Stack;

/**
 * Created by Ranjith on 7/5/2017.
 */
public class ReverseStack {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.add("one");
        stack.add("two");
        stack.add("three");
        stack.add("four");
        System.out.println(stack);
        for (int i = 0; i < stack.size(); i++) {
            System.out.println(stack.get(i));
        }
    }

}
