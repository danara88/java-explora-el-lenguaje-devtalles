package com.devtalles.datastructures.shared;

public class Product implements Comparable<Product> {
    private int id;
    private String name;

    public Product(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Product {" +
                "id=" + id + '\'' +
                ", name=" + name + '\'' +
                '}';

    }

    @Override
    public int compareTo(Product o) {
        // Compara y ordena usando el id
        return Integer.compare(this.id, o.id);
    }
}
