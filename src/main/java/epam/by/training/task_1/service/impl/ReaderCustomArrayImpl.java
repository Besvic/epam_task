package epam.by.training.task_1.service.impl;

import epam.by.training.task_1.exception.EmptyArrayException;
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
    public ArrayList<Integer> readFromTxtFile(String path) {
        File f = new File(path);
        try {
            Scanner scanner = new Scanner(f);
            ArrayList<Integer> array;
            try {
                throw new RuntimeException();
            } catch (RuntimeException e) {
                e.printStackTrace();
            }
            do {
               array = CustomValidation.validationInt(scanner.nextLine());
                if (array != null){
                    return array;
                }
            }while (scanner.hasNextLine());
        } catch (FileNotFoundException e) {
           new EmptyArrayException();
        } catch (NoSuchElementException e){
            new EmptyArrayException();
        }
        new EmptyArrayException();
        return new ArrayList<>()                ;
    }
}
