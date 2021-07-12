package epam.by.training.task_3.comparator;

import epam.by.training.task_3.entity.Triangle;

public class TriangleCompareId {
    public int compareId(Triangle triangle1, Triangle triangle2) {
        return Long.compare(triangle1.getId(), triangle2.getId());
    }
}
