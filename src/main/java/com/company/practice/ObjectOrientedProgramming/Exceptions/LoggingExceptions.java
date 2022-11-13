package com.company.practice.ObjectOrientedProgramming.Exceptions;

import com.company.practice.DiffTests.Main;

import java.util.logging.Level;
import java.util.logging.Logger;

public class LoggingExceptions {

    static Logger log = Logger.getLogger(Main.class.getSimpleName());

    public static void main(String[] args) {

        int a = 0;
        try {
            System.out.println(1 / a);
        } catch (ArithmeticException exception) {
            log.log(Level.ALL, String.format("Generate exceptions with parameters %s, with message %s", a, exception.getMessage()));
        }
    }
}
