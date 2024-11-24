package com.gss.datastructures;

import java.util.Stack;

public class StackExample {

    public static void main(String[] args) {
        System.out.println("Hello, World, Stack!");

        String str = new String();
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        System.out.println(stack);
        // last added item first out now
        stack.pop();
        System.out.println(stack);


    }
}
