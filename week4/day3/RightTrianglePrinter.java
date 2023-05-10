package com.example.javaproject3.week4.day3;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class RightTrianglePrinter {

    private Printer printer = new ConsolePrinter();

    public RightTrianglePrinter(Printer printer){
        this.printer = printer;
    }
    public String makeALine(int h, int i){
        return String.format("%s%s\n", "","*".repeat(i));
    }
    public void printShape(int h) throws IOException {
        String[] lines = new String[h];
        for (int i = 0; i < h; i++) {
            lines[i] = makeALine(h,i + 1);
        }
        printer.print(lines);
    }

    public static void main(String[] args) throws IOException {
        RightTrianglePrinter rp = new RightTrianglePrinter(new ConsolePrinter());
        rp.printShape(5);
    }
}
