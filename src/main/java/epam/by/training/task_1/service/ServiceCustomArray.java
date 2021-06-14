package epam.by.training.task_1.service;

import epam.by.training.task_1.array.CustomArray;

public interface ServiceCustomArray {
    int searchMin(CustomArray array);
    int searchMax(CustomArray array);
    CustomArray replaceNegativeElement(CustomArray array, int elementForReplace);
    int sum(CustomArray array);
    int numberOfNegativeElement(CustomArray array);
    int numberOfPositiveElement(CustomArray array);
}
