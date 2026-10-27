package org.example.observer;

public class MainAeroporto {
    public static void main(String[] args) {
        Voo meuVoo = new Voo();

        Passageiro passageiro = new Passageiro();
        PainelAeroporto painel = new PainelAeroporto();

        meuVoo.adicionarObservador(passageiro);
        meuVoo.adicionarObservador(painel);

        meuVoo.mudarStatus("Atrasado");
    }
}