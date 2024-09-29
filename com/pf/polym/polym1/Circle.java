package com.pf.polym.polym1;

public class Circle extends Shape{
    private double r;

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    @Override
    public double area() {
        return 3.14*r*r;
    }

    @Override
    public double girth() {
        return 2*3.14*r;
    }
}
