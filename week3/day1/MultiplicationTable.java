package com.example.javaproject3.week3.day1;

public class MultiplicationTable {
    public static void main(String[] args) {
        for(int i = 1; i <= 9; i++){
            for(int j = 2; j <= 9; j++){
                System.out.printf("%d*%d=%2d ", j , i, i * j);
            }
            System.out.printf("\n");
        }
    }
}
