package com.devtalles.datastructures.iterators;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorExample {
    public static void execute() {
        /*
           Arrays.asList("Pedro", "Jose", "Carlos");
           Esto genera una Lista inmutable.
           Para hacerla inmutable, tenemos que agregar el ArrayList al principio.
         */
        List<String> names = new ArrayList<>(Arrays.asList("Pedro", "Jose", "Carlos"));

        System.out.println("names = " + names);

        addName(names, "Fernando");
        readNames(names);

        updateName(names, "Gabriela", "Jose");
        readNames(names);

        removeName(names, "Pedro");
        readNames(names);
    }

    private static void addName(List<String> names, String newName) {
        /*
          ListIterator: Es una interfaz que sirve para recorrer una lista en ambos sentidos y
          poder modificar la lista sin excepciones mientras se recorre.
         */
        ListIterator<String> iterator = names.listIterator();

        while(iterator.hasNext()) {
            String name = iterator.next();
            if(name.equals("Pedro")) {
                /*
                  Sin problemas puedo usar el add porque estamos usando
                  la interfaz ListIterator
                 */
                iterator.add(newName);
                break;
            }
        }
    }

    private static void updateName(List<String> names, String newName, String oldName) {
        /*
          ListIterator: Es una interfaz que sirve para recorrer una lista en ambos sentidos y
          poder modificar la lista sin excepciones mientras se recorre.
         */
        ListIterator<String> iterator = names.listIterator();

        while(iterator.hasNext()) {
            if(iterator.next().equals(oldName)) {
                /*
                  Sin problemas puedo usar el update porque estamos usando
                  la interfaz ListIterator
                 */
                iterator.set(newName);
                break;
            }
        }
    }

    private static void removeName(List<String> names, String nameToDelete) {
        /*
          ListIterator: Es una interfaz que sirve para recorrer una lista en ambos sentidos y
          poder modificar la lista sin excepciones mientras se recorre.
         */
        ListIterator<String> iterator = names.listIterator();

        while(iterator.hasNext()) {
            String name = iterator.next();
            if(name.equals(nameToDelete)) {
                /*
                  Sin problemas puedo usar el remove porque estamos usando
                  la interfaz ListIterator
                 */
                iterator.remove();
                break;
            }
        }
    }

    private static void readNames(List<String> names) {
        ListIterator<String> iterator = names.listIterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next() + " ");
        }
        System.out.println();
    }
}
