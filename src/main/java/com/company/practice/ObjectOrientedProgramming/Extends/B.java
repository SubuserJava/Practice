package com.company.practice.ObjectOrientedProgramming.Extends;

public class B extends A {

    int k;

    static void showk(B b) {
        System.out.print("k: " + b.k);
    }

    void sum() {
        System.out.print("i + j + k: " + (i + j + k));
    }
}
