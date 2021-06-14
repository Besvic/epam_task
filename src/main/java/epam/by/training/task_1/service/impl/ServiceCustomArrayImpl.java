package epam.by.training.task_1.service.impl;

import epam.by.training.task_1.array.CustomArray;
import epam.by.training.task_1.service.ServiceCustomArray;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ServiceCustomArrayImpl implements ServiceCustomArray {

    Logger logger = LogManager.getLogger();
    @Override
    public int searchMax(CustomArray array) {
        if (array.length() == 0) {
            new RuntimeException();
            return 0;
        } else if (array.length() == 1) {
            return array.getArrayInteger()[0];
        } else {
            int max = array.getArrayInteger()[0];
            for (int i = 1; i < array.length(); i++) {
                if (max < array.getArrayInteger()[i]) {
                    max = array.getArrayInteger()[i];
                }
            }
            return max;
        }
    }

    @Override
    public CustomArray replaceNegativeElement(CustomArray array, int elementForReplace) {
        if (array.length() == 0){
            return array;
        }
        else {
            for (int i = 0; i < array.length(); i++) {
                if (array.getArrayInteger()[i] < 0){
                    array.getArrayInteger()[i] = elementForReplace;
                }
            }
        }
        return array;
    }

    @Override
    public int sum(CustomArray array) {
        try {
            int sum = 0;
            for (int i = 0; i < array.length(); i++) {
                sum += array.getArrayInteger()[i];
            }
            return sum;
        }
        catch (NullPointerException exception){
            exception.printStackTrace();
            return 0;
        }
    }

    @Override
    public int searchMin(CustomArray array) {
        if (array.length() == 0) {
            new RuntimeException();
            return 0;
        } else if (array.length() == 1) {
            return array.getArrayInteger()[0];
        } else {
            int min = array.getArrayInteger()[0];
            for (int i = 1; i < array.length(); i++) {
                if (min > array.getArrayInteger()[i]) {
                    min = array.getArrayInteger()[i];
                }
            }
            return min;
        }
    }

    @Override
    public int numberOfNegativeElement(CustomArray array) {
        if (array.length() == 0) {
            new RuntimeException();
            return 0;
        } else {
            int numberNegativeElement = 0;
            for (int i = 0; i < array.length(); i++) {
                if (array.getArrayInteger()[i] < 0) {
                    numberNegativeElement++;
                }
            }
            return numberNegativeElement;
        }
    }

    @Override
    public int numberOfPositiveElement(CustomArray array) {
        return array.length() - numberOfNegativeElement(array);
    }

}
