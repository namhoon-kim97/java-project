package com.example.javaproject3.week1.day4;

import com.example.javaproject3.week1.PrintHello;

public class VariableEx {
    public static void main(String[] args) {
        int ival;
        ival = 0;

        PrintHello printHello;
        printHello = new PrintHello();

        System.out.println(ival);
        printHello.print();
    }
}
