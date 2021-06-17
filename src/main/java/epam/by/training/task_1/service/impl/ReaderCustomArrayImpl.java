package epam.by.training.task_1.service.impl;

import epam.by.training.task_1.exception.EmptyArrayException;
import epam.by.training.task_1.exception.ExceptionIncorrectPath;
import epam.by.training.task_1.service.ReaderCustomArray;
import epam.by.training.task_1.validation.CustomValidation;

import javax.xml.validation.Validator;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class ReaderCustomArrayImpl implements ReaderCustomArray {

    @Override
    public ArrayList<Integer> readFromTxtFile(String path) throws EmptyArrayException, ExceptionIncorrectPath {
        File f = new File(path);
        try {
            Scanner scanner = new Scanner(f);
            ArrayList<Integer> array;
            do {
                array = CustomValidation.validationInt(scanner.nextLine());
                if (array != null) {
                    return array;
                }
            } while (scanner.hasNextLine());
        } catch (FileNotFoundException e) {
            throw new ExceptionIncorrectPath();
        } catch (NoSuchElementException e) {
            throw new EmptyArrayException();
        }
        throw new EmptyArrayException();
    }
}
