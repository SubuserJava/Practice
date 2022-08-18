package com.company.practice.ObjectOrientedProgramming.Overload;

public class Overload {

    public static void main(String[] args) {

        OverloadDemo object = new OverloadDemo();

        object.test();
        object.test(10, 20);
        object.test(88);
        object.test(123.2d);

    }
}

