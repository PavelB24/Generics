package ru.gb;

public class Main {

    public static void main(String[] args) {
        Integer[] arr1 = {1, 2, 6, 87, 42, 1, 10};
        Integer[] arr2 = {8, 96, 40, 51, 75, 4, 12};
        String[] arr3 = {"Жена", "Орк", "Флоапа"};
        String[] arr4 = {"Нос", "Эго", "Кот"};
        ArrayHandler<Integer> arrHandler = new ArrayHandler<>();
        ArrayHandler<String> arrHandler2 = new ArrayHandler<>();
        toChangeArrays(arrHandler, arr1, arr2);
        toChangeArrays(arrHandler2, arr3, arr4);
        toPrint(arrHandler);
        toPrint(arrHandler2);

        Box<Apple> appleBox = new Box<>();
        Box<Apple> appleBox2 = new Box<>();
        Box<Orange> orangeBox = new Box<>();
        toFillTheBoxWithApples(appleBox, 6);
        toFillTheBoxWithOranges(orangeBox, 6);
        System.out.println("Вес в ящиках равен?" + appleBox.toCompare(orangeBox));
        appleBox.printList();
        appleBox.giveFruitsToOtherBox(appleBox2);
        appleBox.printList();
        appleBox2.printList();
        orangeBox.printList();

    }

    private static void toFillTheBoxWithApples(Box<Apple> box, int numberOfFruits) {
        int counter = 0;
        while (!(numberOfFruits == counter)) {
            box.toFillTheBox(new Apple());
            counter++;
        }
    }

    private static void toFillTheBoxWithOranges(Box<Orange> box, int numberOfFruits) {
        int counter = 0;
        while (!(numberOfFruits == counter)) {
            box.toFillTheBox(new Orange());
            counter++;
        }
    }

    private static <T> void toPrint(ArrayHandler<T> arrHandler) {
        arrHandler.toPrintArrays();
    }


    public static <T> void toChangeArrays(ArrayHandler<T> arrHandler, T[] arr1, T[] arr2) {
        arrHandler.toCheckArraysAndExchange(arr1, arr2);
    }
}

