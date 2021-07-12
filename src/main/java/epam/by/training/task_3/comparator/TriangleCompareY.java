package epam.by.training.task_3.comparator;

import epam.by.training.task_3.entity.Triangle;

public class TriangleCompareY {
    public int comparePointY(Triangle triangle1, Triangle triangle2) {
        return Double.compare(triangle1.getPoint().getY(), triangle2.getPoint().getY());
    }
}
