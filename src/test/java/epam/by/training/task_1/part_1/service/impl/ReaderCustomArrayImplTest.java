package epam.by.training.task_1.part_1.service.impl;

import epam.by.training.task_1.exception.EmptyArrayException;
import epam.by.training.task_1.exception.ExceptionIncorrectPath;
import epam.by.training.task_1.service.impl.ReaderCustomArrayImpl;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReaderCustomArrayImplTest {
    private int[] expected = new int[] {-3, -2, 1, 2, 4, 5};
    @Test
    public void readFromTxtFile() {
        try {
            System.out.println( new ReaderCustomArrayImpl().readFromTxtFile("D:\\БГУИР\\Личное\\Java\\Epam\\task\\src\\main\\resources\\testReader.txt").toString());
        } catch (EmptyArrayException e) {
            e.printStackTrace();
        } catch (ExceptionIncorrectPath e) {
            e.printStackTrace();
        }

    }



}