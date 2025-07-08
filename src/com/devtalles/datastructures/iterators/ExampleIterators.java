package com.devtalles.datastructures.iterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ExampleIterators {
    public static void execute() {
        /*
          Iterator: Es un objeto en Java que permite recorrer una coleccion secuencialmente
          sin exponer su estructura interna.
         */
        List<String> names = new ArrayList<>();
        names.add("Ana");
        names.add("Juan");
        names.add("Maria");
        names.add("Pedro");
        names.add("Jose");
        names.add("Carlos");

        /*
          Utilizando el foreach tradicional.
          El foreach no soporta modificaciones mientras recorre la colección.
         */
//        for(String name: names) {
//            if(name.startsWith("A") || name.startsWith("C")){
//                // Esto retorn un exception. (CurrentModificationException)
//                // Esto es debido a que estamos modificando una lista mientas
//                // se recorre con un iterador.
//                // Significa que el iterador no está al tanto del cambio.
//                names.remove(name);
//            }
//        }

        /*
          Solucion: Utilizar directamente un iterador.
          ListIterator: Es una interfaz que sirve para recorrer una lista en ambos sentidos y
          poder modificar la lista sin excepciones mientras se recorre.
         */
        Iterator<String> iterator = names.iterator();
        while(iterator.hasNext()) {
            String name = iterator.next();
            if(name.startsWith("A") || name.startsWith("C")) {
                // names.remove() Esto es mala práctica y no funciona
                iterator.remove(); // Esta es buena práctica
            }
        }
        System.out.println(names);
    }
}
