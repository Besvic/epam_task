package epam.by.training.task_3.builder;

import epam.by.training.task_3.entity.Point;
import epam.by.training.task_3.entity.Triangle;
import epam.by.training.task_3.exception.NullException;

import java.util.ArrayList;

public class BuilderTriangle {

    public ArrayList<Triangle> customBuildTriangle(ArrayList<Double> doublePointList) throws NullException {
        ArrayList<Triangle> triangleList = new ArrayList<>();
        for (int i = 0; i < doublePointList.size(); i++){
            Point point = new Point(doublePointList.get(i), doublePointList.get(++i));
            Double length = doublePointList.get(++i);
            triangleList.add(new Triangle(point, length));
        }
        return triangleList;
    }
}
