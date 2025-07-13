package com.devtalles.exceptions;

import com.devtalles.exceptions.custom.AgeValidationException;
import com.devtalles.exceptions.shared.Person;

public class CheckedExceptionExample {
    public static void execute() {
         /*
          Con una excepción de tipo Checked, el editor me obliga
          a utilizar un try-catch. Me lanza un error en tiempo de compilación.
         */
        try {
            // Esta operación puede lanzar una exception de tipo Checked
            // Es decir, el sistema nos va a obligar a chequear la excepción.
            Person person = Person.createPerson(17, "Javier");
            System.out.println(person);
        } catch (AgeValidationException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Continuacion del programa ...");
    }
}
