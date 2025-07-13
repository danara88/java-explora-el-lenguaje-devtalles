package com.devtalles.exceptions.project.services;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * In charge of helping with UI logic
 */
public class UiService {
    private final Map<Integer, String> menuOptions = new HashMap<>();
    private final static String defaultPromptLabel = "  ->  ";
    private static final String ANSI_RED = "\u001B[31m";
    private static final String ANSI_RESET = "\u001B[0m";

    /**
     * Represents the main constructor.
     */
    public UiService() {
        configureMenuOptions();
    }

    /**
     * Add all available system use cases.
     */
    private void configureMenuOptions() {
        menuOptions.put(1, "Registrar estudiante");
        menuOptions.put(2, "Eliminar estudiante");
        menuOptions.put(3, "Listar estudiantes");
        menuOptions.put(4, "Salir");
    }

    /**
     * In charge of printing system UI errors.
     * @param errorMessage represents the error message
     */
    public static void printSystemError(String errorMessage) {
        System.out.println(ANSI_RED + "Error de validacion: " + errorMessage + ANSI_RESET);
    }

    /**
     * Print the menu system.
     */
    public void printMenu() {
        System.out.println();
        System.out.println("Menu:");
        menuOptions.forEach((key, value) -> {
            System.out.println(key + ". " + value);
        });
        System.out.println();
    }

    /**
     * Captures user prompt (string).
     * @return the input data from user on string format
     */
    public static String inputString(String label) {
        System.out.println(label + defaultPromptLabel);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    /**
     * Captures user prompt (int).
     * @return the input data from user on integer format
     */
    public static Integer inputInteger(String label) {
        System.out.println(label + defaultPromptLabel);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    /**
     * Captures user prompt (byte).
     * @return the input data from user on byte format
     */
    public static byte inputByte(String label) {
        System.out.println(label + defaultPromptLabel);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextByte();
    }
}
