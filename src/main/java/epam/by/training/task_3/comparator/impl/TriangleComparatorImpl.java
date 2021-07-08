package epam.by.training.task_3.comparator.impl;

import epam.by.training.task_3.comparator.TriangleComparator;
import epam.by.training.task_3.entity.Triangle;

public class TriangleComparatorImpl implements TriangleComparator {

    @Override
    public int compareId(Triangle triangle1, Triangle triangle2) {
        return Long.compare(triangle1.getId(), triangle2.getId());
    }

    @Override
    public int comparePointX(Triangle triangle1, Triangle triangle2) {
        return Double.compare(triangle1.getPoint().getX(), triangle2.getPoint().getX());
    }

    @Override
    public int comparePointY(Triangle triangle1, Triangle triangle2) {
        return Double.compare(triangle1.getPoint().getY(), triangle2.getPoint().getY());
    }

    @Override
    public int compareLength(Triangle triangle1, Triangle triangle2) {
        return Double.compare(triangle1.getLength(), triangle2.getLength());
    }


}
