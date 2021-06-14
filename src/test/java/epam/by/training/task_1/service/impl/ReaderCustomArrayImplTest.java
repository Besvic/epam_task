package epam.by.training.task_1.service.impl;

import epam.by.training.task_1.exception.ExceptionIncorrectPath;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReaderCustomArrayImplTest {
    private int[] expected = new int[] {-3, -2, 1, 2, 4, 5};
    @Test
    public void readFromTxtFile() throws RuntimeException  {
        System.out.println( new ReaderCustomArrayImpl().readFromTxtFile("D:\\БГУИР\\Личное\\Java\\Epam\\task\\src\\main\\resources\\testReader.txt").toString());

    }

}