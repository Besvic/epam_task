package epam.by.training.task_3.observer.impl;

import epam.by.training.task_3.entity.Triangle;
import epam.by.training.task_3.entity.TriangleParameter;
import epam.by.training.task_3.entity.WorkHouse;
import epam.by.training.task_3.exception.NullException;
import epam.by.training.task_3.observer.TriangleEvent;
import epam.by.training.task_3.observer.TriangleObserver;
import epam.by.training.task_3.service.impl.CustomServiceImpl;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TriangleObserverImpl implements TriangleObserver {
    private static Logger logger = LogManager.getLogger();
    @Override
    public void update(TriangleEvent event) throws NullException {
        Triangle triangle = event.getSource();
        long id = triangle.getId();
        WorkHouse workHouse = WorkHouse.getInstance();
        TriangleParameter triangleParameter = workHouse.getParameters(id);
        CustomServiceImpl service = new CustomServiceImpl();
        triangleParameter.setPerimeter(service.findPerimeters(triangle));
        triangleParameter.setArea(service.findArea(triangle));
        logger.info("Data triangle update.");
    }
}
