package com.example.javaproject3.week4.day4;

import java.util.ArrayList;
import java.util.List;

public class ListEx {
    public static void main(String[] args) {
        List li = new ArrayList(); // ArrayList 생성
        li.add("hello"); // list에 "he
        li.add(1);

        System.out.println(li.get(0));
        System.out.println(li.get(1));
        System.out.println(li.size());
        System.out.println(li.isEmpty());

        li.remove(0);
        li.remove(0);
        System.out.println(li.isEmpty());

    }
}
