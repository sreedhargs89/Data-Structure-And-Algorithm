package com.gss.datastructures;

import java.util.ArrayList;
import java.util.Stack;

public class MultiStack {
    /**
     *     Problem statement - Stack array with specified capacity
     *     If capacity increases - Add element to new stack
     *     Pop from right most - non empty stack
     *     push to leftmost non empty stack
     *     Capacity --> 2
     *     push 1  [1]
     *     push 5  [1,5]
     *     push 10 [1,5][10]
     *     push 20 [[1,5] [10,20]]
     *     pop()  [[1,5] [10]]
     *     pop(0) [1] [10]
     */

    int capacity = 0;
    ArrayList<Stack<Integer>> stackList = new ArrayList<>();


     MultiStack(int capacity){
         this.capacity = capacity;
    }
    //default constructor
    MultiStack(){
    }

    public void display(){
        System.out.println(stackList);
    }


    public void push(int value){
        // add new value to the stack ?? if stack size is more than capacity create new stack and add the value
        // [[3]]

        if(stackList.size() == 0){
            Stack<Integer> tempStack = new Stack<>();
            tempStack.push(value);
            stackList.add(tempStack);
            return;
        }else {
            for(Stack stack: stackList){
                if(stack.size() < capacity){
                    stack.push(value);
                    return;
                }
            }
            Stack<Integer> tempStack = new Stack<>();
            tempStack.push(value);
            stackList.add(tempStack);
            return;
        }
    }

    public void pop(){
         // pop from last stack in the arraylist
        if(!stackList.get(stackList.size()-1).empty())
            stackList.get(stackList.size()-1).pop();
        else{
            stackList.remove(stackList.size()-1);
            stackList.get(stackList.size()-1).pop();
        }

    }

    public void pop(int index){
         // pop from the given index
        if(!stackList.get(index).empty())
            stackList.get(index).pop();
        else{
            stackList.remove(stackList.get(index));
            stackList.get(index).pop();
        }
    }

    public static void main(String[] args) {
        MultiStack multi = new MultiStack(4);
        for (int i = 0; i < 30; i++) {
            multi.push(i);
        }
        multi.display();

        multi.pop();
        multi.pop();
        multi.pop();
        multi.pop();
        multi.pop(2);
        multi.push(1000);

        multi.display();



    }
}
