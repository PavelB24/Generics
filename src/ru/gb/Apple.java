package ru.gb;

public class Apple extends Fruit {
    private final float weight = 1.0f;
    String name = "Яблоко";

    @Override
    public float getWeight() {
        return weight;
    }

    public String toString() {
        return this.name;
    }
}


