package com.company.practice.ObjectOrientedProgramming.Concurrent.Example_Callable_Future;

import java.util.concurrent.Callable;

public class Factorial implements Callable<Integer> {

    int stop;

    public Factorial(int stop) {
        this.stop = stop;
    }

    @Override
    public Integer call() throws Exception {

        int factorial = 1;

        for (int index = 2; index <= stop; index++) {
             factorial *= index;

        }
        return factorial;
    }
}
