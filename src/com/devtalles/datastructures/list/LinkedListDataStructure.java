package com.devtalles.datastructures.list;

import java.util.LinkedList;

public class LinkedListDataStructure {
    public static void execute() {
        /*
          Los linkedList son una lista doblemente enlazada.
          Implementan la interfaz List.
          Puedo lograr el comportamiento de una queue o un stack.

          Para hacer inserciónes al inicio y al final tiene un order O(1) (muy rápido). Sin embargo,
          pude ser más lento recorrerlo que un array tradicional.

          Muy útil cuando hacemos muchas inserciónes o eliminaciónes en el medio porque
          no necesito desplazar los elementos.

          Inserciones al final:
          Los LinkedList son más eficientes que los ArrayList, ya que estos últimos tienes que
          crear un array de 10 pocisiones y despúes crear otro 50% más grande; esto es un costo de
          rendimiento.

          Acceder:
          El ArrayList es mucho más eficiente, poruqe podemos acceder de manera directa con el índice;
          mientras que con el LinkedList tenemos que ir recorriendo nodo por nodo (costo de rendimiento)..
         */
        LinkedList<String> cities = new LinkedList<>();
        cities.add("London");
        cities.add("Paris");
        cities.add("New York");
        cities.add("San Francisco");
        cities.add("California");

        cities.addFirst("Saltillo");
        cities.addLast("Montreal");

        // Obtener el primer nodo
        System.out.println(cities.getFirst());

        // Obtener el último nodo
        System.out.println(cities.getLast());

        // Actualizar el valor de un nodo en un índice específico
        cities.set(2, "Madrid");

        // Eliminar un nodo por su valor
        cities.remove("Madrid");

        // Podemos implementar una Queue o un Stack
        cities.removeFirst();
        cities.removeLast();

        // Busqueda
        String searchCity = "Madrid";
        if (cities.contains(searchCity)) {
            System.out.println("Encontamos a Madrid!");
        }

        // Recorrer el linked list
        for (String city : cities) {
            System.out.println("City: " + city);
        }

    }
}
