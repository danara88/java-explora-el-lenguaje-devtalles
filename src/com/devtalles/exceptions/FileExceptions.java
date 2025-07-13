package com.devtalles.exceptions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileExceptions {
    public static void execute() {
        String url = "src/com/devtalles/exceptions/shared/example.txt";
        BufferedReader reader = null;
        try {
            // Permite leer caracteres de un archivo
            FileReader file = new FileReader(url);

            // Buffer: Zona de memoria temporal que se utiliza para almacenar datos mientras se están
            // transfiriendo de un lugar a otro.
            // Mejora la eficiencia de la lectura, permitiendo leer las líneas completas del archivo.
            reader = new BufferedReader(file);

            // Tenemos que leer el archivo línea por línea
            // Si hay un error en la lectura, readLine me va a lanzar una excepción IOException
            String line = reader.readLine();
            while(line != null) {
                System.out.println(line);
                line = reader.readLine();
            }

            // Liberamos los recursos
            // CUIDADO: Esto no se va a ejecutar si ocurre un error.
            // reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("Error reading file");
        } finally {
            try {
                if(reader != null) {
                    reader.close();
                    System.out.println("File closed");
                }
            } catch (IOException e) {
                System.out.println("Error closing file");
            }
        }
    }
}
