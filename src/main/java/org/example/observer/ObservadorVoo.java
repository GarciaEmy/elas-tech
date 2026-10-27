package org.example.observer;

import java.util.ArrayList;
import java.util.List;

interface ObservadorVoo {
    void atualizar(String status);
}

class Passageiro implements ObservadorVoo {
    @Override
    public void atualizar(String status) {
        System.out.println("Passageiro avisado: " + status);
    }
}
class Voo {
    private List<ObservadorVoo> observadores = new ArrayList<>();

    public void adicionarObservador(ObservadorVoo o) {
        observadores.add(o);
    }

    public void mudarStatus(String status) {
        System.out.println("Status do Voo mudou para: " + status + "");
        for (ObservadorVoo o : observadores) {
            o.atualizar(status);
        }
    }
}


