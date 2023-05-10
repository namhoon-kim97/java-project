package com.example.javaproject3.week4.day3;

import java.io.IOException;

public class ConsolePrinter2 implements Printer2{
    @Override
    public void print(String message) throws IOException {
        System.out.println(message);
    }
}
