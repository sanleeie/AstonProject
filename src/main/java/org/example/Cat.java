package org.example;

public class Cat extends Animal{
    String name;
    static int countCat = 0;

    Cat(String name) {
        super();
        countCat++;
        this.name = name;
    }

    @Override
    public void run(int lengthObstacleRun) {
        if (lengthObstacleRun > 200) {
            System.out.println("Котик " + name + " не может пробежать больше 200м");
        } else {
            System.out.println("Котик " + name + " пробежал " + lengthObstacleRun + "м");
        }
    }

    @Override
    public void swim(int lengthObstacleSwim) {
        System.out.println("Котики не умеют плавать");
    }

    static int getCountCat() {
        return countCat;
    }
}