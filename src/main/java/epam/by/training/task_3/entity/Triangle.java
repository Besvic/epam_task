package epam.by.training.task_3.entity;


import java.util.Arrays;

public class Triangle {
    private double length;
    private Point x = new Point();
    private Point y = new Point();

    @Override
    public String toString() {
        return "Triangle{" +
                "length=" + length +
                ", x=" + x.getValue() +
                ", y=" + y.getValue() +
                '}';
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(new double[] {length, x.getValue(), y.getValue()});
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || this.getClass() != obj.getClass()){
            return false;
        }else if (obj == this){
            return true;
        }
        else {
            Triangle o = (Triangle) obj;
            return (this.length == o.length && this.x == o.x && this.y == o.y);
        }
    }

    public Triangle() {
    }

    public Triangle(double length, double x, double y) {
        this.length = length;
        this.x.setValue(x);
        this.y.setValue(y);
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getX() {
        return x.getValue();
    }

    public void setX(double x) {
        this.x.setValue(x);
    }

    public double getY() {
        return y.getValue();
    }

    public void setY(double y) {
        this.y.setValue(y);
    }
}
