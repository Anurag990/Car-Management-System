package com.CarManagementSystem.TrainingMug.advices;import com.CarManagementSystem.TrainingMug.exceptions.ResourceNotFoundException;import org.springframework.http.HttpStatus;import org.springframework.http.ResponseEntity;import org.springframework.web.bind.MethodArgumentNotValidException;import org.springframework.web.bind.annotation.ExceptionHandler;import org.springframework.web.bind.annotation.RestControllerAdvice;import java.util.List;import java.util.NoSuchElementException;import java.util.stream.Collectors;@RestControllerAdvicepublic class GlobalExceptionHandler {    @ExceptionHandler(ResourceNotFoundException.class)    public ResponseEntity<ApiError> handleResourceNotFound(ResourceNotFoundException exception)    {        ApiError apiError = new ApiError();        apiError.setStatus(HttpStatus.NOT_FOUND);        apiError.setMessage(exception.getMessage());        return new ResponseEntity<>(apiError, HttpStatus.NOT_FOUND);    }    @ExceptionHandler(Exception.class)    public ResponseEntity<ApiError> handleInternalServerError(Exception exception)    {        ApiError apiError = new ApiError();        apiError.setStatus(HttpStatus.INTERNAL_SERVER_ERROR);        apiError.setMessage(exception.getMessage());        return new ResponseEntity<>(apiError, HttpStatus.INTERNAL_SERVER_ERROR);    }    @ExceptionHandler(MethodArgumentNotValidException.class)    public ResponseEntity<ApiError> handleInputValidationErrors(MethodArgumentNotValidException exception)    {        List<String> errors = exception                .getBindingResult()                .getAllErrors()                .stream()                .map(error -> error.getDefaultMessage())                .collect(Collectors.toList());        ApiError apiError = new ApiError();        apiError.setStatus(HttpStatus.BAD_REQUEST);        apiError.setMessage(errors.toString());        return new ResponseEntity<>(apiError, HttpStatus.BAD_REQUEST);    }}