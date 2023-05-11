package com.example.javaproject3.week4.day4;

import java.util.ArrayList;
import java.util.List;

public class ListGeneric {
    public static void main(String[] args) {
        List<String> strL = new ArrayList<>();
        strL.add("hello");
        strL.add("hi");

        for(String str : strL){
            System.out.println(str);
        }

    }
}