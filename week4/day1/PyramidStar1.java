package com.example.javaproject3.week4.day1;

import java.util.Scanner;

public class PyramidStar1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int height = sc.nextInt();
        for(int i = 1; i <= height; i++){
            for(int j = 0; j < height - i; j++)
                System.out.printf(" ");
            for(int j = 1; j <= 2 * i - 1; j++)
                System.out.printf("*");
            System.out.printf("\n");
        }
    }
}
