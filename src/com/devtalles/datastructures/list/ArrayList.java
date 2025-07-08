package com.devtalles.datastructures.list;

import java.util.List;

public class ArrayList {
    public static void execute() {
        /*
          List: Representa una colección ordenada de elementos y pueden crecer de manera dinámica.
          ArrayList es una clase que implementa la interfaz List.
          Siempre es mejor usarlo desde la clase asbtracta List para usar las ventjas del polimorfismo.

          La primera vez que creamos el ArrayList, automaticamente se crean 10 posiciones en el arreglo.
          Sí nos pasamos de esas 10 posiciones, se créa otro arreglo un 50% más grande, copiando
          los datos.
         */
        List<String> students = new java.util.ArrayList<>();
        students.add("John");
        students.add("Jane");
        students.add("Julie");
        System.out.println(students);

        // Obtiene el primer elemento O(1)
        System.out.println(students.getFirst());

        // Obtiene el valor del segundo índice elemento O(1)
        System.out.println(students.get(2));

        // Puedo eliminar usando el index O(n)
        students.remove(1);

        // Puedo eliminar usando el valor O(n)
        students.remove("Julie");
        System.out.println(students);

        // Puedo actualizar el valor en un index específico O(1)
        students.set(0, "Marcelo");
        System.out.println(students);

        // Podemos agregar un valor en un index especificado
        // O(n) ya que tiene que mover cada uno de los índices.
        students.add(1, "Fernanda");
        System.out.println(students);
    }
}
