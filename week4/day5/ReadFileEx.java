package com.example.javaproject3.week4.day5;

import com.example.javaproject3.week4.day4.Address;
import com.example.javaproject3.week4.day4.Hospital;

import java.io.*;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ReadFileEx {
    Charset charset;
    public ReadFileEx(Charset charset) {
        this.charset = charset;
    }

    public List<String> getLines(String fileName) throws IOException {
        List<String> lines = new LinkedList<>();

        FileInputStream fileInputStream = new FileInputStream(fileName);
        InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream, charset);
        BufferedReader br = new BufferedReader(inputStreamReader);
        String line;
        while((line = br.readLine()) != null){
            lines.add(line);
        }
        return lines;
    }

    public Hospital parse(String str){
        String[] splitted = str.split(",");
        Address address = new Address(splitted[10],splitted[5],splitted[7]);
        Hospital hospital = new Hospital(splitted[1], splitted[11], address);
        return hospital;
    }

    public List<Hospital> getHospitals(List<String> lines){
        List<Hospital> hospitals = new ArrayList<>();
        for(String str : lines){
            hospitals.add(parse(str));
        }
        return hospitals;
    }

    public static void main(String[] args) throws IOException {
        ReadFileEx rfe = new ReadFileEx(Charset.forName("UTF-8"));
        List<String> getHospitalLines = rfe.getLines("./hopital_info_10lines.csv");
        List<Hospital> hospitals = rfe.getHospitals(getHospitalLines);
        for (int i = 0; i < hospitals.size(); i++) {
            System.out.printf("%s %s\n",hospitals.get(i).getName(), hospitals.get(i).getWebsiteAddress());
        }
    }
}
