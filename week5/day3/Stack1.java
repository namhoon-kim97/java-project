package com.example.javaproject3.week5.day3;

import java.util.EmptyStackException;

public class Stack1 {
    int[] arr = new int[10001];
    int pointer = 0;

    public void push(int value){
        this.arr[pointer++] = value;
    }

    public int pop(){
        if(isEmpty()) throw new EmptyStackException();
        return this.arr[--pointer];
    }

    public boolean isEmpty(){
        return pointer == 0;
    }

    public int peek(){
        return this.arr[pointer - 1];
    }

    public static void main(String[] args) {
        Stack1 stack1 = new Stack1();
        stack1.push(10);
        stack1.push(20);
        stack1.push(30);
        System.out.println(stack1.peek());
        System.out.println(stack1.isEmpty());
        System.out.println(stack1.pop());
    }
}
