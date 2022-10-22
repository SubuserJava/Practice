package com.company.practice.ObjectOrientedProgramming.Interfaces.RandomAsk;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

public class AskMe implements SharedConstants {
    public static void main(String[] args) {
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));

        Question question = new Question();
        answer(question.ask());
        answer(question.ask());
        answer(question.ask());
        answer(question.ask());
        answer(question.ask());
        answer(question.ask());

    }

    public static void answer(int result) {
        switch (result) {
            case NO -> System.out.println("Нет");
            case YES -> System.out.println("Да");
            case MAYBE -> System.out.println("Возможно");
            case LATER -> System.out.println("Позднее");
            case SOON -> System.out.println("Вскоре");
            case NEVER -> System.out.println("Никогда");
        }
    }
}
