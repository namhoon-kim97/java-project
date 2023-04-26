package com.example.javaproject3.week2.day3;

import java.util.Arrays;

public class ReferenceTypeVariable {
    public static void main(String[] args) {
        //Student student = new Student();
        Student[] students = new Student[2];
        students[0] = new Student();
        students[0].name = "김남훈";
        students[0].age  = 0;
        students[0].phoneNumber = "010-1234-4567";

        students[1] = new Student();
        students[1].name = "김철수";
        students[1].age  = 10;
        students[1].phoneNumber = "010-2222-4567";

        System.out.println(Arrays.toString(students));




    }
}
