package epam.by.training.task_3.reader.impl;

import epam.by.training.task_1.exception.ExceptionIncorrectPath;
import epam.by.training.task_3.reader.ReadFromFile;
import epam.by.training.task_3.validator.CustomValidator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFromFileImpl implements ReadFromFile {
    @Override
    public String readTXTFIle(String path) throws ExceptionIncorrectPath {
        File file = new File(path);
        try {
            Scanner scanner = new Scanner(file);
            do {
                String line = scanner.nextLine();
                if (CustomValidator.isCorrectString(line)){
                    return line;
                }
            }while (scanner.hasNextLine());
        } catch (FileNotFoundException e) {
            throw new ExceptionIncorrectPath(e);
        }
        return null;
    }
}
