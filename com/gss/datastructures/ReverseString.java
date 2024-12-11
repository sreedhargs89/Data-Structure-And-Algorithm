package com.gss.datastructures;

import java.util.Stack;

public class ReverseString {

    public static String reverseString(String input){
        String output = "";
        Stack<Character> inputStack = new Stack<>();
        char[] characters =  input.toCharArray();
        for (int i = 0; i < characters.length ; i++) {
            inputStack.push(characters[i]);
        }

        while (!inputStack.isEmpty()){
            output = output+inputStack.pop();
        }
        return output;
    }

    public static String removeStars(String s) {
    public static void main(String[] args) {
        String input = "abcdefghijklmnopqrstuvxyz";
        String output = reverseString(input);
        System.out.println("Reversed String =" + output );
    }
}
