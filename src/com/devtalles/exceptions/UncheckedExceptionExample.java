package com.devtalles.exceptions;

import com.devtalles.exceptions.custom.NegativeBalanceException;
import com.devtalles.exceptions.shared.BankAccount;

public class UncheckedExceptionExample {
    public static void execute() {
        BankAccount bankAccount = new BankAccount(500);

        /*
          Con una excepción de tipo UnChecked, el editor no me obliga
          a utilizar un try-catch. No me lanza un error en tiempo de compilación.
         */
        try {
            /*
              En este caso me a arrojar un RuntimeException (UnChecked)
             */
            bankAccount.withdraw(600);
        } catch (NegativeBalanceException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Continuacion del programa ...");
    }
}
