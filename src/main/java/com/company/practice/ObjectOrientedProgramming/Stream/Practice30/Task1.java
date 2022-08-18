package com.company.practice.ObjectOrientedProgramming.Stream.Practice30;

import java.util.Random;
import java.util.stream.IntStream;

public class Task1 {

    public static void main(String[] args) {

        Random random = new Random();

        long count = IntStream.generate(() -> random.nextInt(101))
                .limit(1000)
                .filter(number -> number % 2 == 0)
                .count();
        System.out.println(count);

        long count1 = IntStream.generate(() -> random.nextInt(101))
                .limit(1000)
                .filter(number -> number % 2 != 0)
                .count();
        System.out.println(count1);

        long count2 = IntStream.generate(() -> random.nextInt(101))
                .limit(1000)
                .filter(number -> number == 0)
                .count();
        System.out.println(count2);
    }
}
