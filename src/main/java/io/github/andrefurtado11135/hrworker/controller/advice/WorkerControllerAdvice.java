package io.github.andrefurtado11135.hrworker.controller.advice;

import io.github.andrefurtado11135.hrworker.exceptions.WorkerNotFoundException;
import io.github.andrefurtado11135.hrworker.model.dto.ErrorResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.LocalDateTime;

@RestControllerAdvice
public class WorkerControllerAdvice {

    @ResponseBody
    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ExceptionHandler(WorkerNotFoundException.class)
    public ResponseEntity<ErrorResponse> handleWorkerNotFoundException(WorkerNotFoundException workerNotFoundException){
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(ErrorResponse.builder().message(workerNotFoundException.getMessage())
                .timestamp(LocalDateTime.now()).build());
    }
}
