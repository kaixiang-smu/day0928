package com.pf.polym.polym4_1;
/**
 * 定义动物父类,子类狗,猫等
 * 动物类有方法play,子类重写方法,以展现不同的动物玩耍方法
 * 定义一个动物数组,存储多种动物,比如狗虎猫
 * Animal[] animal = new Animal[3];
 * animal[0]= new Dog();
 * animal[1]= new Tiger();
 * animal[2]= new Cat()
 * 然后遍历数组,执行每种动物玩耍方法
 */
public class Animal {

    public void play(){
        System.out.println("动物玩耍");
    }
}
