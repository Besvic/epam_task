package epam.by.training.task_1.exception;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class EmptyArrayException extends Exception{

    Logger logger = LogManager.getLogger();

    public EmptyArrayException(){
    }


    public void EmptyArrayException(String message){
        logger.info(message);
    }

    @Override
    public void printStackTrace() {
        logger.error("Действия с непроинициализированным массивом недопустимы!");
    }
}
