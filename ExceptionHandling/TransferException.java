package org.java;

public class TransferException extends Exception{
    String message;
    
    TransferException(String message){
        super(message);
        this.message = message;
    }

    TransferException(){}

    TransferException(String message, Throwable cause){
        super(message, cause);
    }

    TransferException(Throwable cause){
        super(cause);
    }
    
}
