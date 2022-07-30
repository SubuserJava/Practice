package com.company.practice.DiffTests;

import java.io.IOException;

public class cycleForExample {

    public static void main(String[] args) throws IOException {

        char enterChoice;
        do {
            System.out.println("Manual for operator:");
            System.out.println("    1. if");
            System.out.println("    2. switch");
            System.out.println("    3. while");
            System.out.println("    4. do-while");
            System.out.println("    5. for\n" +
                    "Choice need number:");
            enterChoice = (char) System.in.read();
        } while (enterChoice < '1' || enterChoice > '5');

        System.out.println("\n");

        switch (enterChoice) {
            case '1':
                System.out.println("'If' operator syntax:");
                System.out.println("if (condition) sequence statements {;");
                System.out.println("} else {sequence statements or empty}");
                break;
            case '2':
                System.out.println("'Switch' operator syntax:");
                System.out.println("switch (expression) {");
                System.out.println("case (constant):");
                System.out.println("sequence statements;");
                System.out.println("break;");
                System.out.println("default: } ");
                break;
            case '3':
                System.out.println("'while' operator syntax");
                System.out.println("while (condition) {");
                System.out.println("sequence statements; }");
                break;
            case '4':
                System.out.println("'do-while' operator syntax");
                System.out.println("do {");
                System.out.println("sequence statements;");
                System.out.println("} while (condition);");
                break;
            case '5':
                System.out.println("'for' operator syntax");
                System.out.println("for (initialization; condition; iteration) {");
                System.out.println("sequence statements; }");
                break;
        }
    }
}
