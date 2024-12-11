package org.example;

public class Main {
    public static void main(String[] args) {

        Cat felix = new Cat("Felix");
        Cat jinni = new Cat("Jinni");
        Cat vasya = new Cat("Vasya");
        Dog rex = new Dog("Rex");
        Dog muha = new Dog("Muha");

        felix.run(100);
        jinni.run(600);
        vasya.swim(100);
        rex.run(500);
        muha.swim(10);

        System.out.println("Количество котиков: " + Cat.getCountCat());
        System.out.println("Количество пёсиков: " + Dog.getCountDog());
        System.out.println("Общее количество питомцев: " + Animal.getCountAnimal());

        Cat[] cats = {
                new Cat("Феликс"),
                new Cat("Джини"),
                new Cat("Вася"),
                new Cat("Маруся")
        };

        Bowl bowl = new Bowl(33);

        for (Cat cat : cats) {
            cat.eat(bowl);
        }

        System.out.println("В миске осталось: " + bowl.getFood() + " еды.");
        System.out.println("Сытость котиков:");
        for (Cat cat : cats) {
            System.out.println(cat.name + ": " + (cat.isSatiety() ? "голодный" : "сытый"));
        }
        bowl.addFoodInBowl(15);
        System.out.println("Добавили 15 единиц еды. Теперь в миске: " + bowl.getFood());
    }
}