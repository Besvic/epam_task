package epam.by.training.task_3.reader;

import epam.by.training.task_1.exception.ExceptionIncorrectPath;

import java.io.File;

public interface ReadFromFile {
    String readTXTFIle(String path) throws ExceptionIncorrectPath;
}
