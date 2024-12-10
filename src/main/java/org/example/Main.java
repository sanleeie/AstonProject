package org.example;

public class Main {
    public static void main(String[] args) {
        Cat felix = new Cat("Felix");
        Cat jinni = new Cat("Jinni");
        Cat vasya = new Cat("Vasya");
        Dog rex  = new Dog("Rex");
        Dog muha = new Dog("Muha");

        felix.run(100);
        jinni.run(600);
        vasya.swim(100);
        rex.run(500);
        muha.swim(10);

        System.out.println("Количество котиков: " + Cat.getCountCat());
        System.out.println("Количество пёсиков: " + Dog.getCountDog());
        System.out.println("Общее количество питомцев: " + Animal.getCountAnimal());
    }
}