package com.example.javaproject3.week5.day1;

import java.util.Arrays;
import java.util.Comparator;

public class BubbleSort2 {
    Comparator<Integer> comparator;
    public BubbleSort2(Comparator<Integer> comparator){
        this.comparator = comparator;
    }

    public int[] sort(int[] arr, int marker) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (marker == 0 ? (comparator.compare(arr[i], arr[j]) > 0) : (comparator.compare(arr[i], arr[j]) < 0)) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {7,2,3,9,28,1};
        BubbleSort2 bubbleSort2 = new BubbleSort2(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });
        bubbleSort2.sort(arr,1);
        System.out.println(Arrays.toString(arr));
    }
}
