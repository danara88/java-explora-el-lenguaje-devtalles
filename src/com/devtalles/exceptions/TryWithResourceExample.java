package com.devtalles.exceptions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResourceExample {
    public static void execute() {
        String url = "src/com/devtalles/exceptions/shared/example.txt";
        try (BufferedReader reader = new BufferedReader(new FileReader(url))) {
            /*
              Cuando delcaramos un reader dentro de este bloque, se cierra el archivo
              automaticamente, sin necesidad de cerrarlo manualmente.
             */
            String line = reader.readLine();
            while(line != null) {
                System.out.println(line);
                line = reader.readLine();
            }
        } catch (FileNotFoundException e) {
            System.out.println("El archivo no fue encontrado");
        } catch (IOException e) {
            System.out.println("Error reading file");
        }
    }
}
