package log4j2demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4j2Demo {
    private static final Logger logger = LogManager.getLogger(Log4j2Demo.class);

    public static void main(String[] args) {
        logger.trace("trace message");
        logger.info("info message");
        logger.debug("debug message");
        logger.error("error message");
    }
}
