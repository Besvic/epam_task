package epam.by.training.task_3.main;

import epam.by.training.task_3.entity.Point;
import epam.by.training.task_3.entity.Triangle;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class Main {
    public static void main(String[] args) {
        Logger logger = LogManager.getLogger();
        Triangle triangle = new Triangle(5, 3, 4);
        logger.info(triangle);
    }
}
