package com.pf.polym.polym1;
// 演示没有多态的时候
public class TestShape {
    public static void main(String[] args) {

        // 设计一个方法，该方法输出圆形周长
        Circle circle = new Circle();
        circle.setR(3);
        printGirthCircle(circle);
        // 设计一个方法，该方法输出矩形周长
        Rect rect = new Rect();
        rect.setL(10);
        rect.setW(5);
        printGirthRect(rect);
        /**
         * 。。。。。。
         * 如果还有其他形状需要打印周长，那就得再创建很多方法
         * 代码扩展性很不好!
         * 那么如果有一个方法可以输出任何一个形状的周长那就非常好!
         * 这就是多态！
         */
    }

    // 方法的参数列表是类，传的是该类的对象
    public static void printGirthCircle(Circle circle){
        System.out.println("圆形的周长是："+circle.girth());
    }

    public static void printGirthRect(Rect rect){
        System.out.println("矩形的周长是："+rect.girth());
    }
}
