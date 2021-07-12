package epam.by.training.task_3.observer;

import epam.by.training.task_3.exception.NotFoundObjectException;

public interface TriangleObservable {
    void attach(TriangleObserver observer);
    void detach();
    void notifyObserver() throws NotFoundObjectException;
}
