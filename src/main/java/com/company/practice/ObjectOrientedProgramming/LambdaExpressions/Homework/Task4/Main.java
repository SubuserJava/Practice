package com.company.practice.ObjectOrientedProgramming.LambdaExpressions.Homework.Task4;

import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {

        int startRange = -4;
        int finishRange = 5;
        int[] numberArray = {-20, -5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5, 10};
        Predicate<Integer> predicate1 = num -> (num % 2) == 0;
        Predicate<Integer> predicate2 = num -> (num % 2) != 0;
        Predicate<Integer> predicate3 = num -> num > startRange && num < finishRange;
        Predicate<Integer> predicate4 = num -> num % startRange == 0;

        System.out.println("Result of standard method: " + sum(numberArray, Conditions::isEven));
        System.out.println("Result of predicate method: " + sumPredicate(numberArray, predicate1));
        System.out.println("----");
        System.out.println("Result of standard method: " + sum(numberArray, Conditions::isNotEven));
        System.out.println("Result of predicate method: " + sumPredicate(numberArray, predicate2));
        System.out.println("----");
        System.out.println("Result of standard method: " + sum(numberArray, num -> Conditions.isInRange(num, startRange, finishRange)));
        System.out.println("Result of predicate method: " + sumPredicate(numberArray, predicate3));
        System.out.println("----");
        System.out.println("Result of standard method: " + sum(numberArray, num -> Conditions.isMultiply(num, startRange)));
        System.out.println("Result of predicate method: " + sumPredicate(numberArray, predicate4));
    }

    private static int sum(int[] numbersArray, Expression function) {
        int result = 0;
        for (int currentsValue : numbersArray) {
            if (function.isEqual(currentsValue)) {
                result += currentsValue;
            }
        }
        return result;
    }

    private static int sumPredicate(int[] numbersArray, Predicate<Integer> predicate) {
        int result = 0;
        for (int currentsValue : numbersArray) {
            if (predicate.test(currentsValue)) {
                result += currentsValue;
            }
        }
        return result;
    }
}
