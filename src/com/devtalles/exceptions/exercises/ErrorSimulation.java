package com.devtalles.exceptions.exercises;

public class ErrorSimulation {
    public static void execute() {
        try {
            simulateError();
        } catch (RuntimeException e) {
            System.out.println("Se detectó un error!");
            System.out.println("Mensaje: " + e.getMessage());
           e.printStackTrace();
        }
    }

    private static void simulateError() {
        causeError();
    }

    private static void causeError() {
        throw new MyCustomException("Se ha producido un error critico");
    }
}
