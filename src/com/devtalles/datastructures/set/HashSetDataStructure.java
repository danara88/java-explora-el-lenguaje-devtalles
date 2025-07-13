package com.devtalles.datastructures.set;

import com.devtalles.datastructures.shared.User;

import java.util.HashSet;
import java.util.Set;

public class HashSetDataStructure {
    public static void execute() {
        /*
          No respeta el orden de las inserciones.
          No permite duplicados.
          No tenemos índices.
         */
        Set<Integer> numbers = new HashSet<>();
        numbers.add(10);
        numbers.add(25);
        numbers.add(300);
        numbers.add(4500);
        numbers.add(4500); // No se inserta

        // Eliminar un elemento por su valor
        numbers.remove(25);
        System.out.println(numbers);

        // Modificar un valor en el set.
        // Primero tenemos que eliminarlo y luego agregarlo.
        // No tenemos índices.
        numbers.remove(4500);
        numbers.add(4500);

        /*
          Utilizando una clase personalizada en el set
         */
        Set<User> users = new HashSet<>();
        User user1 = new User("123", "Maria");
        User user2 = new User("456", "Ana");
        User user3 = null; // Podemos agregar nulos en un set
        User user4 = new User("456", "John");

        /*
          Estos son los pasos que se siguen al añadir un dato al set.
          1. Calcula el hashCode del nuevo objeto.
          2. Busca en la tabla interna si hay un objeto con el mismo hashCode.
          3. Si no hay, lo agrega directamente y no pasa por el equals().
          4. Pero si hay uno o más (colisión), usa el equals() para la comparación.
          5. Si el equals retorna true, significa que el objeto existe (duplicado), por lo que no lo agrega.
          6. Si devuelve false, lo agrega.
         */
        users.add(user1);
        users.add(user2);
        users.add(user3); // Podemos agregar nulos en un set

        /*
          Este dato no lo va a agregar, ya que estamo generando el HashCode
          usando el dni. Aquí, el dni es igual al de Ana, por lo que pasará al equals.
          Cuando está en el equals, se da cuenta de que ya existe un dni 456, por lo que no lo agrega.
         */
        users.add(user4);
        System.out.println(user2.hashCode()); // 51700
        System.out.println(user4.hashCode()); // 51700

        for (User user : users) {
            if(user != null) {
                System.out.println("User: " + user.getName() + " " + user.getDni());
            }
        }

        System.out.println(users);
    }
}
