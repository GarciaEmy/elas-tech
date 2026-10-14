package org.example.aula15;

public class MainBancario {
    static void main(String[] args) {
        ContaBancaria cb = new ContaBancaria();

        System.out.println("Titular: " + cb.getTitular());
        cb.depositar(500);
        System.out.println("Saldo: " + cb.getSaldo());

        cb.depositar(-100);
        cb.sacar(2000);
        cb.sacar(200);

        System.out.println("Saldo: " + cb.getSaldo());




    }

}
