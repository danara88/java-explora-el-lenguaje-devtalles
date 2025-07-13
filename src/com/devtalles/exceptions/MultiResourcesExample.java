package com.devtalles.exceptions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MultiResourcesExample {
    public static void execute() {
        String url = "src/com/devtalles/exceptions/shared/example.txt";
        String url2 = "src/com/devtalles/exceptions/shared/example2.txt";

        try (
                // recurso 1
                BufferedReader reader = new BufferedReader(new FileReader(url));

                // recurso 2
                BufferedReader reader2 = new BufferedReader(new FileReader(url2));
        ) {
            /*
              Cuando delcaramos un reader dentro de este bloque, se cierra el archivo
              automaticamente, sin necesidad de cerrarlo manualmente.
             */
            String line = reader.readLine();
            while(line != null) {
                System.out.println(line);
                line = reader.readLine();
            }

            System.out.println("Reader 2");

            String line2 = reader2.readLine();
            while(line2 != null) {
                System.out.println(line2);
                line2 = reader.readLine();
            }
        } catch (FileNotFoundException e) {
            System.out.println("El archivo no fue encontrado");
        } catch (IOException e) {
            StackTraceElement[] stack = e.getStackTrace();

            for(StackTraceElement stackTraceElement : stack) {
                System.out.println(stackTraceElement);
                System.out.println("Clase: " + stackTraceElement.getClassName());
                System.out.println("Metodo: " + stackTraceElement.getMethodName());
                System.out.println("Archivo: " + stackTraceElement.getFileName());
                System.out.println("Line: " + stackTraceElement.getLineNumber());
            }

            System.out.println("Error reading file");
        }
    }
}
