package org.example;

public class Bowl {
    private int food;

    public Bowl(int food) {
        this.food = food;
    }

    public int getFood() {
        return food;
    }

    public void eatFoodFromBowl(int food) {
        if (this.food >= food) {
            this.food -= food;
        }
    }

    public void addFoodInBowl(int food) {
        this.food += food;
    }
}
