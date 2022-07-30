package com.company.practice.ObjectOrientedProgramming.Stack;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

public class TestStack {

    public static void main(String[] args) {
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));

        FixedStack myStack1 = new FixedStack(5);
        FixedStack myStack2 = new FixedStack(8);

        for (int i = 0; i < myStack1.getLength(); i++) {
            myStack1.pushToStack(i);
        }

        for (int i = 0; i < myStack2.getLength(); i++) {
            myStack2.pushToStack(i);
        }
            System.out.print("Стэк в myStack1: " );
            for (int i = 0; i < myStack1.getLength(); i++) {
                System.out.print(myStack1.popFromStack() + " ");
            }

        }

    }


