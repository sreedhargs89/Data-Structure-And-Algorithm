package com.gss.datastructures;

import java.util.Stack;

public class ReverseString {

    public static String reverseString(String input){
    
        // Just adding a comment for testing 

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
        if(!s.contains("*"))
            return s;
        String noStarString = "" ;

        Stack<Character> inputStack = new Stack<>();
        Stack<Character> outputStack = new Stack<>();
        char[] characters =  s.toCharArray();
        for (int i = 0; i < characters.length ; i++) {
            if(characters[i] == '*'){
                inputStack.pop();
            }else
                inputStack.push(characters[i]);
        }

        while (!inputStack.isEmpty()){
            outputStack.push(inputStack.pop());
        }

        while (!outputStack.isEmpty()){
            noStarString= noStarString+ outputStack.pop();
        }
        return noStarString;

    }

    



    public static void main(String[] args) {
        String input = "abcdefghijklmnopqrstuvxyz";
        String output = reverseString(input);
        System.out.println("Reversed String =" + output );


        String starInput = "lee*cod*e";
        System.out.println(removeStars(starInput));
    }
}
