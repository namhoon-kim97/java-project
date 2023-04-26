package com.example.javaproject3.week2.day3;

import java.util.Arrays;

public class TwoDimArrFillRowMethod {
    public static void printArray(int[][] arr){
        System.out.println(Arrays.toString(arr[0]));
        System.out.println(Arrays.toString(arr[1]));
        System.out.println(Arrays.toString(arr[2]));
        System.out.println(Arrays.toString(arr[3]));
        System.out.println(Arrays.toString(arr[4]));
        System.out.println("----------");
    }
    public static void fillRow(int rowIndex, int[][] arr){
        for(int i = 0; i < 5; i++){
            arr[rowIndex][i] = 1;
        }
    }

    public static void main(String[] args) {
        int[][]arr = new int[5][5];
        printArray(arr);

        fillRow(3, arr);
        printArray(arr);
    }
}
