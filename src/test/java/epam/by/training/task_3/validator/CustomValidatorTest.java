package epam.by.training.task_3.validator;

import epam.by.training.task_3.entity.Triangle;
import org.junit.Test;

import static org.junit.Assert.*;

public class CustomValidatorTest {

    @Test
    public void isPositiveLength() {

    }

    @Test
    public void isCorrectString() {
        System.out.println(CustomValidator.isCorrectString("1.1,2.3,3.2"));
    }

    @Test
    public void isNullTriangleTrue() {
        boolean actual = CustomValidator.isNullTriangle(new Triangle());
        assertEquals(true, actual);
    }

    @Test
    public void isNullTriangleFalse() {
        boolean actual = CustomValidator.isNullTriangle(null);
        assertEquals(false, actual);
    }
}