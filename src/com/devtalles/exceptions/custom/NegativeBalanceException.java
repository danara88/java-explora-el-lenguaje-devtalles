package com.devtalles.exceptions.custom;

/**
 * RuntimeException: Significa que es una excepción de tipo Unchecked.
 * Es decir, el sistema no nos va a obligar a chequear la excepción.
 */
public class NegativeBalanceException extends RuntimeException {
    public NegativeBalanceException(String message) {
        super(message);
    }
}
