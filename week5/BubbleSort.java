package com.example.javaproject3.week5;

import java.util.Arrays;

public class BubbleSort {
    public int[] sortArround(int[] arr, int until){
        for (int j = 0; j < until - 1; j++) {
            if(arr[j] > arr[j + 1]) {
                int temp;
                temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }
        return arr;
    }

    public int[] sort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            arr = sortArround(arr, arr.length - i);
        }
        return arr;
    }

    public static void main(String[] args) {
        BubbleSort bubbleSort = new BubbleSort();
        int[] arr = {7,2,3,9,28,1};
        System.out.println(Arrays.toString(bubbleSort.sort(arr)));
    }
}
