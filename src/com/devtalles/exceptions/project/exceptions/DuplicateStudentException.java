package com.devtalles.exceptions.project.exceptions;

/**
 * Unchecked execption used when a duplicate student is found.
 */
public class DuplicateStudentException extends RuntimeException {
    public DuplicateStudentException(String message) {
        super(message);
    }
}
