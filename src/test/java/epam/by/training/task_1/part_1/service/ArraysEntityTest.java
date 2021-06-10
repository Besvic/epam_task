package epam.by.training.task_1.part_1.service;

import epam.by.training.task_1.part_1.array.ArrayEntity;
import org.junit.Test;


import static org.junit.Assert.*;

public class ArraysEntityTest {

    @Test
    public void searchMax() {
        int actual = new ArraysEntity().searchMax(new int[]{1, -3, 3, 4, -5, 5, 6, -12});
        int expected = 6;
        assertEquals(expected, actual);
    }

    @org.junit.Test
    public void searchMin() {
        int actual = new ArraysEntity().searchMin(new int[]{1, -3, 3, 4, -5, 5, 6, -12});
        int expected = -12;
        assertEquals(expected, actual);
    }

    @org.junit.Test
    public void replaceNegativeElement() {
        int[] expected = {1, -2, 3, 4, -2, 5, 6, -2};
        ArrayEntity arrayEntity = new ArrayEntity(new int[] {1, -3, 3, 4, -5, 5, 6, -12});
        int[] actual = ServiceArray.replaceNegativeElement(arrayEntity.getArrayInteger(), -2);
        assertArrayEquals(expected, actual);
    }

    @org.junit.Test
    public void sum() {
        int expect = 5;
        int actual = new ArraysEntity().sum(2, 3);
        assertEquals(expect, actual);
    }

    @org.junit.Test
    public void numberOfNegativeElement() {
        int expect = 3;
        int actual = new ArraysEntity().numberOfNegativeElement(new int[] {1, -3, 3, 4, -5, 5, 6, -12});
        assertEquals(expect, actual);
    }

    @org.junit.Test
    public void numberOfPositiveElement() {
        int expect = 5;
        int actual = new ArraysEntity().numberOfPositiveElement(new int[] {1, -3, 3, 4, -5, 5, 6, -12});
        assertEquals(expect, actual);
    }
}