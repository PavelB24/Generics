package ru.gb;

public class Orange extends Fruit{
    private final float weight=1.5f;
    String name = "Апельсин";

    @Override
    public float getWeight() {
        return weight;
    }

    public String toString() {
        return this.name;
    }
}
