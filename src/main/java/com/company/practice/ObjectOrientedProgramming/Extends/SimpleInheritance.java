package com.company.practice.ObjectOrientedProgramming.Extends;

public class SimpleInheritance {

    public static void main(String[] args) {

        A superObject = new A();
        B subObject = new B();

        superObject.i = 10;
        superObject.j = 20;
        System.out.print("Content of object 'superObject': ");
        superObject.showij();
        System.out.println();

        subObject.i = 7;
        subObject.j = 8;
        subObject.k = 9;
        System.out.print("Content of object 'subObject': ");
        subObject.showij();
        B.showk(subObject);
        System.out.println();

        System.out.print("Sum i, j, k, in subObject: ");
        subObject.sum();

    }
}
