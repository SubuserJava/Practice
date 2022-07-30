package com.company.practice.ObjectOrientedProgramming.Box;

public class OverloadConstruct2 {

    public static void main(String[] args) {

        Box myBox1 = new Box(10, 20, 15);
        Box myBox2 = new Box();
        Box cube = new Box(7);
        Box myClone = new Box();

        double volume;
        System.out.println("Volume myBox1: " + myBox1.volume() + ".");
        System.out.println("Volume myBox1: " + myBox2.volume() + ".");
        System.out.println("Volume cube: " + cube.volume() + ".");
        System.out.println("Clone volume is: " + myClone.volume());
    }

}
