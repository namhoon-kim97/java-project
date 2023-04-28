package com.example.javaproject3.week2.day5;

public class GetGrade {
    public static void main(String[] args) {
        int score = 75;

        if (score >= 90) { // false
            System.out.println("A");
        } else if (score >= 80) { // false
            System.out.println("B");
        } else if (score >= 70) { // true
            System.out.println("C");
        } else {
            System.out.println("F");
        }

        //가장 큰 수를 앞에 배치해야 함.
        if (score >= 75) { // false
            System.out.println("C");
        } else if (score >= 80) { // false
            System.out.println("B");
        } else if (score >= 95) { // true
            System.out.println("A");
        } else {
            System.out.println("F");
        }
    }
}