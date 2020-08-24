package dev.scud.sorter;

import java.util.Comparator;

public class BubbleSort implements Sorter{

    @Override
    public <T> void sort(T[] arr, Comparator<T> c) {
        for(int i = 0; i < arr.length-1; i++)
            for(int a = 0; a < arr.length-1-i; a++)
                if(c.compare(arr[a], arr[a+1]) > 0)
                {
                    T buff = arr[a];
                    arr[a] = arr[a+1];
                    arr[a+1] = buff;
                }
    }
}
