package com.pf.polym.polym3;

public class Vet {
    public void cure(Animal animal){
        animal.health();
    }

    public static void main(String[] args) {
        // 一定是对象调用方法
        // 对象是变量，变量名首字母小写，大写的是类名
        // 谁的方法，就需要谁的对象调用
        Vet vet = new Vet();

        Tiger tiger = new Tiger();
        vet.cure(tiger);

        Cat cat = new Cat();
        vet.cure(cat);

        Dog dog = new Dog();
        vet.cure(dog);
    }
}
