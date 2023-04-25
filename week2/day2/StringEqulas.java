package com.example.javaproject3.week2.day2;

public class StringEqulas {
    public static void main(String[] args) {
        String str1 = "GOLD";
        String str2 = "G";

        boolean isSame = str1.substring(0,1) == str2;
        System.out.println(isSame);
        System.out.printf("%p\n", str1);
        System.out.printf("%p\n", str2);
    }
}
