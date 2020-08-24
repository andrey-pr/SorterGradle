import java.util.Comparator;

public interface Sorter {
    static <T> void sort(T[] a, Comparator<T> c){}
}
