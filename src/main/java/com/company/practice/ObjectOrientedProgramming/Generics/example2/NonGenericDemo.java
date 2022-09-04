package com.company.practice.ObjectOrientedProgramming.Generics.example2;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

public class NonGenericDemo {

    public static void main(String[] args) {
System.setOut(new PrintStream(System.out,true, StandardCharsets.UTF_8));
        NonGenerics iObject = new NonGenerics(88);
        iObject.showType();

        int v = (Integer) iObject.getObject();
        System.out.println("Значение: " + v);
        System.out.println();

        NonGenerics nonGenerics = new NonGenerics("Текст без generics");
        nonGenerics.showType();

        String string = (String) nonGenerics.getObject();
        System.out.println("Значение: " + string);
        iObject = nonGenerics;
        iObject.showType();
//        v = (Integer) iObject.getObject();
    }
}
