package com.devtalles.datastructures.set;

import com.devtalles.datastructures.User;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDataStructure {
    public static void execute() {
        /*
          Los Trees son muy eficientes en operaciones de busqueda.
          Conforme vamos agregando datos, los va a ordenando.
          También no agrega los datos duplicados.

          Este usa el metodo de balanceo: Red Black tree
         */
        Set<Integer> numbers = new TreeSet<>();

        // A pesar de tener los datos desordenados, cuando los imprimimos
        // los ordena.
        numbers.add(1);
        numbers.add(3);
        numbers.add(7);
        numbers.add(2);
        numbers.add(5);
        numbers.add(6);
        numbers.add(4);
        numbers.add(4);

        System.out.println(numbers);

        /*
          Cuando necesitemos trabajar con clases wrapper personalizadas,
          es importante implementar el método Comparable.
          NO PODEMOS UTILIZAR DATOS NULOS.
         */
        Set<User> users = new TreeSet<>();
        User user1 = new User("123", "Maria");
        User user2 = new User("456", "Ana");
        User user3 = new User("678", "Daniel");

        users.add(user1);
        users.add(user3);
        users.add(user2);

        System.out.println(users);
    }
}
