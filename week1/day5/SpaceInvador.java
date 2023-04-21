package com.example.javaproject3.week1.day5;

public class SpaceInvador {
    private int location = 0;
    private void moveLeft(){
        location -= 1;
        System.out.printf("Move left: %d\n", location);
    }
    private void moveRight(){
        location += 1;
        System.out.printf("Move right: %d\n", location);
    }

    public static void main(String[] args) {
        SpaceInvador si = new SpaceInvador();
        si.moveLeft();
        si.moveRight();
        si.moveRight();
        si.moveRight();
        si.moveRight();
        si.moveRight();

    }
}
