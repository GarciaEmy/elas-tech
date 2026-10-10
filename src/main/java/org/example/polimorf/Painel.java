package org.example.polimorf;

import java.awt.event.PaintEvent;

public class Painel {
    public void exibir(String texto) {
        System.out.println("Recebeu uma String " + texto);
    }
    public void exibir (int numeroInteiro){
        System.out.println("Recebeu um int " + numeroInteiro);
    }
    public void exibir (boolean valorLogico) {
        System.out.println("Recebeu um boolean(Verdadeiro ou Falso " + valorLogico);
    }
    public void exibir (double numeroDeciamal) {
        System.out.println("Recebeu um double " + numeroDeciamal);
    }

    static void main(String[] args) {
        Painel painel = new Painel();

        painel.exibir("Olá");
        painel.exibir(2026);
        painel.exibir(true);
        painel.exibir(99.66);

    }
}
