package ru.gb;

import java.util.Arrays;

public class ArrayHandler<T> {
    T[] arr1;
    T[] arr2;


    // В задании ничего не сказано, но я решил, чтоб полностью поменять местами эл-ты массива, нужно чтоб длинна массивов была равна.
    public void toCheckArraysAndExchange(T[] arr, T[] arr2) {
        if (arr.length == arr2.length) {
            this.arr1 = arr;
            this.arr2 = arr2;
            toExchange();
        } else System.err.println("Длинна массивов не равна, заменить эллементы один на другой не получится");

    }

    public void toExchange() {
        for (int i = 0; i < arr1.length; i++) {
            T temp = arr1[i];
            arr1[i] = arr2[i];
            arr2[i] = temp;
        }
    }

    public void toPrintArrays() {
        for (T element : arr1) {
            System.out.print(element + " ");
        }
        System.out.println();
        for (T element : arr2) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public T[] getFirstArr() {
        return arr2;
    }

    public T[] getSecondArr() {
        return arr2;
    }
}
