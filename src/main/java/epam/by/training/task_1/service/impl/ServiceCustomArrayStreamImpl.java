package epam.by.training.task_1.service.impl;

import epam.by.training.task_1.array.CustomArray;
import epam.by.training.task_1.service.ServiceCustomArray;

import java.util.Arrays;
import java.util.function.IntConsumer;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ServiceCustomArrayStreamImpl implements ServiceCustomArray {


    @Override
    public int searchMin(CustomArray array) {
        return Arrays.stream(array.getArrayInteger()).min().getAsInt();
    }

    @Override
    public int searchMax(CustomArray array) {
        return Arrays.stream(array.getArrayInteger()).max().getAsInt();
    }

    @Override
    public CustomArray replaceNegativeElement(CustomArray array, int elementForReplace) {
        return new CustomArray(Arrays.stream(array.getArrayInteger()).map(s -> s < 0 ? elementForReplace : s).toArray());
    }

    @Override
    public int sum(CustomArray array) {
        return Arrays.stream(array.getArrayInteger()).sum();
    }

    @Override
    public int numberOfNegativeElement(CustomArray array) {
        return (int) Arrays.stream(array.getArrayInteger()).filter(i -> i < 0).count();
    }

    @Override
    public int numberOfPositiveElement(CustomArray array) {
        return (int) Arrays.stream(array.getArrayInteger()).filter(i -> i >= 0).count();
    }
}
