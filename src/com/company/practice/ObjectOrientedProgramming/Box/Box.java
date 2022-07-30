package com.company.practice.ObjectOrientedProgramming.Box;

public class Box {

    private double width;
    private double height;
    private double depth;

    Box (Box ob) {
        width  = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    Box (double w, double h, double d) {
        System.out.println("Object 'Box' construction.");
        width = w;
        height = h;
        depth = d;
    }

    Box () {
        width  = -1;
        height = -1;
        depth = -1;
    }

    Box (double length) {
        width =  height = depth = length;
    }

    public double volume () {
        return width * height * depth;
    }

//    public void setDimension (double w, double h, double d) {
//        width = w;
//        height = h;
//        depth = d;
//    }

}
