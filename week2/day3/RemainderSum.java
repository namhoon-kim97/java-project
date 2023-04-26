package com.example.javaproject3.week2.day3;

public class RemainderSum {
    public static void main(String[] args) {
        int num = 687;
        int sum = 0;
        while(num > 0){
            sum += (num % 10);
            num /= 10;
        }
        System.out.println(sum);
    }
}
