package epam.by.training.task_3.reader.impl;

import epam.by.training.task_1.exception.ExceptionIncorrectPath;
import epam.by.training.task_3.reader.ReadFromFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class ReadFromFileImpl implements ReadFromFile {
    @Override
    public String readTXTFIle(String path) throws ExceptionIncorrectPath {
        Path getPath = Paths.get(path);
        try (Stream<String> line = Files.newBufferedReader(getPath).lines()){
            return String.valueOf(line);
        } catch (IOException e) {
            throw new ExceptionIncorrectPath(e);
        }
    }
}
