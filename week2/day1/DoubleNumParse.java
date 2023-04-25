package com.example.javaproject3.week2.day1;

public class DoubleNumParse {
    public static void main(String[] args) {
        String val1 = "2.123456789";
        String val2 = "1.1";

        double result = Double.parseDouble(val1) + Double.parseDouble(val2);
        double result2 = Double.parseDouble(val1) + Float.parseFloat(val2);
        System.out.println(result);
        System.out.println(result2);

    }
}
