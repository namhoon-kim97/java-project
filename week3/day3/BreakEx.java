package com.example.javaproject3.week3.day3;

public class BreakEx {
    public static void main(String[] args) {
        int num = 991;
        boolean isPrime = true;
        for(int i = 2; i * i <= num; i++){
            if(num % i == 0){
                isPrime = false;
                break;
            }
        }
        System.out.println(isPrime);
    }
}
