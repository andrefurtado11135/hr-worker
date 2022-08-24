package io.github.andrefurtado11135.hrworker.exceptions;

public class WorkerNotFoundException extends RuntimeException{

    public WorkerNotFoundException(String message){
        super(message);
    }
}
