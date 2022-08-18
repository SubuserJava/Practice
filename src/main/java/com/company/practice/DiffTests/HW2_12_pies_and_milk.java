package com.company.practice.DiffTests;

import java.util.Scanner;

public class HW2_12_pies_and_milk {

    static final double GLASS_OF_MILK = 0.2;
    static final double PACKAGE_OF_MILK = 0.9;

    public static void main(String[] args) {

        double studentCount;
        double percentsStudentsWithWeightLessMore30;

        Scanner console = new Scanner(System.in);
        System.out.println("Enter count of students");
        studentCount = console.nextDouble();
        System.out.println("Enter percent of student with mass more less 30 kg ");
        percentsStudentsWithWeightLessMore30 = console.nextDouble();

        printFinalResultPiesAndMilkPackage(studentCount, percentsStudentsWithWeightLessMore30);
    }

    private static void printFinalResultPiesAndMilkPackage(double studentCount, double percentsStudentsWithWeightLessMore30) {
        double countStudentWeightLessMore30 = Math.ceil(studentCount * percentsStudentsWithWeightLessMore30 / 100);
        double piesCount;
        double milkPackageCount;

        piesCount = studentCount + countStudentWeightLessMore30;
        System.out.println("Pies count: " + (int) piesCount);

        milkPackageCount = Math.ceil(GLASS_OF_MILK * countStudentWeightLessMore30 / PACKAGE_OF_MILK);
        System.out.println("Milk package: " + (int) milkPackageCount);
    }
}
