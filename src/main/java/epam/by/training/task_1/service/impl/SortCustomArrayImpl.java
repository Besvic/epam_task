package epam.by.training.task_1.service.impl;

import epam.by.training.task_1.array.CustomArray;
import epam.by.training.task_1.exception.EmptyArrayException;
import epam.by.training.task_1.service.SortCustomArray;

import java.util.Collections;
import static java.util.Collections.swap;

public class SortCustomArrayImpl implements SortCustomArray {

    @Override
    public void insertSort(CustomArray array) {
        try {
            for (int i = 1; i < array.length(); i++) {
                int current = array.getArrayInteger()[i];
                int j = i - 1;
                while (j >= 0 && current < array.getArrayInteger()[j]) {
                    array.getArrayInteger()[j + 1] = array.getArrayInteger()[j];
                    j--;
                }
                // в этой точке мы вышли, так что j так же -1
                // или в первом элементе, где текущий >= a[j]
                array.getArrayInteger()[j + 1] = current;
            }
        } catch (NullPointerException e) {
            new EmptyArrayException();
        }
    }

    @Override
    public void selectSort(CustomArray array) {
        try {
            for (int i = 0; i < array.length(); i++) {
                int min = array.getArrayInteger()[i];
                int minId = i;
                for (int j = i + 1; j < array.length(); j++) {
                    if (array.getArrayInteger()[j] < min) {
                        min = array.getArrayInteger()[j];
                        minId = j;
                    }
                }
                // замена
                int temp = array.getArrayInteger()[i];
                array.getArrayInteger()[i] = min;
                array.getArrayInteger()[minId] = temp;
            }
        } catch (NullPointerException e) {
            new EmptyArrayException();
        }
    }

    @Override
    public void shellSort(CustomArray array) {
        try {
            int gap = array.length() / 2;
            // Пока разница между элементами есть
            while (gap >= 1) {
                for (int right = 0; right < array.length(); right++) {
                    // Смещаем правый указатель, пока не сможем найти такой, что
                    // между ним и элементом до него не будет нужного промежутка
                    for (int c = right - gap; c >= 0; c -= gap) {
                        if (array.getArrayInteger()[c] > array.getArrayInteger()[c + gap]) {
                            int temp = array.getArrayInteger()[c];
                            array.getArrayInteger()[c] = array.getArrayInteger()[c + gap];
                            array.getArrayInteger()[c + gap] = temp;
                        }
                    }
                }
                // Пересчитываем разрыв
                gap = gap / 2;
            }
        } catch (NullPointerException e) {
            new EmptyArrayException();
        }
    }
}


