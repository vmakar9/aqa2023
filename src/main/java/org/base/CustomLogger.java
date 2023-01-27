package org.base;

import io.qameta.allure.Step;
import org.openqa.selenium.logging.LogType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



public class CustomLogger {
    private final Logger logger = (Logger) LoggerFactory.getLogger(this.getClass());

    private LogType logType;

    @Step("{message}")
    private void log(String message) {
        switch (logType) {
            case WARN:
                logger.warn(message);
                break;
            case ERROR:
                logger.error(message);
            default:
                logger.info(message);
        }
    }
    protected void logInfo(String message,Object ...args){
      logType = LogType.INFO;
      log(String.format(message,args));
    }
        enum LogType {
            INFO, WARN, ERROR
        }
    }
