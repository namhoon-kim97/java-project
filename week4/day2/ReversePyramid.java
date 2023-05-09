package com.example.javaproject3.week4.day2;

public class ReversePyramid {
    private String spaceChar = "0";
    public ReversePyramid(String spaceChar){
        this.spaceChar = spaceChar;
    }
    public String makeALine(int h , int i){
        return String.format("%s%s\n", spaceChar.repeat(h - i) , "*".repeat( (i * 2) - 1));
    }
    public static void main(String[] args) {
        ReversePyramid reversePyramid = new ReversePyramid(" ");
        int h = 5;
        for(int i = h; i > 0; i--){
            System.out.print(reversePyramid.makeALine(h, i));
        }
    }
}
