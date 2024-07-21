package com.datastructures;

import java.util.Stack;

public class TheStacks {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>(); //Also could be 'List<Integer> stack = new Stack<>();'. Then we will call 'stack.add(...)' method, ect.
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        System.out.println(stack.peek());
        System.out.println(stack.size());
        System.out.println(stack.pop());
        System.out.println(stack.size());

        System.out.println();

        System.out.println(stack.isEmpty());
    }
}