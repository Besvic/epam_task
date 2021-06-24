package epam.by.training.task_3.exception;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class NullException extends Exception {

    Logger logger = LogManager.getLogger();

    public NullException(){

    }

    @Override
    public void printStackTrace(){
        logger.error("Object is null");
        super.printStackTrace();
    }

    public void print(String message){
        logger.error(message);
        super.printStackTrace();
    }
}
