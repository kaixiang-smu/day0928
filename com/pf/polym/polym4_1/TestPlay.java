package com.pf.polym.polym4_1;

public class TestPlay {
//    public void animalPlay(Animal animal){
//        animal.play();
//    }

    public static void main(String[] args) {
        // 数组只能存储同一种类型的数据
        Animal[] animals = new Animal[3];

        //Animal[]本来是装三个动物，这里装了三个子类
        //因为三个子类继承了父类动物Animal
        //animals[0] = new Animal(); // 难理解
        animals[0] = new Tiger(); // 因为继承了
        animals[1] = new Dog(); // 这就是向上转型！！！
        animals[2] = new Cat(); // 这一步没有想到！！！
        /**
         * 因为这些Tiger，Dog，Cat继承了Animal
         * 所以就满足了“is a”的关系
         * 即Tiger，Dog，Cat是Animal类类型
         * 那就满足数组的要求，存储同一类型数据
         */
        /**
         * 晚饭归来我又想了想，继承，重写很好满足，既然是多态
         * 不使用再写一个方法
         * public void animalPlay(Animal animal){
         *         animal.play();
         *     }那么
         * 子类对象赋值给父类引用体现在什么地方呢？
         * 感觉是少了：Animal animal = new Tiger()
         *           Animal animal = new Dog()
         *           Animal animal = new Cat()
         * 前面几个题目都是这么去写的
         * 那么这个题目就是在给数组元素赋值的时候：子类对象赋值给父类引用的
         *         animals[0] = new Tiger();
         *         animals[1] = new Dog();
         *         animals[2] = new Cat();
         * 取出的animals[i]就是是Animal类类型，就是动物对象，就是父类对象
         * 就完成了子类对象赋值给父类引用的
         * 这就是向上转型啦
         * 所以无需再写上面那个方法去传参animalPlay(Animal animal)
         * 所以直接animals[i].play();
         */

        // 取出，需要什么来接受呢？
        // animals[0]是什么呢？不管是什么，一定是动物Animal对象
        // 取出，需要使用父类来接受，用Animal来接收
        // 是什么类型的数组，就装什么类型的数据
        // Animal animal = animals[0];


        //TestPlay testPlay = new TestPlay();  无需
        for (int i = 0; i < animals.length; i++) {
            //testPlay.animalPlay(animals[i]);  无需

            // 编译看父类，取出的是Animal对象
            animals[i].play();  // 直接animals[i].play();
            // 运行看子类
        }
    }
}
