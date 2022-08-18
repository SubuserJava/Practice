package com.company.practice.ObjectOrientedProgramming.Stream.Practice30;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class Task2 {

    private static List<String> towns= new ArrayList<>();

    public static void main(String[] args) {
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));
        fillTowns();

        towns.stream().forEach(System.out::println);
        System.out.println("------------");
        towns.stream()
                .filter(towns -> towns.length() >6)
                .forEach(System.out::println);
        System.out.println("------------");
        long moscow = towns.stream()
                .filter(towns -> towns.equals("Москва"))
                .count();
        System.out.println(moscow);
        System.out.println("------------");
        towns.stream()
                .filter(towns -> towns.startsWith("М"))
                .forEach(System.out::println);

    }

    private static void fillTowns() {
        towns.add("Москва");
        towns.add("Севастополь");
        towns.add("Краснодар");
        towns.add("Москва");
        towns.add("Мурманск");
        towns.add("Ковров");
        towns.add("Москва");
    }
}
