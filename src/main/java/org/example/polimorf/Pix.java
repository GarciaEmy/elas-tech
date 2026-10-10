package org.example.polimorf;

public class Pix implements MeioDePagamento {

    @Override
    public void pagar(double valor) {
        System.out.printf("Pagamento via PIX no valor de R$ %.2f realizado instantaneamente!\n", valor);
    }
}
