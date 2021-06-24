package epam.by.training.task_3.builder;

import epam.by.training.task_3.entity.Point;
import epam.by.training.task_3.entity.Triangle;
import epam.by.training.task_3.exception.NullException;
import epam.by.training.task_3.parser.ParserFromString;
import epam.by.training.task_3.parser.impl.ParserFromStringImpl;
import epam.by.training.task_3.reader.ReadFromFile;
import epam.by.training.task_3.reader.impl.ReadFromFileImpl;

import java.util.ArrayList;

public class BuilderTriangle {

    public ArrayList<Triangle> customBuildTriangle(String path) throws NullException {

        ArrayList<Double> doublePointList = new ParserFromStringImpl().parserToDouble(
                new ReadFromFileImpl().ReadTXTFIle(path));
        ArrayList<Triangle> triangleList = new ArrayList<>();
        for (int i = 0; i < doublePointList.size(); i++){
            Point x = new Point(doublePointList.get(i));
            Point y = new Point(doublePointList.get(++i));
            Double length = doublePointList.get(++i);
            triangleList.add(new Triangle(x.getValue(), y.getValue(), length));
        }
        return triangleList;
    }
}
