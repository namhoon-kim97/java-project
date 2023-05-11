package com.example.javaproject3.week4.day4;

public class UserTest {
    public static void main(String[] args) {
        User user1 = new User();
        user1.setName("김미미");
        user1.setAge(16);

        User user2 = new User();
        user2.setName("김철수");
        user2.setAge(24);

        System.out.println(user1.getName());
        System.out.println(user1.getAge());
        System.out.println(user2.getName());
        System.out.println(user2.getAge());
        System.out.printf("%s는 어른인지? %b\n", user1.getName(), user1.isAdult());
        System.out.printf("%s는 어른인지? %b\n", user2.getName(), user2.isAdult());
    }
}
