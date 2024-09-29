package com.pf.oop;

public class TestStatic {
    public static void main(String[] args) {
        // 类名直接调用静态属性
        Student.school = "华理";
        System.out.println(Student.school);

        // 类名直接调用静态方法
        Student.study();

        System.out.println("***************");

        /**
         * 每创建一个对象，每个对象都会有属于自己的属性和方法
         * 即这个属性name和age是属于对象自己，所以称为对象属性
         */
        Student s1 = new Student(24,"李冰");
        s1.school = "千峰";

        s1.study();

        System.out.println(s1.getName()+"-"+s1.getAge());
        System.out.println(s1.school);
        System.out.println("-------------");
        Student s2 = new Student(25,"孙壮壮");
        System.out.println(s2.getName()+"-"+s2.getAge());
        System.out.println(s2.school);

    }
}
