package epam.by.training.task_3.builder;

import epam.by.training.task_3.exception.NullException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

import static org.junit.Assert.*;

public class BuilderTriangleTest {

    @Test
    public void customBuildTriangle() {
        Logger logger = LogManager.getLogger();
        try {
           logger.info(new BuilderTriangle().customBuildTriangle("D:\\БГУИР\\Личное\\Java\\Epam\\task\\src\\main\\resources\\pointXYLengthForTriangle.txt"));
        } catch (NullException e) {
            e.printStackTrace();
        }
    }
}