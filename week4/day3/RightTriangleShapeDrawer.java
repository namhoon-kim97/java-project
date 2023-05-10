package com.example.javaproject3.week4.day3;

import com.example.javaproject3.week4.day2.ShapeDrawer;

public class RightTriangleShapeDrawer extends ShapeDrawer2{
    @Override
    public String makeALine(int h, int i) {
        return String.format("%s\n",  "*".repeat(i));
    }

    public static void main(String[] args) {
        ShapeDrawer2 rightTriangle = new RightTriangleShapeDrawer();
        rightTriangle.printShape(5);
    }
}
