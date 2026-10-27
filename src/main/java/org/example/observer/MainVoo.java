package org.example.observer;

public class MainVoo {
    public static void main(String[] args) {
        Voo meuVoo = new Voo();
        Passageiro passageiro = new Passageiro();

        meuVoo.adicionarObservador(passageiro);
        meuVoo.mudarStatus("Embarque iniciado");
    }
}
