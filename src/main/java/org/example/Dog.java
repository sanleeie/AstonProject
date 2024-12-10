package org.example;

public class Dog extends Animal{
    String name;
    static int countDog = 0;

    Dog(String name) {
        super();
        countDog++;
        this.name = name;
    }

    @Override
    public void run(int lengthObstacleRun) {
        if (lengthObstacleRun > 500) {
            System.out.println("Пёсик " + name + " не может пробежать больше 500м");
        } else {
            System.out.println("Пёсик " + name + " пробежал " + lengthObstacleRun + "м");
        }
    }

    @Override
    public void swim(int lengthObstacleSwim) {
        if (lengthObstacleSwim > 10) {
            System.out.println("Пёсик " + name + " не может проплыть больше 10м");
        } else {
            System.out.println("Пёсик " + name + " проплыл " + lengthObstacleSwim + "м");
        }
    }

    static int getCountDog() {
        return countDog;
    }
}