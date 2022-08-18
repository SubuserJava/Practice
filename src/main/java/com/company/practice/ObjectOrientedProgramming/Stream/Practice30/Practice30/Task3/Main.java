package com.company.practice.ObjectOrientedProgramming.Stream.Practice30.Practice30.Task3;

import java.time.Year;
import java.util.ArrayList;
import java.util.List;

public class Main {

    private static List<Car> carList = new ArrayList<>();

    public static void main(String[] args) {

        fillCarList();

        carList.stream()
                .forEach(System.out::println);
        System.out.println("-----");
        carList.stream()
                .filter(car -> car.getColor().equals("red"))
                .forEach(System.out::println);
        System.out.println("-----");
        carList.stream()
                .filter(car -> car.getEgineVolume().equals(1.6))
                .forEach(System.out::println);
        System.out.println("-----");
        carList.stream()
                .filter(car -> car.getPrice() > 320_000L)
                .forEach(System.out::println);
        System.out.println("-----");
        carList.stream()
                .filter(car -> car.getYear().isAfter(Year.parse("2012")) && car.getYear().isBefore(Year.parse("2022")))
                .forEach(System.out::println);
        System.out.println("-----");

    }

    private static void fillCarList() {
        carList.add(new Car("Ford focus", Year.parse("1999"), 200_000L, "red", 2.2));
        carList.add(new Car("Niva", Year.parse("2009"), 240_000L, "black", 1.6));
        carList.add(new Car("Opel", Year.parse("2022"), 890_000L, "white", 1.4));
        carList.add(new Car("Daewoo Matiz", Year.parse("2018"), 320_000L, "red", 1.2));
        carList.add(new Car("Ford focus", Year.parse("2012"), 540_000L, "blue", 1.6));
    }
}