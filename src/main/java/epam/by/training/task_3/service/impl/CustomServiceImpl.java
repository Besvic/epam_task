package epam.by.training.task_3.service.impl;

import epam.by.training.task_3.entity.Triangle;
import epam.by.training.task_3.service.CustomService;

public class CustomServiceImpl implements CustomService {
    @Override
    public double findArea(Triangle triangle) {
        return Math.pow(triangle.getLength(), 2) * Math.sqrt(3) / 4;
    }

    @Override
    public double findPerimeters(Triangle triangle) {
        return triangle.getLength() * 3;
    }

    @Override
    public double findHeight(Triangle triangle) {
        return triangle.getLength() * Math.sqrt(3) / 2;
    }
}
