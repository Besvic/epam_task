package epam.by.training.task_1.exception;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ExceptionIncorrectPath extends Exception {
    Logger logger = LogManager.getLogger();
    public ExceptionIncorrectPath(){
        this.printStackTrace();
    }

    @Override
    public void printStackTrace() {
        logger.error("Путь к файлу указан неверно!");
        super.printStackTrace();
    }
}
