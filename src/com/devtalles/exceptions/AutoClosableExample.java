package com.devtalles.exceptions;

import com.devtalles.exceptions.shared.FakeDataBaseConnection;

public class AutoClosableExample {
    public static void execute() {
        try(FakeDataBaseConnection connection = new FakeDataBaseConnection()) {
            connection.fetchData();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
