package com.company.practice.ObjectOrientedProgramming.Box;

public class Box {

    double width;
    double height;
    double depth;

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
        this.width  = -1;
        this.height = -1;
        this.depth = -1;
    }

    Box (double length) {
        width =  height = depth = length;
    }

    public double volume () {
        return width * height * depth;
    }

    public void setDimension (double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

}
