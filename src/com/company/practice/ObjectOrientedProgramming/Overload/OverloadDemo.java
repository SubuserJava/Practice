package com.company.practice.ObjectOrientedProgramming.Overload;

public class OverloadDemo {

    void test () {
        System.out.println("No parameters.");
    }

    void test (int a, int b) {
        System.out.println("a and b: " + a + " , " + b);
    }

    void test (double a) {
        System.out.println("Conversion on method call test(double) a: " + a);
    }

}
