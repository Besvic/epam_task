package epam.by.training.task_1.service.impl;

import epam.by.training.task_1.array.CustomArray;
import epam.by.training.task_1.exception.EmptyArrayException;
import org.junit.Test;

import static org.junit.Assert.*;

public class SortCustomArrayStreamImplTest {

    private int[] demoArray = new int[] {1, 5, 2, -3, 4, -2};
    private int[] expected = new int[] {-3, -2, 1, 2, 4, 5};

    @Test
    public void insertSort() {
        CustomArray actual = new CustomArray(demoArray);
        try {
            new SortCustomArrayStreamImpl().insertSort(actual);
        } catch (EmptyArrayException e) {
            e.printStackTrace();
        }
        assertArrayEquals(expected, actual.getArrayInteger());
    }

    @Test
    public void selectSort() {
        CustomArray actual = new CustomArray(demoArray);
        try {
            new SortCustomArrayStreamImpl().selectSort(actual);
        } catch (EmptyArrayException e) {
            e.printStackTrace();
        }
        System.out.println(actual.toString());
        assertArrayEquals(expected, actual.getArrayInteger());
    }

    @Test
    public void shellSort() {
        CustomArray actual = new CustomArray(demoArray);
        try {
            new SortCustomArrayStreamImpl().shellSort(actual);
        } catch (EmptyArrayException e) {
            e.printStackTrace();
        }
        assertArrayEquals(expected, actual.getArrayInteger());
    }
}