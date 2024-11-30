package org.example;

public class Main {
    public static void main(String[] args) {
        Park park = new Park("Парк");
        Park.Attraction attr1 = park.new Attraction("Колесо", "09:00 - 18:00", 100);
        Park.Attraction attr2 = park.new Attraction("Горки", "09:00 - 18:00", 300);
    }
}