package com.theopentutorials.jdbc.exception;

//Writing own Exception class
//
//We write custom exception class which is used by DAO methods.
//SQL or any other exception is caught in catch block where we create instance of custom exception 
//with exception message and cause (Throwable instance) and throw this exception. 
//Some DAO methods throw this ApplicationException.


public class ApplicationException extends Exception {
    private static final long serialVersionUID = 1L;
 
    public ApplicationException() { }
     
    public ApplicationException(String message) {
        super(message);     
    }
 
    public ApplicationException(String message, Throwable cause) {
        super(message, cause);      
    }   
}
