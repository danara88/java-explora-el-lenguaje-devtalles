package com.devtalles.exceptions.shared;

import com.devtalles.exceptions.custom.AgeValidationException;

public class Person {
    private Integer age;
    private String name;

    public Person(Integer age, String name) {
        this.age = age;
        this.name = name;
    }

    /*
     * Cuando es de tipo unchecked (Exception), me obligan a firmar con "throws ..." Ejemplo:
     * throws AgeValidationException
     */
    public static Person createPerson(Integer age, String name) throws AgeValidationException {
        if (age < 18) {
            /*
              Esta es una excepción de tipo Checked, porque en una determinada situación
              puedo lanzar una excepción (Chequeada).
              Es decir, el sistema nos va a obligar a chequear la excepción.
             */
            throw new AgeValidationException("Debes ser mayor de edad.");
        }
        return new Person(age, name);
    }
}
