package com.epam.currencytimer.handler;

import com.epam.currencytimer.service.exception.ChangingException;
import com.epam.currencytimer.service.exception.SendingException;
import com.epam.currencytimer.service.util.Messanger;
import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class MainControllerExceptionHandler {

    private static final Logger LOGGER = Logger.getLogger(MainControllerExceptionHandler.class);

    @ExceptionHandler(ChangingException.class)
    public void alert(Exception exc) throws SendingException {
        Messanger.alert(exc.getMessage());
    }

    @ExceptionHandler(SendingException.class)
    public void log(Exception exc) {
        LOGGER.error(exc);
    }

}