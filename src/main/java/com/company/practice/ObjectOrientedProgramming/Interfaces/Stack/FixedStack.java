package com.company.practice.ObjectOrientedProgramming.Interfaces.Stack;

public class FixedStack implements IntStack {

    private int[] stackArray;
    private int topOfStack;

    // Выделить память и инициализировать стэк.
    public FixedStack(int size) {
        this.stackArray = new int[size];
        this.topOfStack = -1;
    }

    @Override // Разместить элемент в стэке.
    public void pushToStack(int item) {
        if (topOfStack == stackArray.length - 1) {
            System.out.println("Стэк заполнен.");
        } else {
            stackArray[++topOfStack] = item;
        }
    }

    @Override // Извлечь элемент из стэка.
    public int popFromStack() {
        if (topOfStack < 0) {
            System.out.println("Стэк не загружен.");
            return 0;
        } else {
            return stackArray[topOfStack--];
        }
    }

    public int getLength() {
        return this.stackArray.length;
    }
}

