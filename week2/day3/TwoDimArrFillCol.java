package com.example.javaproject3.week2.day3;

import java.util.Arrays;

public class TwoDimArrFillCol {

    public static void printArray(int[][] arr){
        System.out.println(Arrays.toString(arr[0]));
        System.out.println(Arrays.toString(arr[1]));
        System.out.println(Arrays.toString(arr[2]));
        System.out.println(Arrays.toString(arr[3]));
        System.out.println(Arrays.toString(arr[4]));
        System.out.println("----------");
    }

    public static void main(String[] args) {
        int[][]arr = new int[5][5];
        printArray(arr);

        arr[0][2] = 1;
        arr[1][2] = 1;
        arr[2][2] = 1;
        arr[3][2] = 1;
        arr[4][2] = 1;
        printArray(arr);


    }
}
