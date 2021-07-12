package epam.by.training.task_3.comparator;

import epam.by.training.task_3.entity.Triangle;

public class TriangleCompareLength {
    public int compareLength(Triangle triangle1, Triangle triangle2) {
        return Double.compare(triangle1.getLength(), triangle2.getLength());
    }
}
