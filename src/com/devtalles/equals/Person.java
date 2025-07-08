package com.devtalles.equals;

import java.util.Objects;

public class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        // Comparamos si tiene la misma dirección de memoria
        if(this == obj) return true;

        // Verificamos si el objeto que pasamos es nulo o si el objeto tiene un tipo diferente
        if(obj == null || getClass() != obj.getClass()) return false;

        // Casteamos al mismo tipo
        Person person = (Person)obj;

        // Estamos comparando el valor del dato name para la comparación
        return Objects.equals(name, person.name);
    }
}