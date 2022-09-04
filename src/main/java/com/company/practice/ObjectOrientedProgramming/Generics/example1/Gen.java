package com.company.practice.ObjectOrientedProgramming.Generics.example1;

public class Gen<T> {

    T object;

    public Gen(T object) {
        this.object = object;
    }

    public T getObject() {
        return object;
    }

    public void showType() {
        System.out.println("Типом Т является: " + object.getClass().getName());;
    }
}
