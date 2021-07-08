package epam.by.training.task_3.comparator;

import epam.by.training.task_3.entity.Triangle;

public interface TriangleComparator<T> {

    int compareId(Triangle triangle1, Triangle triangle2);
    int comparePointX(Triangle triangle1, Triangle triangle2);
    int comparePointY(Triangle triangle1, Triangle triangle2);
    int compareLength(Triangle triangle1, Triangle triangle2);


}
