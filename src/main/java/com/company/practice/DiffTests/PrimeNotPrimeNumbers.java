package com.company.practice.DiffTests;

import java.util.Scanner;

public class PrimeNotPrimeNumbers {

    public static void main(String[] args) {

        int inputNum;
        boolean isPrime;

        System.out.println("Enter natural number (number > 1): ");
        Scanner scanner = new Scanner(System.in);
        inputNum = scanner.nextInt();

        if (inputNum < 2) {
            isPrime = false;
        } else {
            isPrime = true;
        }
        for (int i = 2; i <= inputNum / i; i++) {
            if ((inputNum % i) == 0) {
                isPrime = false;
                break;
            }
        }
            if (isPrime) {
            System.out.println(inputNum + " is prime number");
        } else {
            System.out.println(inputNum + " is composite number");
        }
    }
}
