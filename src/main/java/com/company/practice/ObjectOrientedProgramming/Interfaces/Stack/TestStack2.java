package com.company.practice.ObjectOrientedProgramming.Interfaces.Stack;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

public class TestStack2 {

    public static void main(String[] args) {
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));

        DynamicStack myStack1 = new DynamicStack(5);
        DynamicStack myStack2 = new DynamicStack(8);

        for (int index = 0; index < 12; index++) {
            myStack1.pushToStack(index);
        }
        for (int index = 0; index < 20; index++) {
            myStack2.pushToStack(index);
        }

        System.out.print("Стэк в myStack1:\n");
        for (int index = 0; index < 12; index++) {
            System.out.println(myStack1.popFromStack());
        }

        System.out.printf("Стэк в myStack2, длина стэка - %s:\n", myStack2.getLength());
        for (int index = 0; index < 20; index++) {
            System.out.println(myStack2.popFromStack());
        }
    }

}
