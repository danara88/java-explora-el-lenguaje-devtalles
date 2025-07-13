package com.devtalles.exceptions.custom;

/**
 * Exception: Significa que es una excepción de tipo Checked.
 * Es decir, el sistema nos va a obligar a chequear la excepción.
 */
public class AgeValidationException extends Exception {
    public AgeValidationException(String message) {
        super(message);
    }
}
