package com.company.practice.ObjectOrientedProgramming.Recursion;

public class Recursion {

    public static void main(String[] args) {
        RecursionTest object = new RecursionTest(10);

        for (int index = 0; index < 10; index++) {
            object.values[index] = index;
        }
        object.printArray(5);
    }
}
