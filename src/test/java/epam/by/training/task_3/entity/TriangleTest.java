package epam.by.training.task_3.entity;

import org.junit.Test;

import static org.junit.Assert.*;

public class TriangleTest {

    @Test
    public void testToString() {
        Triangle triangle = new Triangle(new Point(4.5, 3.2), 5.2);
        System.out.println(triangle.toString());
    }
}