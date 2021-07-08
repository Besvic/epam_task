package epam.by.training.task_3.entity;


import epam.by.training.task_3.exception.NullException;
import epam.by.training.task_3.observer.TriangleEvent;
import epam.by.training.task_3.observer.TriangleObservable;
import epam.by.training.task_3.observer.TriangleObserver;
import epam.by.training.task_3.util.GeneratorId;

import java.util.Arrays;

public class Triangle implements TriangleObservable {

    private double length;
    private Point point;
    private long id;
    private TriangleObserver observer;

    public Triangle(Point point, double length) {
        this.length = length;
        this.point = point;
        this.id = GeneratorId.getCurrentId();
    }

    public Triangle(Point point, double length, Long id) {
        this.length = length;
        this.point = point;
        this.id = id;
    }

    public Triangle() {
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public Point getPoint() {
        return point;
    }

    public void setPoint(Point point) {
        this.point = point;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public void attach(TriangleObserver observer) {
        this.observer = observer;
    }

    @Override
    public void detach() {
        this.observer = null;
    }

    @Override
    public void notifyObserver() throws NullException {
        TriangleEvent event = new TriangleEvent(this);
        if (observer != null){
            observer.update(event);
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || this.getClass() != obj.getClass()){
            return false;
        }
        if (obj == this){
            return true;
        }
        Triangle o = (Triangle) obj;
        return (this.length == o.length &&
                this.point.getX() == o.point.getX() &&
                this.point.getY() == o.point.getY() &&
                id == o.id);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(new double[] {length, point.getX(), point.getY(), id});
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "length = " +
                length +
                ", point = (" +
                point.getX() +
                ", " +
                point.getY() +
                ") " +
                "id = " +
                id +
                '}';
    }

}
