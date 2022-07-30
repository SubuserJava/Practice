package com.company.practice.ObjectOrientedProgramming.LambdaExpressions.Homework.Task4;

public class Conditions {

    static boolean isEven(int num) {
        return num % 2 == 0;
    }

    static boolean isNotEven(int num) {
        return num % 2 != 0;
    }

    static boolean isInRange(int num, int startRange, int finishRange) {
        return num > startRange && num < finishRange;
    }

    static boolean isMultiply(int num, int delimiter) {
        return num % delimiter == 0;
    }
}
