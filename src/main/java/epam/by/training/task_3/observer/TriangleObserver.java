package epam.by.training.task_3.observer;

import epam.by.training.task_3.exception.NotFoundObjectException;

public interface TriangleObserver {

    void update(TriangleEvent event) throws NotFoundObjectException;
}
