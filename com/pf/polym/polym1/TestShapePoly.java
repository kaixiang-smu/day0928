package com.pf.polym.polym1;
// 演示有多态的时候
public class TestShapePoly {

    public static void main(String[] args) {
        /**
         * 使用多态来完成输出形状周长案例
         * 多态的前提：
         * 1）继承
         * 2）重写
         * 3）父类引用指向子类对象(向上转型)
         *    或者说子类对象赋值给父类引用
         *---------------------------------
         *  向上转型后的引用，只能调用对应子类的方法和属性
         *  编译看父类，运行看子类
         *  即编写代码时，父类引用调用的方法在父类中得定义
         *  但是运行的结果，如果子类重写了，那么运行的是子类方法
         *
         */
        // Shape shape1 = new Circle();
        // Shape shape2 = new Rect();

        Circle circle = new Circle();
        circle.setR(3);
        printGirth(circle); // Shape shape = circle = new Circle();

        Rect rect = new Rect();
        rect.setL(2);
        rect.setW(3);
        printGirth(rect); // Shape shape = rect = new Rect();

        Square square = new Square();
        square.setL(2);
        printGirth(square); // Shape shape = square = new Square();

        Triangle triangle = new Triangle();
        triangle.setA(1);
        triangle.setB(1);
        triangle.setC(1);
        printGirth(triangle); // Shape shape = triangle = new Triangle();
    }

    // 定义一个方法，打印任何形状的周长
    // printGirth(Shape shape)中的(Shape shape)这个参数仔细体会
    public static void printGirth(Shape shape){
        // 运行看子类
        System.out.println("周长："+shape.girth());
    }
}
