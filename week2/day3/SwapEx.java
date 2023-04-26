package com.example.javaproject3.week2.day3;

import java.util.Arrays;

public class SwapEx {
    public static void main(String[] args) {
        int[] arr = {2,1,4,8,7,6};
        int temp;

        System.out.println(Arrays.toString(arr));
        temp = arr[1];
        arr[1] = arr[2];
        arr[2] = temp;
        System.out.println(Arrays.toString(arr));

    }
}
