package com.example.javaproject3.week4.day4;

import java.io.*;

public class ReadFileEx {
    public static void main(String[] args) throws IOException {
        String filePath = "C:\\Users\\82102\\Desktop\\건강보험심사평가원_전국 병의원 및 약국 현황 2022.9\\1.병원정보서비스 2022.10..csv";
        FileInputStream fileInputStream = new FileInputStream(filePath);
        InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream, "MS949");
        BufferedReader br = new BufferedReader(inputStreamReader);
        System.out.println(br.readLine());
    }
}
