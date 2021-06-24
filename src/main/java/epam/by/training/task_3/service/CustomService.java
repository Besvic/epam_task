package epam.by.training.task_3.service;

import epam.by.training.task_3.entity.Triangle;

public interface CustomService {
    double findArea(Triangle triangle);
    double findPerimeters(Triangle triangle);
    double findHeight(Triangle triangle);
}
