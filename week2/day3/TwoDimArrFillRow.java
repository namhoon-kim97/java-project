package com.example.javaproject3.week2.day3;

import java.util.Arrays;

public class TwoDimArrFillRow {
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

        arr[2][0] = 1;
        arr[2][1] = 1;
        arr[2][2] = 1;
        arr[2][3] = 1;
        arr[2][4] = 1;
        printArray(arr);

    }
}
