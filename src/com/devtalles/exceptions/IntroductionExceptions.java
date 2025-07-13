package com.devtalles.exceptions;

public class IntroductionExceptions {
    public static void execute() {
        /*
          Esto va a disparar una excepción.
          Aquí el programa se termina.
          int result = 10 / 0;

          Son eventos que ocurren durante la ejecución del programa y que
          interrumpen el flujo normal del código.

          Las excepciones son diferentes de los errores.
          Las excepciones pueden ser controladas por el programador.
         */

        try {
            // Código vulnerable que tiene probabilidad de retornar una exception
            int result = 10 / 0;
            System.out.println(result);
        } catch (ArithmeticException e) {
            // Aquí atrapamos la excepción
            System.out.println("ERROR: división por cero");
        } catch (Exception e) {
            // Aquí atrapamos la excepción
            System.out.println("ERROR: " + e.getMessage());
        } finally {
            // Este bloque siempre se ejecuta
            System.out.println("FINALLY!");
        }
    }
}
