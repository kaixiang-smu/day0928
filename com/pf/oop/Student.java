package com.pf.oop;

public class Student {
    private int age;
    private String name;
    /**
     * school就变成了类属性，就被该类的所有对象共享
     * 内存中就只有这一个静态的属性和方法被共享
     */
    static String school;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public Student() {
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void study(){
        System.out.println("学生学习");
    }
}
