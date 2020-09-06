package dev.scud.sorter;

import java.util.Comparator;

public class InsertionSort implements Sorter {
    @Override
    public <T> void sort(T[] arr, Comparator<T> c) {
        for (int i = 1; i < arr.length; i++) {
            for (int a = i; a > 0; a--) {
                if (c.compare(arr[a], arr[a - 1]) < 0) {
                    T buff = arr[a];
                    arr[a] = arr[a - 1];
                    arr[a - 1] = buff;
                }
            }
        }
    }
}
