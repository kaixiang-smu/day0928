package com.pf.polym.polym1;

public class Triangle extends Shape {

    private int a;
    private int b;
    private int c;

    public int getA() {
        return a;
    }
    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }
    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }
    public void setC(int c) {
        this.c = c;
    }

    @Override
    public double girth() {
        return (a+b+c);
    }
}
