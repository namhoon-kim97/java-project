package com.example.javaproject3.week2.day2;

public class StringFormatting {
    public static void main(String[] args) {
        String name = "김남훈";
        int balance = 1000;
        String result = String.format("%s님의 잔고는 %d입니다.", name, balance);
        System.out.println(result);
    }
}
