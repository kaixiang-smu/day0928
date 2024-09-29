package com.pf.polym.polym1;

public class Square extends Rect{
    @Override
    public double area() {
        return getL()*getL();
    }

    @Override
    public double girth() {
        return getL()*4;
    }
}
