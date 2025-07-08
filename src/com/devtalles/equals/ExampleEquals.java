package com.devtalles.equals;

public class ExampleEquals {
    public static void execute() {
        /*
          Equals: Permite comparar si un objeto es el mismo que le otro.
         */
        Integer numberA = 128; // Crea un nuevo HashCode
        Integer numberB = 128; // Crea un nuevo HashCode

        /*
          Estamos comprobando si estas direcciones de memoria son iguales.
          Java guarda la cache de enteros. Guarda un rango de numeros enteros (Integer).
          Integer -> -128 a 127 Esto es lo único que mantiene el cache de Java.
          Si tu pones un number arriba o abajo de ese rango, te retorna false.
          Pero si ambos numeros estan en el rango, entonces retrona true.

          ¿Por qué se guardan los valos de -128 a 127?
          Porque son los más usados en la mayoría de los programas.
         */
        System.out.println(numberA == numberB); // false

        /*
          Aquí estamos utilizando dos números que están en el rango entre -128 y 127 y ambos son iguales.
          Nos returna: true
         */
        Integer numberC = 100;
        Integer numberD = 100;
        System.out.println(numberC == numberD); // true

         /*
          Aquí estamos utilizando dos números que están en el rango de -128 y 127,pero tienen valores diferentes.
          Nos returna: false.
         */
        Integer numberF = 90;
        Integer numberG = 98;
        System.out.println(numberF == numberG); // false

        /*
          Aquí lo que comparamos es el dato almacenado directamente.
         */
        System.out.println(numberA.equals(numberB)); // true

        /*
          1. personA y personB no tienen la misma dirección de memoria.
          2. Sabemos que el objeto que obtenemos como parámetro en el equals() no es nulo y
          sabemos que ambos objetos pasados en el equals() son del mismo tipo.
          3. La propiedad name de los objetos son iguales. Es por esto que retorna true.
         */
        Person personA = new Person("A"); // Dirección de memoria diferente
        Person personB = new Person("A"); // Dirección de memoria diferente

        System.out.println(personA.equals(personB)); // true
    }
}


