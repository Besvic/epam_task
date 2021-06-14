package epam.by.training.task_1.service;

import epam.by.training.task_1.array.CustomArray;

import java.util.ArrayList;

public interface ReaderCustomArray {
    ArrayList<Integer> readFromTxtFile(String path);
}
