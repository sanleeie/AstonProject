package org.example;

public class Animal {
        static int countAnimal = 0;
        Animal() {
            countAnimal++;
        }

        public void run(int lengthObstacleRun) {
            System.out.println("пробежал "+ lengthObstacleRun + "м");
        }

        public void swim(int lengthObstacleSwim) {
            System.out.println("проплыл "+lengthObstacleSwim+"м");
        }

        public static int getCountAnimal() {
            return countAnimal;
        }
    }