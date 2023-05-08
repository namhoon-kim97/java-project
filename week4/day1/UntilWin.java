package com.example.javaproject3.week4.day1;

import java.util.Random;
import java.util.Scanner;

public class UntilWin {
    public static String play(int user, int computer){
        if(user == 0 && computer == 1){
            return "win";
        } else if(user == 1 && computer == 2){
            return "win";
        } else if(user == 2 && computer == 0){
            return "win";
        } else if(user == computer){
            return "tie";
        } else {
            return "lose";
        }
    }
    public static int switchToNum(String num){
        if(num == "바위")
            return 0;
        else if(num == "가위")
            return 1;
        else
            return 2;
    }

    public static String switchToString(int num){
        if(num == 0)
            return "바위";
        else if(num == 1)
            return "가위";
        else
            return "보";
    }

    public static void main(String[] args) {
        // 0바위 1가위 2보
        Scanner sc = new Scanner(System.in);
        String user = sc.nextLine();
        int userRPS = switchToNum(user);
        Random random = new Random();
        int computer = random.nextInt(2);
        while (play(userRPS, computer) != "win") {
            System.out.printf("못이겼음 user:%s computer:%s\n", user, switchToString(computer));
            user = sc.nextLine();
            userRPS = switchToNum(user);
            computer = random.nextInt(2);
        }
        System.out.printf("이김 user:%s computer:%s\n", user, switchToString(computer));
    }
}
