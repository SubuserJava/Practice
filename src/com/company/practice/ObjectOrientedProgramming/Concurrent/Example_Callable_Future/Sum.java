package com.company.practice.ObjectOrientedProgramming.Concurrent.Example_Callable_Future;

import java.util.concurrent.Callable;

public class Sum implements Callable<Integer> {

    int stop;

    public Sum(int stop) {
        this.stop = stop;
    }

    @Override
    public Integer call() throws Exception {

        int sum = 0;
        for (int index = 0; index < stop; index++) {
             sum += index;

        }
        return sum;
    }
}
