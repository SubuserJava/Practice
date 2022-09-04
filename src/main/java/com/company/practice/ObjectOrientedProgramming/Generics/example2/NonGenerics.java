package com.company.practice.ObjectOrientedProgramming.Generics.example2;

public class NonGenerics {

    Object object;

    public NonGenerics(Object object) {
        this.object = object;
    }

    public Object getObject() {
        return object;
    }

    public void showType() {
        System.out.println("Объект object относится к типу " + object.getClass().getName());
    }
}
