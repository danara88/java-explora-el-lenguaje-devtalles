package com.devtalles.exceptions.project.exceptions;

/**
 * Checked execption used when a student was not found.
 */
public class StudentNotFoundException extends Exception {
    public StudentNotFoundException(String message) {
        super(message);
    }
}
