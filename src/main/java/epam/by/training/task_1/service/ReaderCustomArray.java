package epam.by.training.task_1.service;

import epam.by.training.task_1.array.CustomArray;
import epam.by.training.task_1.exception.EmptyArrayException;
import epam.by.training.task_1.exception.ExceptionIncorrectPath;

import java.util.ArrayList;

public interface ReaderCustomArray {
    ArrayList<Integer> readFromTxtFile(String path) throws EmptyArrayException, ExceptionIncorrectPath;
}
