package com.example.javaproject3.week4.day1;

public class Factors {
    int sumOfFactors(int num){
        int sum = 0;
        for(int i = 1; i <= num; i++){
            if(num % i == 0)
                sum += i;
        }
        return sum;
    }

    void printResult(int num){
        System.out.printf("%d의 약수의 합은 %d입니다.\n", num, sumOfFactors(num));
    }

    public static void main(String[] args) {
        Factors factors = new Factors();
        factors.printResult(12);
        factors.printResult(24);
        factors.printResult(9);
        factors.printResult(8);

    }
}
