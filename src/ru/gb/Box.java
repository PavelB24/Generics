package ru.gb;

import java.util.ArrayList;
import java.util.List;

public class Box<T extends Fruit> {
    private final List<T> fruitBox = new ArrayList<>();

    public void toFillTheBox(T fruit) {
        fruitBox.add(fruit);
    }

    public float getWeight() {
        float weightInBox = 0;
        for (T fruit : fruitBox) {
            weightInBox += fruit.getWeight();
        }
        return weightInBox;
    }

    public void giveFruitsToOtherBox(Box<T> box) {
        for (T fruit : fruitBox) {
            box.toFillTheBox(fruit);
        }
        fruitBox.clear();
    }

    public boolean toCompare(Box<? extends Fruit> box) {
        return this.getWeight() == box.getWeight();
    }

    public void printList() {
        System.out.println("В этом ящике" + fruitBox);
    }
}
