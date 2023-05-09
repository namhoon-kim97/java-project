package com.example.javaproject3.week4.day2;

public class PaarrallelogramShapeDrawer extends ShapeDrawer {
    @Override
    public String makeALine(int h, int i) {
        return String.format("%s%s\n", " ".repeat(i) , "*".repeat(h));
    }
}
