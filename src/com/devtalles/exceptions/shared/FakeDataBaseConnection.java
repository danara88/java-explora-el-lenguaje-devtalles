package com.devtalles.exceptions.shared;

/**
 * AutoClosable: Todas las clases que implementen esta interfaz,
 * puden utilizar try-with-resources.
 */
public class FakeDataBaseConnection implements AutoCloseable {

    public FakeDataBaseConnection() {
        System.out.println("Connected to database");
    }

    public void fetchData() {
        System.out.println("Fetching data from database");
    }

    @Override
    public void close() throws Exception {
        System.out.println("Connection closed");
    }
}
