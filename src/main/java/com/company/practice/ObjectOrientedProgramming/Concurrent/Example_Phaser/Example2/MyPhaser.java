package com.company.practice.ObjectOrientedProgramming.Concurrent.Example_Phaser.Example2;

import java.util.concurrent.Phaser;

public class MyPhaser extends Phaser {

    int numberPhases;

    public MyPhaser(int parties, int numberPhases) {
        super(parties);
        this.numberPhases = numberPhases;
    }

    @Override
    protected boolean onAdvance(int phase, int registeredParties) {
        System.out.print("Фаза " + phase + " завершена.\n");
        return phase == numberPhases || registeredParties == 0;
    }
}
