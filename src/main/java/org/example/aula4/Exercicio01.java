package org.example.aula4;

///
public class Exercicio01 {

    static void main(String[] args) {

        double saldo = 500;
        double compra = 501;

        if (saldo >= compra) {
            double restante = saldo - compra;
            System.out.printf("Compra aprovada! Saldo restante: R$ %.2f\n", restante);
        } else {
            double faltando = compra - saldo;
            System.out.printf("Saldo insuficiente. Está faltando: R$ %.2f\n", faltando);


        }
    }

}
