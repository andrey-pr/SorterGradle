package dev.scud.sorter;

import java.util.Comparator;

public interface Sorter {
    <T> void sort(T[] a, Comparator<T> c);
}
