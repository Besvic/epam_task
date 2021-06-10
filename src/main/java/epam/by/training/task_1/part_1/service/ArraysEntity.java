package epam.by.training.task_1.part_1.service;

public class ArraysEntity implements ServiceArray {

    @Override
    public int searchMax(int[] array) {
        if (array.length == 0) {
            new RuntimeException();
            return 0;
        } else if (array.length == 1) {
            return array[0];
        } else {
            int max = array[0];
            for (int i = 1; i < array.length; i++) {
                if (max < array[i]) {
                    max = array[i];
                }
            }
            return max;
        }
    }

    @Override
    public int searchMin(int[] array) {
        if (array.length == 0) {
            new RuntimeException();
            return 0;
        } else if (array.length == 1) {
            return array[0];
        } else {
            int min = array[0];
            for (int i = 1; i < array.length; i++) {
                if (min > array[i]) {
                    min = array[i];
                }
            }
            return min;
        }
    }

    @Override
    public int sum(int firstElement, int secondElement) {
        return firstElement + secondElement;
    }

    @Override
    public int numberOfNegativeElement(int[] array) {
        if (array.length == 0) {
            new RuntimeException();
            return 0;
        } else {
            int numberNegativeElement = 0;
            for (int i = 0; i < array.length; i++) {
                if (array[i] < 0) {
                    numberNegativeElement++;
                }
            }
            return numberNegativeElement;
        }
    }

    @Override
    public int numberOfPositiveElement(int[] array) {
        return array.length - numberOfNegativeElement(array);
    }

}
