package com.company.practice.ObjectOrientedProgramming.Interfaces.RandomAsk;

import java.util.Random;

public class Question implements SharedConstants{

    public int ask() {
        Random random = new Random();
        int prob = (int) (100 * random.nextDouble());
        return prob < 30 ? NO : prob < 60 ? YES : prob < 75 ? LATER : prob < 98 ? SOON : NEVER;
    }
}
