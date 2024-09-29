package com.pf.oop2;

public class TestMain {
    public static void main(String[] args) {
        Super sup = new Sub(); // 向上转型
        sup.m1();
        /**
         * 并没有执行多态
         * 静态方法没有重写的概念，也就没有多态
         * 所以方法执行还是看父类，不是子类：m1 in Super
         */
        sup.m2(); // 非静态，重写，多态，所以运行看子类
        Sub sub = (Sub) sup; // 向下转型
        // 向下转型之后就可以调用子类自己的方法了
        sub.m1();
        sub.m2();
    }
}
