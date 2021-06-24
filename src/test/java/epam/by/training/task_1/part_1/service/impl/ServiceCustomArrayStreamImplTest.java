package epam.by.training.task_1.part_1.service.impl;

import epam.by.training.task_1.array.CustomArray;
import epam.by.training.task_1.service.impl.ServiceCustomArrayStreamImpl;
import org.junit.Test;

import static org.junit.Assert.*;

public class ServiceCustomArrayStreamImplTest {

    int[] demoArray = new int[]{1, -3, 3, 4, -5, 5, 6, -12};

    @Test
    public void searchMax() {
        int actual = new ServiceCustomArrayStreamImpl().searchMax(new CustomArray(demoArray));
        int expected = 6;
        assertEquals(expected, actual);
    }

    @org.junit.Test
    public void searchMin() {
        int actual = new ServiceCustomArrayStreamImpl().searchMin(new CustomArray(demoArray));
        int expected = -12;
        assertEquals(expected, actual);
    }

    @org.junit.Test
    public void replaceNegativeElement() {
        int[] expected = {1, -2, 3, 4, -2, 5, 6, -2};
        CustomArray arrayEntity = new CustomArray(demoArray);
        int[] actual = new ServiceCustomArrayStreamImpl().replaceNegativeElement(arrayEntity, -2).getArrayInteger();
        assertArrayEquals(expected, actual);
    }

    @org.junit.Test
    public void sum() {
        int expect = -1;
        int actual = new ServiceCustomArrayStreamImpl().sum(new CustomArray(demoArray));
        assertEquals(expect, actual);
    }

    @org.junit.Test
    public void numberOfNegativeElement() {
        int expect = 3;
        int actual = new ServiceCustomArrayStreamImpl().numberOfNegativeElement(new CustomArray(demoArray));
        assertEquals(expect, actual);
    }

    @org.junit.Test
    public void numberOfPositiveElement() {
        int expect = 5;
        int actual = new ServiceCustomArrayStreamImpl().numberOfPositiveElement(new CustomArray(demoArray));
        assertEquals(expect, actual);
    }
}