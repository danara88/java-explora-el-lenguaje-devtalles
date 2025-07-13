package com.devtalles.exceptions.shared;

import com.devtalles.exceptions.custom.NegativeBalanceException;

public class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void withdraw(double amount) {
        if(amount > balance) {
            /*
              Lanazar un UnCheckException.
              Aquí no me pide que el metodo se firme con el throws (lanzar la exception)
             */
            throw new NegativeBalanceException("Fondos insuficientes.");
        }
        balance -= amount;
        System.out.println("Extracción exitosa.");
    }
}
