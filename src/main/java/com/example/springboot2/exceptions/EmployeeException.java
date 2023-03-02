package com.example.springboot2.exceptions;

public class EmployeeException extends RuntimeException{
    public EmployeeException(String message) {
        super(message);
    }
}
