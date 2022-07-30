package com.company.practice.ObjectOrientedProgramming.Test;

public class AccessTest {

    public static void main(String[] args) {

        Test object = new Test();

        object.a = 10;
        object.b = 20;

        // object.c = 100;

        object.setC(100);
        System.out.println("a - " + object.a + ", b - " + object.b + ", c - " + object.getC());
    }
}
