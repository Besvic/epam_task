package epam.by.training.task_1.part_1.service;

import epam.by.training.task_1.part_1.array.ArrayEntity;

public interface ServiceArray {
    int searchMin(int[] array);
    int searchMax(int[] array);

    static int[] replaceNegativeElement(int[] array, int elementForReplace) {
        if (array.length == 0){
            return array;
        }
        else {
            for (int i = 0; i < array.length; i++) {
                if (array[i] < 0){
                    array[i] = elementForReplace;
                }
            }
        }
        return array;
    }
    int sum(int firstElement, int secondElement);
    int numberOfNegativeElement(int[] array);
    int numberOfPositiveElement(int[] array);
}
