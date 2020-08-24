package dev.scud.sorter;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class SorterTest {

    private Sorter subject;

    public SorterTest(Sorter subject){
        this.subject = subject;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> getParameters() {
        return Arrays.asList(new Object[][] {
                { new BubbleSort() }
        });
    }

    @Test
    public void sort() {
        Integer[] arr = new Integer[]{5, 200, 4, 2, 3};
        subject.sort(arr, Comparator.comparingInt((Integer a) -> a));
        assertArrayEquals(new Integer[]{2, 3, 4, 5, 200}, arr);
    }
}