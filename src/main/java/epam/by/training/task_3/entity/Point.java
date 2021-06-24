package epam.by.training.task_3.entity;


import java.util.Arrays;

public class Point {
    private double value;


    @Override
    public String toString() {
        return "Point for triangle{ " +
                "value = " + value +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return Double.compare(point.value, value) == 0;
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(new double[] {value});
    }

    public Point(double value) {
        this.value = value;
    }

    public Point() {
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }
}
