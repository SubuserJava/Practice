package com.company.practice.ObjectOrientedProgramming.Generics.example1;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

public class GenericsDemo {

    public static void main(String[] args) {
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));

        Gen<Integer> iObject = new Gen<>(88);
        iObject.showType();

        int v = iObject.getObject();
        System.out.println("Значение: " + v);
        System.out.println();

        Gen<String> stringObject = new Gen<>("Текст generics");
        stringObject.showType();

        String str = stringObject.getObject();
        System.out.println("Значение: " + str);

    }
}
