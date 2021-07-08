package epam.by.training.task_3.repository.impl;

import epam.by.training.task_3.entity.Triangle;
import epam.by.training.task_3.repository.SpecificationTriangle;

public class SpecificationSecondCoordinateQuarterImpl implements SpecificationTriangle {

    @Override
    public boolean specify(Triangle triangle) {
        return triangle.getPoint().getX() < 0 && triangle.getPoint().getY() > 0;
    }
}