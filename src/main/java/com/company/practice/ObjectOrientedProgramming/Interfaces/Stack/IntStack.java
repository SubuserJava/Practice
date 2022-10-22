package com.company.practice.ObjectOrientedProgramming.Interfaces.Stack;

public interface IntStack {

    void pushToStack(int item);

    int popFromStack();

    default void clear() {
        System.out.println("Метод clear() не реализован.");
    }


}
