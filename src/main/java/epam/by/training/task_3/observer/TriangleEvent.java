package epam.by.training.task_3.observer;

import epam.by.training.task_3.entity.Triangle;

import java.util.EventObject;

public class TriangleEvent extends EventObject {
    /**
     * Constructs a prototypical Event.
     *
     * @param source the object on which the Event initially occurred
     * @throws IllegalArgumentException if source is null
     */

    public TriangleEvent(Object source) {
        super(source);
    }

    @Override
    public Triangle getSource() {
        return (Triangle) super.getSource();
    }
}
