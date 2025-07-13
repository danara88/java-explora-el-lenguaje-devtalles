package com.devtalles.exceptions.project.exceptions;

/**
 * Unchecked execption used when a student was not found.
 */
public class StudentNotFoundException extends RuntimeException {
    public StudentNotFoundException(String message) {
        super(message);
    }
}
