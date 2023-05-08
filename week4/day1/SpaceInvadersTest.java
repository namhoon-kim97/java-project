package com.example.javaproject3.week4.day1;

public class SpaceInvadersTest {
    public static void main(String[] args) {
        SpaceInvaders si = new SpaceInvaders();
        si.location = 10;
        si.moveLeft();
        si.moveLeft();
        si.moveLeft();
        System.out.println(si.location);
        si.moveRight();
        si.moveRight();
        System.out.println(si.location);

    }
}
