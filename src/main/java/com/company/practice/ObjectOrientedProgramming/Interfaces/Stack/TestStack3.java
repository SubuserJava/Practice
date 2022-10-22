package com.company.practice.ObjectOrientedProgramming.Interfaces.Stack;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

public class TestStack3 {

    public static void main(String[] args) {
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));

        IntStack myStack;
        DynamicStack dynamicStack = new DynamicStack(5);
        FixedStack fixedStack = new FixedStack(8);

        myStack = dynamicStack;
        for (int index = 0; index < 12; index++) {
            myStack.pushToStack(index);
        }
        myStack = fixedStack;
        for (int index = 0; index < 8; index++) {
            myStack.pushToStack(index);
        }

        System.out.println(myStack.getClass());
        myStack = dynamicStack;
        System.out.println("Значение в динамическом стэке:");
        for (int index = 0; index < 12; index++) {
            System.out.println(myStack.popFromStack());
        }

        System.out.println(myStack.getClass());
        myStack = fixedStack;
        System.out.println(" Значения в фиксированном стэке:");
        for (int index = 0; index < 8; index++) {
            System.out.println(myStack.popFromStack());
        }
    }
}
