package com.company.practice.ObjectOrientedProgramming.Concurrent.Example_Exchanger;

import java.util.concurrent.Exchanger;

class MakeString implements Runnable {

    Exchanger<String> ex;
    String str;

    public MakeString(Exchanger<String> c) {
        this.ex = c;
        str = new String();
    }

    @Override
    public void run() {
        char ch = 'A';

        for (int index = 0; index < 3; index++) {
            for (int j = 0; j < 5; j++) {
                str += (char) ch++;
            }
            try {
                str = ex.exchange(str);
            } catch (InterruptedException exception) {
                exception.printStackTrace();
            }
        }
    }
}
