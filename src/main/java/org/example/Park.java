package org.example;

public class Park {
    String name;
    public Park(String name){
        this.name = name;
    }


    public class Attraction {
       String name;
       String time;
       int cost;

       public Attraction(String name, String time, int cost) {
           this.name = name;
           this.time = time;
           this.cost = cost;
       }
    }
}
