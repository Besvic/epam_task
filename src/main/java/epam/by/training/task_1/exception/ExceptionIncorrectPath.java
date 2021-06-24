package epam.by.training.task_1.exception;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ExceptionIncorrectPath extends Exception {
    Logger logger = LogManager.getLogger();
    public ExceptionIncorrectPath(){
        this.printStackTrace();
    }

    public ExceptionIncorrectPath(String message) {
        super(message);
    }

    public ExceptionIncorrectPath(String message, Throwable cause) {
        super(message, cause);
    }

    public ExceptionIncorrectPath(Throwable cause) {
        super(cause);
    }

    @Override
    public void printStackTrace() {
        logger.error("Path incorrect");
        super.printStackTrace();
    }
}
