package com.company.practice.DiffTests;

public class ExtractFromArrayString {

    public static void main(String[] args) {

        int[] arrayA = {1, 2, 3};
        int[] arrayB = {4, 5, 6};
        int[] arrayC = {7, 8, 9};

        int[] arrayTotal = new int[arrayA.length + arrayB.length + arrayC.length];

        String[] namesArray = {"a   ,rayA", "arrayB", "arrayC"};

        System.out.println(namesArray[0].replaceAll("\\,*\\s*", ""));

        System.out.println(arrayA.getClass());
        System.out.println(namesArray.getClass());

    }
}


