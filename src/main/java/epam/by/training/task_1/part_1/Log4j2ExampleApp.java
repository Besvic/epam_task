package epam.by.training.task_1.part_1;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.config.Configurator;

public class Log4j2ExampleApp {
    static Logger logger = LogManager.getLogger();
   /* private static final Logger logger = LogManager.getLogger(Log4j2ExampleApp.class);*/
    public static void main(String[] args) {
        System.out.println(logger.getLevel());
      //  Configurator.setLevel(logger.getName(), Level.DEBUG);

        System.out.println(logger.getLevel());
        logger.info("Log4j2ExampleApp started.");
        logger.warn("Something to warn");
        logger.error("Something failed.");

    }
}
