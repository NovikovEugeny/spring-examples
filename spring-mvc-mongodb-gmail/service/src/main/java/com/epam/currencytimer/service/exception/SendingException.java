package com.epam.currencytimer.service.exception;

public class SendingException extends Exception {

    public SendingException(){
        super();
    }

    public SendingException(String message){
        super(message);
    }

    public SendingException(Exception exc){
        super(exc);
    }

    public SendingException(String message, Exception exc){
        super(message, exc);
    }

}