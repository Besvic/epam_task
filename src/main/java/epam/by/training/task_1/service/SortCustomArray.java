package epam.by.training.task_1.service;

import epam.by.training.task_1.array.CustomArray;
import epam.by.training.task_1.exception.EmptyArrayException;

public interface SortCustomArray {
    void insertSort(CustomArray array) throws EmptyArrayException;
    void selectSort(CustomArray array) throws EmptyArrayException;
    void shellSort(CustomArray array) throws EmptyArrayException;

}
