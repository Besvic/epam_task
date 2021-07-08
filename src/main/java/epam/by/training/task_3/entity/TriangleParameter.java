package epam.by.training.task_3.entity;

import java.util.Arrays;

public class TriangleParameter {
    private double perimeter;
    private double area;

    public TriangleParameter() {
    }

    public TriangleParameter(double perimeter, double area) {
        this.perimeter = perimeter;
        this.area = area;
    }

    public double getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    @Override
    public boolean equals(Object o){
        if(o == null || o.getClass() != this.getClass())
            return false;
        if (o == this)
            return true;
        TriangleParameter triangleParameter = (TriangleParameter) o;
        return triangleParameter.area == this.area &&
                triangleParameter.perimeter == this.perimeter;
    }

    @Override
    public int hashCode(){
        return Arrays.hashCode(new double[] {perimeter, area});
    }

    @Override
    public String toString() {
        return "TriangleParameters{" +
                "perimeter=" + perimeter +
                ", area=" + area +
                '}';
    }
}
