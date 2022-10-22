package com.company.practice.ObjectOrientedProgramming.Interfaces.Stack;

public class DynamicStack implements IntStack {
    private int[] stackArray;
    private int topOfStack;

    // Выделить память и инициализировать стэк.
    public DynamicStack(int size) {
        this.stackArray = new int[size];
        this.topOfStack = -1;
    }

    // Разместить элемент в стэке.
    @Override
    public void pushToStack(int item) {
        if (topOfStack == stackArray.length - 1) {
            int[] temp = new int[stackArray.length * 2];
            for (int index = 0; index < stackArray.length; index++) {
                temp[index] = stackArray[index];
            }
            stackArray = temp;
            stackArray[++topOfStack] = item;
        } else {
            stackArray[++topOfStack] = item;
        }
    }

    // Извлечь элемент из стэка.
    @Override
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
