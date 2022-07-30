package com.company.practice.ObjectOrientedProgramming.Collections.Examples;

import java.util.TreeSet;

public class Comparator {

    public static void main(String[] args) {

        TreeSet<TreeSetExampleAnother> treeSet = new TreeSet<>((o1, o2) -> Long.compare(o1.getId(), o2.getId()));
    }
}
