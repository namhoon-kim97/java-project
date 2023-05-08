package com.example.javaproject3.week4.day1;


class UserTest {
    public static void main(String[] args) {
        User user1 = new User();
        user1.name = "김미미";
        user1.age = 16;
        User user2 = new User();
        user2.name = "김철수";
        user2.age = 26;
        System.out.printf("%s는 어른인가요?: %b\n", user1.name, user1.isAdult());
        System.out.printf("%s는 어른인가요?: %b", user2.name, user2.isAdult());
    }

}