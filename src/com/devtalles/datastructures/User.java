package com.devtalles.datastructures;

import java.util.Objects;

public class User implements Comparable<User> {
    private String dni;
    private String name;

    public User(String dni, String name) {
        this.dni = dni;
        this.name = name;
    }

    public String getDni() {
        return dni;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object obj) {
        // Comparamos si tiene la misma dirección de memoria
        if(this == obj) return true;

        // Verificamos si el objeto que pasamos es nulo o si el objeto tiene un tipo diferente
        if(obj == null || getClass() != obj.getClass()) return false;

        // Casteamos al mismo tipo
        User user = (User)obj;

        // Estamos comparando el valor del dato dni para la comparación
        // Si retorna true, entonces significa que tenemos un objeto igual.
        // Por lo cual, sería un objeto duplicado dentro de un set y el hash no me deberia dejar agregarlo.
        return Objects.equals(dni, user.dni);
    }

    /**
     * HashCode: Es el metodo que se utiliza cuando queremos agregar
     * un elemento a un HashSet. Crea una clave.
     */
    @Override
    public int hashCode() {
        return Objects.hash(dni);
    }

    @Override
    public String toString() {
        return "Person {" +
                "name=" + name + '\'' +
                ", dni=" + dni + '\'' +
                '}';
    }

    @Override
    public int compareTo(User o) {
        /*
          Le decimos al TreeSet que compare y ordene por el dni.
          Tenemos que tener cuidado si estamos usando una propiedad String para ordenar.
         */
        return this.dni.compareTo(o.dni);
    }
}
