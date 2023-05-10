package com.example.javaproject3.week4.day3;

import com.example.javaproject3.week4.day2.ShapeDrawer;

public class DrawDiamond extends ShapeDrawer {
    public String getRepeatedSymbol(String symbol, int n){
        return symbol.repeat(n);
    }
    @Override
    public String makeALine(int h, int i){
        int pivot = h / 2;

        if(i <= pivot){
            return String.format("%s%s\n", getRepeatedSymbol(" ", pivot - i), getRepeatedSymbol("*", 2 * i + 1));
        } else {
            return String.format("%s%s\n", getRepeatedSymbol(" ", i - pivot), getRepeatedSymbol("*", 2 *(h - i) - 1));
        }
    }

    public static void main(String[] args) {
        ShapeDrawer sd = new DrawDiamond();
        int h = 5;
        sd.printShape(h);

    }
}
