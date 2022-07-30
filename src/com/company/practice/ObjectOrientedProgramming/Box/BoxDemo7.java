package com.company.practice.ObjectOrientedProgramming.Box;

public class BoxDemo7 {

    public static void main(String[] args) {

        Box myBox1 = new Box(10, 20, 15);
        Box myBox2 = new Box(3, 6, 9);

        double volume = myBox1.volume();
        System.out.println("Volume first parallelepiped is " + volume + ".");
        volume = myBox2.volume();
        System.out.println("Volume second parallelepiped is " + volume + ".");
    }


}
