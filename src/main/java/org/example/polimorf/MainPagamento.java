package org.example.polimorf;

public class MainPagamento {

    public static void main(String[] args) {
        MeioDePagamento forma;

        forma = new Pix();
        forma.pagar(150.00);

        forma = new Boleto();
        forma.pagar(150.00);
    }
}
