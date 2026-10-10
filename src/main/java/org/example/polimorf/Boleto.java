package org.example.polimorf;

public class Boleto implements MeioDePagamento {

    @Override
    public void pagar(double valor) {
        System.out.printf("Boleto gerado no valor de R$ %.2f. Aguardando compensação bancária.\n", valor);
    }
}