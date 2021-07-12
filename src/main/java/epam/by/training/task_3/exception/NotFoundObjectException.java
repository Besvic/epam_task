package epam.by.training.task_3.exception;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class NotFoundObjectException extends Exception {

    Logger logger = LogManager.getLogger();

    public NotFoundObjectException(String message){
        logger.error(message);
        printStackTrace();
    }

    @Override
    public void printStackTrace(){
        super.printStackTrace();
    }
}
