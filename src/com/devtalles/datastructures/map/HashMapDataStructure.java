package com.devtalles.datastructures.map;

import com.devtalles.datastructures.shared.User;

import java.util.HashMap;
import java.util.Map;

public class HashMapDataStructure {
    public static void execute() {
        /*
          Los Maps son muy rápidos para las busquedas O(1)
         */
        Map<String, Double> productPrices = new HashMap<>();

        // Agregar un elemento a un map
        productPrices.put("Banana", 10.25);
        productPrices.put("Manzana", 8.45);
        productPrices.put("Uva", 12.20);

        // Como podemos ver, no se respeta el orden de inserción
        System.out.println(productPrices); // output: {Uva=12.2, Manzana=8.45, Banana=10.25}

        // Obtener el valor de un elemento
        System.out.println(productPrices.get("Banana")); // outoput: 10.25

        // Actualizar un valor
        productPrices.put("Banana", 9.20);
        System.out.println(productPrices);

        // Eliminar un valor
        productPrices.remove("Banana");
        System.out.println(productPrices);

        /*
          Utilizando el HasMap con clases personalizadas
         */
        Map<String, User> users = new HashMap<>();
        User user1 = new User("123", "Maria");
        User user2 = new User("456", "Ana");
        User user3 = new User("678", "Daniel");

        // create
        users.put(user1.getDni(), user1);
        users.put(user2.getDni(), user2);
        users.put(user3.getDni(), user3);

        // read or list
        System.out.println(users);

        // delete
        users.remove(user1.getDni());

        // update
        users.put(user3.getDni(), new User("888", "Javier"));

        System.out.println(users);

    }
}
