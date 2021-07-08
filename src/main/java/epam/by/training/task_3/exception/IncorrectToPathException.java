package epam.by.training.task_3.exception;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class IncorrectToPathException extends Exception{
    Logger logger = LogManager.getLogger();
    public IncorrectToPathException(){
        this.printStackTrace();
    }

    @Override
    public void printStackTrace(){
        logger.error("Incorrect path to file");
        super.printStackTrace();
    }

    public void print(String message){
        logger.error(message);
        super.printStackTrace();
    }
}
