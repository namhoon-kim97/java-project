package com.example.javaproject3.week1.day5;

public class UserTest {
    public static void main(String[] args) {
        User user = new User();
        user.name = "김남훈";
        user.phoneNumber = "010-1234-5678";
        user.age = 17;

        User kyeongrok = new User();
        kyeongrok.name = "김경록";
        kyeongrok.phoneNumber = "010-0000-1234";
        kyeongrok.age = 37;

        System.out.printf("%s님은 성인입니까? %s\n", user.name, user.isAdult());
        System.out.printf("%s님은 성인입니까? %s\n", kyeongrok.name, kyeongrok.isAdult());

    }
}
