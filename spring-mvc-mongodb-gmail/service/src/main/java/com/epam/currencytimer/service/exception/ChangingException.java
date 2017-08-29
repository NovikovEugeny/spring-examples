package com.epam.currencytimer.service.exception;

public class ChangingException extends Exception {

    public ChangingException(){
        super();
    }

    public ChangingException(String message){
        super(message);
    }

    public ChangingException(Exception exc){
        super(exc);
    }

    public ChangingException(String message, Exception exc){
        super(message, exc);
    }

}