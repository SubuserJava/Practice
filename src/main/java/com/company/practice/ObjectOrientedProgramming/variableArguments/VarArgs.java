package com.company.practice.ObjectOrientedProgramming.variableArguments;

public class VarArgs {

    static void variableTest(int... v) {
        System.out.print("variableTest(int... v) Number of arguments: " + v.length + ". Content: ");
        for (int i : v) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    static void variableTest(String message, int... v) {
        System.out.print(message + " number of arguments: " + v.length + ". Content: ");
        for (int i : v) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    static void variableTest(boolean... v) {
        System.out.print("Number of arguments: " + v.length + ". Content: ");
        for (boolean i : v) {
            System.out.print(i + " ");
        }
        System.out.println();
    }


    public static void main(String[] args) {
        variableTest("Test string", 10);
        variableTest(1, 2, 3, 4);
        variableTest(true, false, true);
    }
}
