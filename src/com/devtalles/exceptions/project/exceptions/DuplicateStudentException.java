package com.devtalles.exceptions.project.exceptions;

/**
 * Checked execption used when a duplicate student is found.
 */
public class DuplicateStudentException extends Exception {
    public DuplicateStudentException(String message) {
        super(message);
    }
}
