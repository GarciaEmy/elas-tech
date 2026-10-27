package org.example.observer;

import java.util.ArrayList;
import java.util.List;

class Estoque {
    private List<ObservadorEstoque> observadores = new ArrayList<>();
    private int quantidade;

    public void adicionarObservador(ObservadorEstoque o) {
        observadores.add(o);
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
        notificarObservadores();
    }

    private void notificarObservadores() {
        for (ObservadorEstoque o : observadores) {
            o.atualizar(this.quantidade);
        }
    }
}
