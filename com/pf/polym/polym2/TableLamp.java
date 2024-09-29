package com.pf.polym.polym2;

public class TableLamp {
    public void TurnOnBulb(Bulb bulb){
        bulb.light();  // 运行看子类
    }
    public static void main(String[] args) {

        TableLamp tableLamp = new TableLamp();

        GreenBulb greenBulb = new GreenBulb();
        tableLamp.TurnOnBulb(greenBulb);  // 父类引用指向子类对象
        RedBulb redBulb = new RedBulb();  // 将子类对象赋值给父类引用
        tableLamp.TurnOnBulb(redBulb);  // 父类引用指向子类对象
    }
}
