package epam.by.training.task_3.comparator;

import epam.by.training.task_3.entity.Triangle;

public class TriangleCompareX {
    public int comparePointX(Triangle triangle1, Triangle triangle2) {
        return Double.compare(triangle1.getPoint().getX(), triangle2.getPoint().getX());
    }
}
