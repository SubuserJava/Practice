package com.company.practice.DiffTests;

public class SortigStringArray_compareTo_method1 {

    static String[] stringArray = {"2", "1", "one", "two", "Three", "for", "five", "sixth", "seven", "eight", "3", "nine", "Ten",};

    public static void main(String[] args) {

        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < stringArray.length - 1; i++) {
                if (stringArray[i].compareToIgnoreCase(stringArray[i + 1]) > 0) {
                    isSorted = false;
                    String buf = stringArray[i + 1];
                    stringArray[i + 1] = stringArray[i];
                    stringArray [i] = buf;
                }
            }
        }
        for (String a : stringArray) {
            System.out.println(a);
        }

    }
}
