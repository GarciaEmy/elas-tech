package org.example.observer;

import java.util.ArrayList;
import java.util.List;

interface ObservadorEstoque {
    void atualizar(int quantidade);
}

class RegistroEstoque implements ObservadorEstoque {
    @Override
    public void atualizar(int quantidade) {
        System.out.println("Nova quantidade: " + quantidade);
    }
}