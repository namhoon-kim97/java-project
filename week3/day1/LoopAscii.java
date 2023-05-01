package com.example.javaproject3.week3.day1;

public class LoopAscii {
    public static void main(String[] args) {
        /*for(char i = 'a'; i <= 'z'; i++)
            System.out.printf("%c ", i);
        */
        for(int i = 65; i <= 'Z'; i++)
            System.out.printf("%d: %c ", i, i);

       // System.out.printf("%c", 222222222);  // Error!
    }
}
