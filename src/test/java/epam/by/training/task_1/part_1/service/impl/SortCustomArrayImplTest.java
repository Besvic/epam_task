package epam.by.training.task_1.part_1.service.impl;

import epam.by.training.task_1.array.CustomArray;
import epam.by.training.task_1.service.impl.SortCustomArrayImpl;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class SortCustomArrayImplTest {

    private int[] demoArray = new int[] {1, 5, 2, -3, 4, -2};
    private int[] expected = new int[] {-3, -2, 1, 2, 4, 5};

    @Test
    public void insertSort() {
        CustomArray actual = new CustomArray(demoArray);
        new SortCustomArrayImpl().insertSort(actual);
        assertArrayEquals(expected, actual.getArrayInteger());
    }

    @Test
    public void selectSort() {
        CustomArray actual = new CustomArray(demoArray);
        new SortCustomArrayImpl().selectSort(actual);
        System.out.println(actual.toString());
        assertArrayEquals(expected, actual.getArrayInteger());
    }

    @Test
    public void shellSort() {
        CustomArray actual = new CustomArray(demoArray);
        new SortCustomArrayImpl().shellSort(actual);
        System.out.println(actual.toString());
        assertArrayEquals(expected, actual.getArrayInteger());
    }
}