package com.company.practice.ObjectOrientedProgramming.ComplexNumbers;


public class Complex {

    private double re, im; // Действительная и мнимая часть

    // Четыре конструктора
    Complex(double re, double im) {
        this.re = re;
        this.im = im;
    }

    Complex(double re) {
        this(re, 0.0);
    }

    Complex() {
        this(0.0, 0.0);
    }

    Complex(Complex z) {
        this(z.re, z.im);
    }

    // Методы доступа
    public double getRe() {
        return re;
    }

    public double getIm() {
        return im;
    }

    public Complex getZ() {
        return new Complex(re, im);
    }

    public void setRe(double re) {
        this.re = re;
    }

    public void setIm(double im) {
        this.im = im;
    }

    public void setZ(Complex z) {
        re = z.re;
        im = z.im;
    }

    // Модуль и аргумент комплексного числа
    public double mod() {
        return Math.sqrt(re * re + im * im);
    }

    public double arg() {
        return Math.atan2(re, im);
    }

    // Вывод на экран
    public void pr() {
        System.out.println(re + (im < 0.0 ? "" : "+") + im + "i");
    }

    @Override
    public String toString() {
        return "Complex: " + re + " " + im;
    }

    // Методы, реализующие операции +=, -=, *=, /=
    public void add(Complex z) {
        re += z.re;
        im += z.im;
    }

    public void sub(Complex z) {
        re -= z.re;
        im -= z.im;
    }

    public void mul(Complex z) {
        double t = re * z.re - im * z.im;
        im = re * z.im + im * z.re;
        re = t;
    }

    public void div(Complex z) {
        double m = z.mod();
        double t = re * z.re - im * z.im;
        im = (im * z.re - re * z.im) / m;
        re = t / m;
    }

    // Методы, реализующие операции +, -, *, /
    public Complex plus(Complex z) {
        return new Complex(re + z.re, im + z.im);
    }

    public Complex minus(Complex z) {
        return new Complex(re - z.re, im - z.im);
    }

    public Complex asterisk(Complex z) {
        return new Complex(re * z.re - im * z.im, re * z.im + im * z.re);
    }

    public Complex slash(Complex z) {
        double m = z.mod();
        return new Complex((re * z.re - im * z.im) / m, (im * z.re - re * z.im) / m);
    }
}

