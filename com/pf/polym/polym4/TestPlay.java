package com.pf.polym.polym4;

public class TestPlay {
    public void animalPlay(Animal animal){
        animal.play();
    }

    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal[] animals = new Animal[3];
        animals[0] = new Dog();
        animals[1] = new Tiger();
        animals[2] = new Cat();

        animal.setAnimalsArr(animals);
        Animal[] animalsArr = animal.getAnimalsArr();

        TestPlay testPlay = new TestPlay();

        for (int i = 0; i < animalsArr.length; i++) {
            testPlay.animalPlay(animalsArr[i]);
        }
    }
}
