package com.example.springboot1.exceptions;

public class EmployeeException extends RuntimeException{
    public EmployeeException(String message) {
        super(message);
    }
}
