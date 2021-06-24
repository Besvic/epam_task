package epam.by.training.task_1.exception;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class EmptyArrayException extends Exception{

    Logger logger = LogManager.getLogger();

    public EmptyArrayException(){
        this.printStackTrace();
    }

    public EmptyArrayException(String message, Throwable cause) {
        super(message, cause);
    }

    public EmptyArrayException(Throwable cause) {
        super(cause);
    }

    public void EmptyArrayException(String message){
        logger.info(message);
    }

    @Override
    public void printStackTrace() {
        logger.error("Action with null-array isn't correct!");
        super.printStackTrace();
    }
}
