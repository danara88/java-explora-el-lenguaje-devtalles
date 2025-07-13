package com.devtalles.datastructures.map;

import com.devtalles.datastructures.shared.Product;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapDataStructure {
    public static void execute() {
        Map<String, Double> productPrices = new TreeMap<>();

        // Agregar un elemento a un map
        productPrices.put("Manzana", 8.45);
        productPrices.put("Banana", 10.25);
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
          Utilizando una clase personalizada.
         */
        Map<Product, Double> priceMap = new TreeMap<>();
        priceMap.put(new Product(12, "banana"), 78.92);
        priceMap.put(new Product(4, "uva"), 100.00);
        priceMap.put(new Product(98, "manzana"), 67.56);

        System.out.println(priceMap);

        // eliminar
        priceMap.remove(new Product(12, "banana"));

        // actualizar
        priceMap.put(new Product(4, "uva"), 200.78);

        System.out.println(priceMap);
    }
}
