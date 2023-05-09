package com.example.javaproject3.week4.day2;

public class StaticMethod {
    public static int height = 4;

    public static String makeLine(int h, int i){
        return String.format("%s%s\n", "0".repeat(i), "*".repeat(h-i));
    }

    public static void main(String[] args) {
        for(int i = 0; i < height; i++){
            System.out.print(makeLine(height,i));
        }
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Math.max(1,2));
    }
}
