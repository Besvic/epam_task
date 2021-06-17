package epam.by.training.task_1.service.impl;

import epam.by.training.task_1.array.CustomArray;
import epam.by.training.task_1.exception.EmptyArrayException;
import epam.by.training.task_1.service.SortCustomArray;

import java.util.Arrays;
import java.util.stream.IntStream;


public class SortCustomArrayStreamImpl implements SortCustomArray {

    @Override
    public void insertSort(CustomArray array) throws EmptyArrayException {
        int number = array.length();
        try {
            IntStream.range(0, number - 1)
                    .flatMap(i -> IntStream.range(1, number - i))
                    .forEach(j -> {
                        int current = array.getArrayInteger()[j];
                        j--;
                        while (j >= 0 && current < array.getArrayInteger()[j]) {
                            array.getArrayInteger()[j + 1] = array.getArrayInteger()[j];
                            j--;
                        }
                        array.getArrayInteger()[j + 1] = current;
                    });
        } catch (NullPointerException e) {
            throw new EmptyArrayException();
        }
    }

    @Override
    public void selectSort(CustomArray array) throws EmptyArrayException {
        /*for (int i = 0; i < array.length(); i++) {
            int min = array.getArrayInteger()[i];
            int minNumber = i;
            for (int j = i + 1; j < array.length(); j++) {
                if (array.getArrayInteger()[j] < min) {
                    min = array.getArrayInteger()[j];
                    minNumber = j;
                }
            }
            int temp = array.getArrayInteger()[i];
            array.getArrayInteger()[i] = min;
            array.getArrayInteger()[minNumber] = temp;
        }*/
    }

    @Override
    public void shellSort(CustomArray array) throws EmptyArrayException {
        try {
            array.setArrayInteger(Arrays.stream(array.getArrayInteger()).sorted().toArray());
        } catch (NullPointerException e){
            throw new EmptyArrayException();
        }
    }
}
