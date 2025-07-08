package com.devtalles.datastructures.list;

import java.util.ArrayList;

public class Arrays {
    public static void execute() {
         /*
          Estamos apartando en memoria un array con 1000 poiscioines.
          Crea un arreglo de 1000 elmentos. Cuando el dato es int,
          se carga con puros ceros.
          Esto es un arreglo estático.
          Los arreglos estáticos son las más recomendables:
          1. Son más rápidas porque ya se sabe el tamaño.
          2. No tiene tantos metodos precargados como un arreglo dinámico.
          3. Cuando ocupamos programas donde nos preocupa el rendimiento.
         */
        int[] fixedArray = new int[1000];

        /*
          Este también es un arreglo estático, ya que no podemos
          agregar más espacio al arreglo del que ya tenemos.
         */
        Integer[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        // numbers[11] = 5; Esto marca error

        // Eliminar un index de un arreglo estático.
        Integer[] resultArray = _deleteByIndex(1, numbers);
        for(Integer number : resultArray) {
            System.out.println(number);
        }

        /*
          Esto es un arreglo dinámico porque no tenemos que decirle
          a java cuanto espacio debe de almacenar.
          Solamente vamos modificandolo conforme lo vamos necesitando.
          Aquí no sabemos cuantos datos vamos a almacenar.
         */
        ArrayList<Integer> dynamicArray = new ArrayList<>();
        dynamicArray.add(1);
        dynamicArray.add(2);
        dynamicArray.add(3);
        for(Integer number : dynamicArray) {
            // System.out.println(number);
        }

        /*
          primitiveNumbersArray y wrapperNumbersArray no es lo mismo.
          Cada una de estas se cargarán de forma distinta.
         */

        /*
          Cuando usamos un arreglo con tipos primitivos,
          los datos dentro del arreglo se cargan con cero.
         */
        int[] primitiveNumbersArray = new int[5];
        primitiveNumbersArray[0] = 10;
        primitiveNumbersArray[1] = 20;
        for(int number: primitiveNumbersArray) {
            // System.out.println(number);
        }

        /*
          Cuando usamos un arreglo con tipos wrapper,
          los datos dentro del arreglo se cargan con null.
          Podemos acceder a metodos de la clase wrapper.
         */
        Integer[] wrapperNumbersArray = new Integer[5];
        wrapperNumbersArray[0] = 10;
        wrapperNumbersArray[1] = 20;
        wrapperNumbersArray[2] = null;
        for(Integer number: wrapperNumbersArray) {
            // System.out.println(number);
        }
    }

    public static Integer[] _deleteByIndex(int index, Integer[] array) {
        /*
          Como podemos ver, tenemos que hacer muchos procesimientos para manipular
          arreglos estáticos.
         */
        for(int i = index; i < array.length - 1; i++) {
            array[i] = array[i + 1];
        }
        array[array.length - 1] = 0;
        return array;
    }
}
